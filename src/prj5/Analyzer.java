/**
 * 
 */
package prj5;

/**
 * Class that handles most of the calculations and generates the output
 * 
 * @author dylan hitt dylanh6
 * @version Nov 16, 2017
 *
 */
public class Analyzer {

    private SinglyLinkedList<Person> personList;
    private SongList songList;

    public static final String[] majors = { "Computer Science", "Other Engineering", "Math or CMDA", "Other" };
    public static final String[] regions = { "Northeast", "Southeast", "Outside of United States",
            "United States (other than Southeast or Northwest)" };
    public static final String[] hobbys = { "reading", "sports", "art", "music" };

    public Analyzer(SinglyLinkedList<Person> personList, SongList songList) {
        this.personList = personList;
        this.songList = songList;
        
        
    }
    
    public String outPutStringHobby() {
        StringBuilder build = new StringBuilder();
        
        int counter = 0;
        
        for (int i = 0; i < songList.size(); i++) {
            Song localSong = songList.get(i);
            int[] data = localSong.getResponses();
            
            build.append("song title " + localSong.getName() + "\n");
            build .append("song artist " + localSong.getArtist() + "\n");
            build.append("song genre " + localSong.getGenre() + "\n");
            build.append("song year " + String.valueOf(localSong.getYear()) + "\n");
            build.append("heard\n");       
                            
            build.append("reading" + String.valueOf(divide(data[1], data[0])));
            build.append(" art" + String.valueOf(divide(data[10], data[9])));
            
            build.append(" sports" + String.valueOf(divide(data[5], data[4])));
            build.append(" music" + String.valueOf(divide(data[13], data[12])) + "\n");
            build.append("likes\n");
            build.append("reading" + String.valueOf(divide(data[3], data[2])));
            build.append(" art" + String.valueOf(divide(data[11], data[10])));
            build.append(" sports" + String.valueOf(divide(data[7], data[6])));
            build.append(" music" + String.valueOf(divide(data[15], data[14])) + "\n\n");
            
            
        }
        
        return build.toString();
        
    }
    
    public int divide(float bottom, float top) {
        float percentage = 0;
        
        if (bottom != 0) {
            percentage = (top / bottom) * 100;
            
        }
        else {
            percentage = 0;
        }
        
        int ret = (int) percentage;
        
        return ret;
    }

