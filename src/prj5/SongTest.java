/**
 * 
 */
package prj5;

import student.TestCase;

/**
 * Test for song class
 * 
 * @author dylan Hitt dylanh6
 * @version Nov 16, 2017
 *
 */
public class SongTest extends TestCase {
    
    private Song whiteRoom;
    
    /**
     * setUp method for 
     */
    public void setUp() {
        whiteRoom = new Song("White Room", "Cream", 1968, "Rock");
    }
    /**
     * test method for getName
     */
    public void testGetName() {
        assertEquals("White Room", whiteRoom.getName());
    }
    /**
     * test for getArtist
     */
    public void testGetArtist() {
        assertEquals("Cream", whiteRoom.getArtist());
    }
    /**
     * test for getYear
     */
    public void testGetYear() {
        assertEquals(1968, whiteRoom.getYear());
    }    
    /**
     * test for getGenre
     */
    public void testGetGenre() {
        assertEquals("Rock", whiteRoom.getGenre());
    }
    
    public void testToString() {
        String myString = "White Room by Cream, Year: 1968, Genre: Rock";
        
        assertEquals(myString, whiteRoom.toString());
    }
}
