package prj5;

import java.util.Comparator;

/**
 * 
 * @author Ian Connerney (Ianco)
 * @version 2017.12.03
 *
 */
public class CompareByArtist implements Comparator<Song> {

    /**
     * compare method
     * 
     * @Override
     * @param left first song to compare
     * @param right second song to compare
     * @return integer comparison
     */
    public int compare(Song left, Song right) {
        return left.getArtist().compareTo(right.getArtist());
    }

}
