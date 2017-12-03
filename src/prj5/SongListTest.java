package prj5;


import java.util.Arrays;

import student.TestCase;
/**
 * 
 * @author Ian Connerney (Ianco)
 * @version 2017.11.16
 */
public class SongListTest extends TestCase {
    
    private SongList songs;


    /**
     * sets up test cases
     */
    public void setUp() {
        songs = new SongList();
    }

    /**
     * tests sortBy method
     */
    public void testsortBy() {
        Song song1 = new Song("Adam", "A", 2014, "Bravo");
        Song song2 = new Song("Bravo", "B", 2011, "Delta");
        Song song3 = new Song("Charlie", "C", 2013, "Alpha");
        Song song4 = new Song("Delta", "D", 2012, "Charlie");
        songs.add(song4);
        songs.add(song2); 
        songs.add(song1); 
        songs.add(song3);
        
        SongList a = new SongList();

        assertEquals(songs.get(0), song4); 
        assertEquals(songs.get(3), song3);

        songs.sortBy(SortEnum.TITLE);

        assertEquals(songs.get(0), song1);
        assertEquals(songs.get(3), song4);

        songs.sortBy(SortEnum.GENRE);

        assertEquals(songs.get(0), song3);
        assertEquals(songs.get(3), song2);

        songs.sortBy(SortEnum.ARTIST);
        assertEquals(songs.get(0), song1);
        assertEquals(songs.get(3), song4);
        
        songs.sortBy(SortEnum.YEAR);
        assertEquals(songs.get(0), song2);
        assertEquals(songs.get(3), song1);
     
        a.sortBy(SortEnum.TITLE);
   
    }
    /**
     * tests divide method
     */
    public void testdivide() {
        assertEquals(95, songs.divide(100, 95));
        assertEquals(0, songs.divide(0, 95));

    }
    
    public void testRepresentOutput() {
        int[] test = new int[8];
        for (int i = 0; i < 8; i++) {
            test[i] = 100;
        }
        
        
        songs = new SongList();
        
        int[] g = new int[48];
        
        for (int i = 0; i < 46; i ++) {
            g[i] = 1;
        }
        g[46] = 1;
        g[47] = 2;
        
        Song testSong = new Song("me", "adele", 2010, "delta");
        testSong.setResponseArray(g);
        
        assertTrue(Arrays.equals(test, songs.representOutput(RepresentEnum.HOBBY, testSong)));
        
        assertTrue(Arrays.equals(test, songs.representOutput(RepresentEnum.MAJOR, testSong)));
        test[7] = 50;
        assertTrue(Arrays.equals(test, songs.representOutput(RepresentEnum.REGION, testSong)));
    }
}
 