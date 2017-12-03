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
     * @param sortBy
     *            the desired input
     */
    public void sortBy(SortEnum sortBy) {

        Comparator<Song> comparer;
        if (sortBy == SortEnum.TITLE) {
            comparer = new CompareByTitle();
            insertionSort(comparer);

        }
        else if (sortBy == SortEnum.ARTIST) {
            comparer = new CompareByArtist();
            insertionSort(comparer);
        }
        else if (sortBy == SortEnum.GENRE) {
            comparer = new CompareByGenre();
            insertionSort(comparer);
        }
        else if (sortBy == SortEnum.YEAR) {
            comparer = new CompareByYear();
            insertionSort(comparer);
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

            Node<Song> unsortedPart = head.next();

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
    private void insertInOrder(Node<Song> nodeToInsert, Comparator<Song> comparer) {
        Song item = nodeToInsert.getData();
        Node<Song> currentNode = head;
        Node<Song> previousNode = null;

        while ((currentNode != null) && (comparer.compare(item, currentNode.getData()) > 0)) {
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

    /**
     * represents hobby as a string
     * 
     * @return returns a String
     */
    public String outPutStringHobby() {
        StringBuilder build = new StringBuilder();

        for (int i = 0; i < this.size(); i++) {
            Song localSong = this.get(i);
            int[] data = localSong.getResponses();

            build.append("song title " + localSong.getName() + "\n");
            build.append("song artist " + localSong.getArtist() + "\n");
            build.append("song genre " + localSong.getGenre() + "\n");
            build.append("song " + "year " + String.valueOf(localSong.getYear()) + "\n");
            build.append("heard\n");

            build.append("reading" + String.valueOf(divide(data[1], data[0])));

            int top2 = data[8];
            int bottom2 = data[9];
            int a = divide(bottom2, top2);

            build.append(" art" + String.valueOf(a));

            build.append(" sports" + String.valueOf(divide(data[5], data[4])));
            build.append(" music" + String.valueOf(divide(data[13], data[12])) + "\n");
            build.append("likes\n");
            build.append("reading" + String.valueOf(divide(data[3], data[2])));
            build.append(" art" + String.valueOf(divide(data[11], data[10])));
            build.append(" sports" + String.valueOf(divide(data[7], data[6])));

            int top = data[14];
            int bottom = data[15];

            int y = divide(bottom, top);
            build.append(" music" + String.valueOf(y) + "\n\n");
        }

        return build.toString();
    }
    /**
     * method used to get the percentage outputs for the desired rep
     * @param rep how to represent the date
     * @param song song that the calculation are being done on
     * @return returns the percentages as an array
     */
    public int[] representOutput(RepresentEnum rep, Song song) {
        
        int[] data = song.getResponses();
        
        int[] tempArray = new int[data.length / 2];
        int[] retArray = new int[8];
        int counter = 0;    
        for (int i = 1; i < data.length; i += 2) {         
            tempArray[counter] = divide(data[i], data[i - 1]);          
            counter++;
        }
        
        if (rep == RepresentEnum.HOBBY) {
            retArray[0] = tempArray[0];
            retArray[1] = tempArray[1];
            retArray[2] = tempArray[4];
            retArray[3] = tempArray[5];
            retArray[4] = tempArray[2];
            retArray[5] = tempArray[3];
            retArray[6] = tempArray[6];
            retArray[7] = tempArray[7];
        }

        if (rep == RepresentEnum.MAJOR) {
            retArray[0] = tempArray[8];
            retArray[1] = tempArray[9];
            retArray[2] = tempArray[12];
            retArray[3] = tempArray[13];
            retArray[4] = tempArray[10];
            retArray[5] = tempArray[11];
            retArray[6] = tempArray[14];
            retArray[7] = tempArray[15];
        }
        
        if (rep == RepresentEnum.REGION) {
            retArray[0] = tempArray[16];
            retArray[1] = tempArray[17];
            retArray[2] = tempArray[18];
            retArray[3] = tempArray[19];
            retArray[4] = tempArray[20];
            retArray[5] = tempArray[21];
            retArray[6] = tempArray[22];
            retArray[7] = tempArray[23];
        }

        return retArray;

    }

    /**
     * divides two numbers
     * 
     * @param bottom
     *            denominator
     * @param top
     *            numerator
     * @return returns an integer
     */
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
