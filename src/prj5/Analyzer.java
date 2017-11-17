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

    /**
     * constructor for the analyzer
     * @param personList accepts personlist
     * @param songList accpets songlist
     */
    public Analyzer(SinglyLinkedList<Person> personList, SongList songList) { 
        this.personList = personList;
        this.songList = songList;
        
        
    }
    /**
     * does all the calculation adding up all the counts
     * 
     * @param personList accepts person list 
     * @param songList accepts songlist
     */
    public void representationCount(SinglyLinkedList<Person> personList1, SongList songList1) {
        
        int rIncrement = 0;
        
        for (int a = 0; a < songList1.size(); a++) {
            int[] counters = new int[48];

            personList.getClass();
            songList.getClass();

            for (int b = 0; b < personList1.size(); b++) {
                Person localPerson = personList1.get(b);
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
                
                if (localPerson.getRegion().equals("Southeast")) {
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
            songList1.get(a).setResponseArray(counters);
        }
        
    }
    
}
