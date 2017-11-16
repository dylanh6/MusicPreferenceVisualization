/**
 * 
 */
package prj5;

/**
 * Class that holds all the major counts
 * 
 * @author dylan hitt dylanh6
 * @version Nov 16, 2017
 *
 */
public class Major {
    
    private int compSciHeard;
    private int compSciYes;
    private int otherEngHeard;
    private int otherEngYes;
    private int mathCMDAHeard;
    private int mathCMDAYes;
    private int otherHeard;
    private int otherYes;
    
    
    public Major(int compSciHeard, int compSciYes, int otherEngHeard, 
            int otherEngYes, int mathCMDAHeard, int mathCMDAYes, int otherHeard, int otherYes) {
        this.compSciHeard = compSciHeard;
        this.compSciYes = compSciYes;
        this.otherEngHeard = otherEngHeard;
        this.otherEngYes = otherEngYes;
        this.mathCMDAHeard = mathCMDAHeard;
        this.mathCMDAYes = mathCMDAYes;
        this.otherHeard = otherHeard;
        this.otherYes = otherYes;
    }
    
    public int getCompSciHeard() {
        return compSciHeard;
    }
    
    public int getCompSciYes() {
        return compSciYes;
    }
    
    public int getOtherEngHeard() {
        return otherEngHeard;
    }
    
    public int getOtherEngYes() {
        return otherEngYes;
    }
    
    public int getmathCMDAHeard() {
        return mathCMDAHeard;
    }
    
    public int getmathCMDAYes() {
        return mathCMDAYes;
    }
    
    public int getOtherHeard() {
        return otherHeard;
    }
    
    public int getOtherYes() {
        return otherYes;
    }
}
