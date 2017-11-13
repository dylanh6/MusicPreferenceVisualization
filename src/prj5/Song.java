/**
 * 
 */
package prj5;

/**
 * Song class for the program, class that creates the 
 * song objects
 * 
 * @author dylan hitt dylanh6
 * @version Nov 16, 2017
 */
public class Song {
    
    private String name;
    private String artist;
    private int year;
    private String genre;
    
    /**
     * constructor that sets up a new song
     * 
     * @param name accepts a string
     * @param artist accepts a string
     * @param year accepts and int
     * @param genre accepts a string
     * @param index accepts an int
     */
    public Song(String name, String artist, int year, String genre) {
        this.name = name;
        this.artist = artist;
        this.genre = genre;
        this.year = year;
                     
    }
    /**
     * gets the name field
     * @return returns name as string
     */
    public String getName() {
        return name;
    }
    /**
     * gets the Artist field
     * @return returns artist as string
     */
    public String getArtist() {
        return artist;
    }
    /**
     * gets the year number
     * @return returns number as an int
     */
    public int getYear() {
        return year;
    }
    /**
     * gets the genre as a string
     * @return returns genre as a string
     */
    public String getGenre() {
        return genre;
    }
    /**
     * toString method
     * @return returns string
     */
    public String toString() {
        StringBuilder builder = new StringBuilder();
        
        builder.append(this.getName());
        
        builder.append(" by " + this.getArtist() + ", ");
        builder.append("Year: " );
        builder.append(String.valueOf(this.getYear()));
        builder.append(", Genre: " + this.getGenre());
        
        return builder.toString();
    }
    
}
