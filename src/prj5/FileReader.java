/**
 * 
 */
package prj5;

import java.io.File;
import java.util.Scanner;

/**
 * FileReader class class that reads the input files and stores the objects
 * 
 * @author dylan hitt dylan6
 * @version Nov 16, 2017
 *
 */
public class FileReader {
    
    private ArrayList<Song> songList;
    private Person[] personArray;
    
    public FileReader(String songFile) throws Exception {
        songList = this.songReader(songFile);
    }
    
    public ArrayList<Song> songReader(String songFile) throws Exception {
        ArrayList<Song> localList = new ArrayList<Song>();
        Scanner in = new Scanner(new File(songFile));
        
        in.nextLine();
        
        while (in.hasNextLine()) {
            String line = in.nextLine();
            
            String[] split = line.split(" *, *");
            
            String songName = split[0];          
            String artistName = split[1];
            int year = Integer.parseInt(split[2]);
            String genre = split[3];
            
            Song localSong = new Song(songName, artistName, year, genre);
            
            localList.add(localSong);
            
        }
        in.close();
        
        return localList;
    }
    
    public ArrayList<Song> getList() {
        return songList;
    }
}
