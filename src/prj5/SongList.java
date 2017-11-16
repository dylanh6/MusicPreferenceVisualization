package prj5;

import java.util.Comparator;

/**
 * 
 * @author Ian Connerney (Ianco)
 * @version 2017.11.16
 */
public class SongList extends SinglyLinkedList<Song>{
    
    /**
     * constructor
     */
    public SongList() {
        super();
    }
    
    /**
     * sorts by 
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
    
    private void insertInOrder(Node<Song> nodeToInsert, Comparator<Song> comparer) {
        Song item = nodeToInsert.getData();
        Node<Song> currentNode = head;
        Node<Song> previousNode = null;
        
        while ((currentNode != null) && (comparer.compare(item,currentNode.getData())>0)) {
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

    
    
}
