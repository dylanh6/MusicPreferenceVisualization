package prj5;

import java.util.Comparator;

/**
 * 
 * @author Ian Connerney (Ianco)
 * @version 2017.11.16
 *
 */
public class CompareByGenre implements Comparator<Song> {

    /**
     * compare method
     * 
     * @Override
     * @param Song left first song to compare
     * @param Song right second song to compare
     * @return integer comparison
     */
    public int compare(Song left, Song right) {
        return left.getGenre().compareTo(right.getGenre());
    }

}
