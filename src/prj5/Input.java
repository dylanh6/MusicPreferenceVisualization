/**
 * 
 */
package prj5;

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
     *            command line arguments
     * @throws Exception
     */
    public static void main(String[] args) {


        FileReader p = new FileReader("SongListTest1.csv",
            "MusicSurveyDataTest1.csv");

        SinglyLinkedList<Song> test = p.getSongList();

        SinglyLinkedList<Person> personTest = p.getPersonList();
        
        personTest.rem

        System.out.println(personTest.get(index)
        System.out.println(personTest.remove(1).getIdNum());

        GUIDisplayWindow window = new GUIDisplayWindow();

        if (args.length == 1) {
            FileReader fileIn = new FileReader(args[0], args[1]);

        try {
            FileReader fileIn = new FileReader(args[1], args[0]);


            Analyzer a = new Analyzer(fileIn.getPersonList(), fileIn.getSongList());

            Analyzer a = new Analyzer();

            a.representationCount(fileIn.getPersonList(), fileIn.getSongList());

            SongList thisList = fileIn.getSongList();
 
            thisList.sortBy(SortEnum.GENRE);

            String outputGenre = thisList.outPutStringHobby();

            thisList.sortBy(SortEnum.TITLE);

            String outputTitle = thisList.outPutStringHobby();

            System.out.print(outputGenre + outputTitle);

            FileReader f = new FileReader("SongListNoGenreRepeats.csv", "MusicSurveyDataNoGenreRepeats.csv");

            Analyzer h = new Analyzer();

            h.representationCount(f.getPersonList(), f.getSongList());

            SongList newList = f.getSongList();

            int i = 0;
        }

            newList.sortBy(SortEnum.GENRE);

            String genre = newList.outPutStringHobby();

            newList.sortBy(SortEnum.TITLE);

            String title = newList.outPutStringHobby();

            //System.out.println(genre + title);
        } catch (Exception e) {
            System.out.print(e);


        }
    }
}
