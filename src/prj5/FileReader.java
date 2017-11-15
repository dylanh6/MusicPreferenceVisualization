/**
 * 
 */
package prj5;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * FileReader class class that reads the input files and stores the objects
 * 
 * @author dylan hitt dylan6
 * @version Nov 16, 2017
 *
 */
public class FileReader {

    private SinglyLinkedList<Song> songList;
    private SinglyLinkedList<Person> personList;


    public FileReader(String songFile, String personFile) throws Exception {
        songList = this.songReader(songFile);
        personList = this.personReader(personFile);
    }


    public SinglyLinkedList<Song> songReader(String songFile) throws Exception {
        SinglyLinkedList<Song> localList = new SinglyLinkedList<Song>();
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


    public SinglyLinkedList<Person> personReader(String personFile)
        throws FileNotFoundException {
        Scanner in = new Scanner(new File(personFile));

        SinglyLinkedList<Person> personList = new SinglyLinkedList<Person>();

        in.nextLine();
        while (in.hasNextLine()) {
            String line = in.nextLine();

            String[] split = line.split(" *, *");

            int id = Integer.parseInt(split[0]);
            String date = split[1];
            String major = split[2];
            String region = split[3];
            String hobby = split[4];

            int songCount = songList.getLength() + 5;

            String[] responses = new String[songCount];

            for (int i = 0; i < songCount; i++) {
                responses[i] = split[i + 5];

            }

            Person localPerson = new Person(id, date, major, region, hobby,
                responses);

            personList.add(localPerson);
        }
        in.close();

        return personList;
    }


    public SinglyLinkedList<Song> getSongList() {
        return songList;
    }


    public SinglyLinkedList<Person> getPersonList() {
        return personList;
    }
}
