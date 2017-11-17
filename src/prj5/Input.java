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

        try {
            FileReader fileIn = new FileReader(args[1], args[0]);
            Analyzer a = new Analyzer(fileIn.getPersonList(), fileIn.getSongList());
            a.representationCount(fileIn.getPersonList(), fileIn.getSongList());

            SongList thisList = fileIn.getSongList();

            thisList.sortBy(SortEnum.GENRE);

            String outputGenre = a.outPutStringHobby();

            thisList.sortBy(SortEnum.TITLE);

            String outputTitle = a.outPutStringHobby();

            System.out.print(outputGenre + outputTitle);

            FileReader f = new FileReader("SongListTest2.csv", "MusicSurveyDataTest2.csv");

            Analyzer h = new Analyzer(f.getPersonList(), f.getSongList());

            h.representationCount(f.getPersonList(), f.getSongList());

            SongList newList = f.getSongList();

            newList.sortBy(SortEnum.GENRE);

            String genre = newList.outPutStringHobby();

            newList.sortBy(SortEnum.TITLE);

            String title = newList.outPutStringHobby();

            // System.out.println(genre + title);
        } catch (Exception e) {
            System.out.print(e);

            // for (int i = 1; i < personTest.getLength() - 1; i++) {
            // System.out.println(personTest.remove(i).getIdNum());
            // }

        }
    }
}
