/**
 * 
 */
package prj5;

import java.util.Arrays;
import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import student.TestCase;

/**
 * test class for the person class
 * 
 * @author dylan hitt
 * @version Nov 13, 2017
 *
 */
public class PersonTest extends TestCase {
    private Person person;
    /**
     * setup method for the test
     */
    public void setUp() {
        
        String[] responses = new String[] {"yes", "no", "yes"};
        
        person = new Person(1, "10/19/15 14:45", 
                "Computer Science", "SE", "Music", responses);
    }
    /**
     * test for getDate
     */
    public void testGetDate() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy HH:mm");
        
        Date date1 = null;
        
        try {
            date1 = dateFormat.parse("10/19/15 14:45");
        } 
        catch (ParseException e) {
            
            e.printStackTrace();
        }
               
        assertEquals(date1, person.getDate());
    }
    /**
     * test for getIDNum
     */
    public void testGetIDNum() {
        assertEquals(1, person.getIdNum());
    }
    /**
     * test for getMajor
     */
    public void testGetMajor() {
        assertEquals("Computer Science", person.getMajor());
    }
    /**
     * test for getHobby
     */
    public void testGetHobby() {
        assertEquals("Music", person.getHobby());
    }
    /**
     * test for getRegion
     */
    public void testGetRegion() {
        assertEquals("SE", person.getRegion());
    }
    /**
     * test for getResponses
     */
    public void testGetResponses() {
        String[] responses2 = new String[] {"yes", "no", "yes"};
        assertTrue(Arrays.equals(responses2, person.getResponses()));
        
    }
    /**
     * test for toString
     */
    public void testToString() {
        String myString = "1. Sat Oct 19 14:45:00 EST 15 - Major: "
                + "Computer Science, Region: SE";
        
        assertEquals(myString, person.toString());
    }
}
