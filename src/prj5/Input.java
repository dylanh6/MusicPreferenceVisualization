/**
 * 
 */
package prj5;

import java.io.FileNotFoundException;

/**
 * Runs the the main method for the program
 * 
 * @author dylan hitt dylanh6
 * @version Nov 16, 2017
 *
 */
public class Input {
    /**
     * Main method for the program
     * 
     * @param args
     *            command line argumentss
     * @throws Exception
     */
    public static void main(String[] args) {

<<<<<<< HEAD
<<<<<<< HEAD
        FileReader p = new FileReader("SongListTest1.csv",
            "MusicSurveyDataTest1.csv");

        SinglyLinkedList<Song> test = p.getSongList();

        SinglyLinkedList<Person> personTest = p.getPersonList();

        System.out.println(test.remove(1).getName());

        System.out.println(personTest.remove(1).getIdNum());

        GUIDisplayWindow window = new GUIDisplayWindow();
=======
        if (args.length == 1) {
            FileReader fileIn = new FileReader(args[0], args[1]);
=======
        try {
            FileReader fileIn = new FileReader(args[1], args[0]);
>>>>>>> 09f32e1346e5b5f25130fc3e68b3440222bcf004
            Analyzer a = new Analyzer(fileIn.getPersonList(), fileIn.getSongList());
            a.representationCount(fileIn.getPersonList(), fileIn.getSongList());

            SongList thisList = fileIn.getSongList();

            thisList.sortBy(SortEnum.GENRE);

            String outputGenre = thisList.outPutStringHobby();

            thisList.sortBy(SortEnum.TITLE);

            String outputTitle = thisList.outPutStringHobby();

            System.out.print(outputGenre + outputTitle);

            FileReader f = new FileReader("SongListNoGenreRepeats.csv", "MusicSurveyDataNoGenreRepeats.csv");

            Analyzer h = new Analyzer(f.getPersonList(), f.getSongList());

            h.representationCount(f.getPersonList(), f.getSongList());

            SongList newList = f.getSongList();

<<<<<<< HEAD
            int i = 0;
        }
>>>>>>> 81d325ce6bb683a589771e9783d7e0e2e616ea84
=======
            newList.sortBy(SortEnum.GENRE);

            String genre = newList.outPutStringHobby();

            newList.sortBy(SortEnum.TITLE);
>>>>>>> 09f32e1346e5b5f25130fc3e68b3440222bcf004

            String title = newList.outPutStringHobby();

            //System.out.println(genre + title);
        } catch (Exception e) {
            System.out.print(e);

            // for (int i = 1; i < personTest.getLength() - 1; i++) {
            // System.out.println(personTest.remove(i).getIdNum());
            // }

        }
    }
}