    public void representationCount(SinglyLinkedList<Person> personList, SongList songList) {
        
        int rIncrement = 0;
        
        for (int a = 0; a < songList.size(); a++) {
            int[] counters = new int[48];

            

            for (int b = 0; b < personList.size(); b++) {
                Person localPerson = personList.get(b);
                String[] responses = localPerson.getResponses();

                if (localPerson.getHobby().equals("reading")) {
                    if (responses[rIncrement].equals("Yes")) {
                        counters[0]++;
                    }

                    if (!responses[rIncrement].equals("")) {
                        counters[1]++;
                    }

                    if (responses[rIncrement + 1].equals("Yes")) {
                        counters[2]++;
                    }

                    if (!responses[rIncrement + 1].equals("")) {
                        counters[3]++;
                    }
                }

                else if (localPerson.getHobby().equals("sports")) {
                    if (responses[rIncrement].equals("Yes")) {
                        counters[4]++;
                    }

                    if (!responses[rIncrement].equals("")) {
                        counters[5]++;
                    }

                    if (responses[rIncrement + 1].equals("Yes")) {
                        counters[6]++;
                    }

                    if (!responses[rIncrement + 1].equals("")) {
                        counters[7]++;
                    }
                }
                else if (localPerson.getHobby().equals("art")) {
                    if (responses[rIncrement].equals("Yes")) {
                        counters[8]++;
                    }

                    if (!responses[rIncrement].equals("")) {
                        counters[9]++;
                    }

                    if (responses[rIncrement + 1].equals("Yes")) {
                        counters[10]++;
                    }

                    if (!responses[rIncrement + 1].equals("")) {
                        counters[11]++;
                    }
                }
                else {
                    if (responses[rIncrement].equals("Yes")) {
                        counters[12]++;
                    }

                    if (!responses[rIncrement].equals("")) {
                        counters[13]++;
                    }

                    if (responses[rIncrement + 1].equals("Yes")) {
                        counters[14]++;
                    }

                    if (!responses[rIncrement + 1].equals("")) {
                        counters[15]++;
                    }

                }
                
                if (localPerson.getMajor().equals("Computer Science")) {
                    if (responses[rIncrement].equals("Yes")) {
                        counters[16]++;
                    }

                    if (!responses[rIncrement + 1].equals("")) {
                        counters[17]++;
                    }

                    if (responses[rIncrement].equals("Yes")) {
                        counters[18]++;
                    }

                    if (!responses[rIncrement + 1].equals("")) {
                        counters[19]++;
                    }
                }
                else if (localPerson.getMajor().equals("Math of CMDA")) {
                    if (responses[rIncrement].equals("Yes")) {
                        counters[20]++;
                    }

                    if (!responses[rIncrement].equals("")) {
                        counters[21]++;
                    }

                    if (responses[rIncrement + 1].equals("Yes")) {
                        counters[22]++;
                    }

                    if (!responses[rIncrement + 1].equals("")) {
                        counters[23]++;
                    }
                }
                else if (localPerson.getMajor().equals("Other Engineering")) {
                    if (responses[rIncrement].equals("Yes")) {
                        counters[24]++;
                    }

                    if (!responses[rIncrement].equals("")) {
                        counters[25]++;
                    }

                    if (responses[rIncrement + 1].equals("Yes")) {
                        counters[26]++;
                    }

                    if (!responses[rIncrement + 1].equals("")) {
                        counters[27]++;
                    }
                }
                else {
                    if (responses[rIncrement].equals("Yes")) {
                        counters[28]++;
                    }

                    if (!responses[rIncrement].equals("")) {
                        counters[29]++;
                    }

                    if (responses[rIncrement + 1].equals("Yes")) {
                        counters[30]++;
                    }

                    if (!responses[rIncrement + 1].equals("")) {
                        counters[31]++;
                    }
                }
                
                if(localPerson.getRegion().equals("Southeast")) {
                    if (responses[rIncrement].equals("Yes")) {
                        counters[32]++;
                    }

                    if (!responses[rIncrement].equals("")) {
                        counters[33]++;
                    }

                    if (responses[rIncrement + 1].equals("Yes")) {
                        counters[34]++;
                    }

                    if (!responses[rIncrement + 1].equals("")) {
                        counters[35]++;
                    }
                }
                else if (localPerson.getRegion().equals("Northeast")) {
                    if (responses[rIncrement].equals("Yes")) {
                        counters[36]++;
                    }

                    if (!responses[rIncrement].equals("")) {
                        counters[37]++;
                    }

                    if (responses[rIncrement + 1].equals("Yes")) {
                        counters[38]++;
                    }

                    if (!responses[rIncrement + 1].equals("")) {
                        counters[39]++;
                    }
                }
                else if (localPerson.getRegion().equals("United States "
                        + "(other than Southeast or Northwest)")) {
                    if (responses[rIncrement].equals("Yes")) {
                        counters[40]++;
                    }

                    if (!responses[rIncrement].equals("")) {
                        counters[41]++;
                    }

                    if (responses[rIncrement + 1].equals("Yes")) {
                        counters[42]++;
                    }

                    if (!responses[rIncrement + 1].equals("")) {
                        counters[43]++;
                    }
                }
                else {
                    if (responses[rIncrement].equals("Yes")) {
                        counters[44]++;
                    }

                    if (!responses[rIncrement].equals("")) {
                        counters[45]++;
                    }

                    if (responses[rIncrement + 1].equals("Yes")) {
                        counters[46]++;
                    }

                    if (!responses[rIncrement + 1].equals("")) {
                        counters[47]++;
                    }
                }               
                
                
                
            }
            
            rIncrement += 2;
            songList.get(a).setResponseArray(counters);
        }
        
    }
    
}
