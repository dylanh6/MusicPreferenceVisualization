package prj5;
import java.util.Comparator;

public class CompareByGenre implements Comparator<Song>{

    @Override
    public int compare(Song left, Song right) {
        return left.getGenre().compareTo(right.getGenre());
    }

}
