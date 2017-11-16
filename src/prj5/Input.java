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
    public static void main(String[] args) throws Exception {

        if (args.length == 1) {
            FileReader fileIn = new FileReader(args[0], args[1]);
            Analyzer a = new Analyzer(fileIn.getPersonList(), fileIn.getSongList());
            a.representationCount(fileIn.getPersonList(), fileIn.getSongList());
            System.out.println(a.outPutStringHobby());
        }
        else {

            FileReader f = new FileReader("SongListTest1.csv", "MusicSurveyDataTest1.csv");
            
            Analyzer h = new Analyzer(f.getPersonList(), f.getSongList());

            h.representationCount(f.getPersonList(), f.getSongList());

            System.out.println(h.outPutStringHobby());

            int i = 0;
        }

        // for (int i = 1; i < personTest.getLength() - 1; i++) {
        // System.out.println(personTest.remove(i).getIdNum());
        // }

    }
}
