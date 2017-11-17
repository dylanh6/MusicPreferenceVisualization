/**
 * 
 */
package prj5;

/**
 * test for analyzer
 * 
 * @author dylan hitt dylanh6
 * @version nov 16, 2017
 *
 */
public class AnalyzerTest {
    private Analyzer an;
    /**
     * setup method
     */
    public void setUp() {
        SongList s = new SongList();
        SinglyLinkedList<Person> p = new SinglyLinkedList<Person>();
        
        
        an = new Analyzer(p, s);     
        
    }
}
