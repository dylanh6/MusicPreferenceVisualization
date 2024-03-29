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
     *            command line argumentss
     * @throws Exception
     */
    public static void main(String[] args) {

        try {
            
            if (args.length == 2) {
                
                GUIDisplayWindow c = new GUIDisplayWindow(args[1], args[0]);
            
                FileReader fileIn = new FileReader(args[1], args[0]);
                Analyzer a = new Analyzer();
                a.representationCount(fileIn.getPersonList(), fileIn.getSongList());
                SongList thisList = fileIn.getSongList();
                thisList.sortBy(SortEnum.GENRE);
                String outputGenre = thisList.outPutStringHobby();
                thisList.sortBy(SortEnum.TITLE);
                String outputTitle = thisList.outPutStringHobby();
                System.out.print(outputGenre + outputTitle);
            
            }
            else {
                
                GUIDisplayWindow b = new GUIDisplayWindow("SongList2017F.csv", "MusicSurveyData2017F.csv");
                
                FileReader f = new FileReader("SongListNoGenreRepeats.csv", "MusicSurveyDataNoGenreRepeats.csv");
                Analyzer h = new Analyzer();
                h.representationCount(f.getPersonList(), f.getSongList());
                SongList newList = f.getSongList();
                newList.sortBy(SortEnum.GENRE);
                String genre = newList.outPutStringHobby();
                newList.sortBy(SortEnum.TITLE);
                String title = newList.outPutStringHobby();
                System.out.println(genre + title);
            }
        } 
        catch (Exception e) {
            System.out.print(e);
        }
    }
}
