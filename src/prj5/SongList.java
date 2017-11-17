package prj5;

import java.util.Comparator;

/**
 * 
 * @author Ian Connerney (Ianco)
 * @version 2017.11.16
 */
public class SongList extends SinglyLinkedList<Song> {

    /**
     * constructor
     */
    public SongList() {
        super();
    }


    /**
     * sorts by
     * 
     * @param Enum
     */
    public void sortBy(SortEnum sortBy) {

        Comparator<Song> comparer;
        if (sortBy == SortEnum.TITLE) {
            comparer = new CompareByTitle();
            insertionSort(comparer);

        }
        else if (sortBy == SortEnum.ARTIST) {

        }
        else if (sortBy == SortEnum.GENRE) {
            comparer = new CompareByGenre();
            insertionSort(comparer);
        }
        else if (sortBy == SortEnum.YEAR) {

        }
    }


    /**
     * sorts with given comparer
     * 
     * @param comparer
     *            Comparator to sort with
     */
    private void insertionSort(Comparator<Song> comparer) {
        if (size() > 1) {
            assert head != null;
            Node<Song> unsortedPart = head.next();
            assert unsortedPart != null;
            head.setNext(null);

            while (unsortedPart != null) {
                Node<Song> nodeToInsert = unsortedPart;
                unsortedPart = unsortedPart.next();
                insertInOrder(nodeToInsert, comparer);
            }

        }
    }


    /**
     * 
     * @param nodeToInsert
     *            current node
     * @param comparer
     *            Comparator of what to compare by
     */
    private void insertInOrder(
        Node<Song> nodeToInsert,
        Comparator<Song> comparer) {
        Song item = nodeToInsert.getData();
        Node<Song> currentNode = head;
        Node<Song> previousNode = null;

        while ((currentNode != null) && (comparer.compare(item, currentNode
            .getData()) > 0)) {
            previousNode = currentNode;
            currentNode = currentNode.next();
        }

        if (previousNode != null) {
            previousNode.setNext(nodeToInsert);
            nodeToInsert.setNext(currentNode);
        }
        else {
            nodeToInsert.setNext(head);
            head = nodeToInsert;
        }

    }
    
    public String outPutStringHobby() {
        StringBuilder build = new StringBuilder();
        
        int counter = 0;
        
        for (int i = 0; i < this.size(); i++) {
            Song localSong = this.get(i);
            int[] data = localSong.getResponses();
            
            build.append("song title " + localSong.getName() + "\n");
            build .append("song artist " + localSong.getArtist() + "\n");
            build.append("song genre " + localSong.getGenre() + "\n");
            build.append("song year " + String.valueOf(localSong.getYear()) + "\n");
            build.append("heard\n");       
                            
            build.append("reading" + String.valueOf(divide(data[1], data[0])));
            build.append(" art" + String.valueOf(divide(data[10], data[9])));
            
            build.append(" sports" + String.valueOf(divide(data[5], data[4])));
            build.append(" music" + String.valueOf(divide(data[13], data[12])) + "\n");
            build.append("likes\n");
            build.append("reading" + String.valueOf(divide(data[3], data[2])));
            build.append(" art" + String.valueOf(divide(data[11], data[10])));
            build.append(" sports" + String.valueOf(divide(data[7], data[6])));
            build.append(" music" + String.valueOf(divide(data[15], data[14])) + "\n\n");           
            
           
        }
        
        return build.toString();
        
    }
    
    public int divide(float bottom, float top) {
        float percentage = 0;
        
        if (bottom != 0) {
            percentage = (top / bottom) * 100;
            
        }
        else {
            percentage = 0;
        }
        
        int ret = (int) percentage;
        
        return ret;
    }

}
