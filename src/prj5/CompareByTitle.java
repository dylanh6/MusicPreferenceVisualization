package prj5;
import java.util.Comparator;

public class CompareByTitle implements Comparator<Song> {

    public int compare(Song left, Song right) {
        return left.getName().compareTo(right.getName());
    }
}
