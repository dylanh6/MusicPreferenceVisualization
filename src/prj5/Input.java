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
     * Main method for the prpgram
     * 
     * @param args
     *            command line arguments
     * @throws Exception 
     */
    public static void main(String[] args) throws Exception {
        
        FileReader p = new FileReader("SongList.txt");
      
        
        
        
        ArrayList<Song> test = p.getList();
        
        System.out.println(test.remove(1).getName());

    }
}
