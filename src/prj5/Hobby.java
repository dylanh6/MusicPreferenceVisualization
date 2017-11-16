/**
 * 
 */
package prj5;

/**
 * Class is just to simply store the heard hobby counts and the yes hobby counts
 * this object will be placed in each song
 * 
 * @author dylan hitt dylanh6
 * @version Nov 16, 2017
 *
 */
public class Hobby {
    private int readHeard;
    private int readYes;
    private int artHeard;
    private int artYes;
    private int sportHeard;
    private int sportYes;
    private int musicHeard;
    private int musicYes;
    
    public Hobby(int readHeard, int readYes, int artHeard, int artYes, 
            int sportHeard, int sportYes, int musicHeard, int musicYes) {
        this.readHeard = readHeard;
        this.readYes = readYes;
        this.artHeard = artHeard;
        this.artYes = artYes;
        this.sportHeard = sportHeard;
        this.sportYes = sportYes;
        this.musicHeard = musicHeard;
        this.musicYes = musicYes;
    }
    
}
