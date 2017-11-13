/**
 * 
 */
package prj5;

import java.util.Date;

/**
 * Class the creates the person Object
 * 
 * @author dylan hitt dylanh6
 * @version Nov 16, 2017
 */
public class Person {
    private int idNum;
    private Date date;
    private String major;
    private String region;
    private String hobby;
    private String[] responses;
    /**
     * Constructor for the person class
     * @param id accepts int 
     * @param date accepts a data object
     * @param major accepts a String
     * @param region accepts a String
     * @param hobby accepts a string
     * @param responses accepts a string
     */
    public Person(int id, Date date, String major, String region, 
            String hobby, String[] responses) {
        this.idNum = id;
        this.date = date;
        this.major = major;
        this.region = region;
        this.hobby = hobby;
        this.responses = responses;
    }
    /**
     * gets the idNum of the person
     * @return return an int
     */
    public int getIdNum() {
        return idNum;
    }
    /**
     * gets the date field
     * @return returns Date object
     */
    public Date getDate() {
        return date;
    }
    /**
     * gets the persons major
     * @return
     */
    public String getMajor() {
        return major;
    }
    /**
     * gets the region of the person
     * @return returns String of the person region
     */
    public String getRegion() {
        return region;
    }
    /**
     * gets the responses of the person
     * @return
     */
    public String[] getResponses() {
        return responses;
    }
    /**
     * toString for this class
     * @return returns 
     */
    public String toString() {
        StringBuilder build = new StringBuilder();
    }
    
    
}

