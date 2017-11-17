package prj5;

import student.TestCase;

public class SongListTest extends TestCase {

    SongList songs;


    public void setUp() {
        songs = new SongList();
    }


    public void testsortBy() {
        Song song1 = new Song("Adam", "Adele", 2010, "Bravo");
        Song song2 = new Song("Bravo", "Adele", 2010, "Delta");
        Song song3 = new Song("Charlie", "Adele", 2010, "Alpha");
        Song song4 = new Song("Delta", "Adele", 2010, "Charlie");
        songs.add(song4);
        songs.add(song2);
        songs.add(song1);
        songs.add(song3);

        assertEquals(songs.get(0), song4);
        assertEquals(songs.get(3), song3);

        songs.sortBy(SortEnum.TITLE);

        assertEquals(songs.get(0), song1);
        assertEquals(songs.get(3), song4);

        songs.sortBy(SortEnum.GENRE);

        assertEquals(songs.get(0), song3);
        assertEquals(songs.get(3), song2);

    }
}
