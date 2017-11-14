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
        
        FileReader p = new FileReader("SongListTest1.csv", "MusicSurveyDataTest1.csv");             
        
        ArrayList<Song> test = p.getSongList();
        
        ArrayList<Person> personTest = p.getPersonList();
        
        System.out.println(test.remove(1).getName());
        
        System.out.println(personTest.remove(1).getIdNum());
        
        //for (int i = 1; i < personTest.getLength() - 1; i++) {
          //  System.out.println(personTest.remove(i).getIdNum());
        //}

    }
}
