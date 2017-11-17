/**
 * 
 */
package prj5;

/**
 * Region object
 * 
 * @author dylan hitt dylanh6
 * @version Nov 16, 2017
 *
 */
public class Region {
    private int seHeard;
    private int seYes;
    private int neHeard;
    private int neYes;
    private int usHeard;
    private int usYes;
    private int otherHeard;
    private int otherYes;
    
    public Region(int seHeard, int seYes, int neHeard, int neYes, 
            int usHeard, int usYes, int otherHeard, int otherYes) {
        this.seHeard = seHeard;
        this.seYes = seYes;
        this.neHeard = neHeard;
        this.neYes = neYes;
        this.usHeard = usHeard;
        this.usYes = usYes;
        this.otherHeard = otherHeard;
        this.otherYes = otherYes;
    }

    public int getSeHeard() {
        return seHeard;
    }

    public int getSeYes() {
        return seYes;
    }

    public int getNeHeard() {
        return neHeard;
    }

    public int getNeYes() {
        return neYes;
    }

    public int getUsHeard() {
        return usHeard;
    }

    public int getUsYes() {
        return usYes;
    }

    public int getOtherHeard() {
        return otherHeard;
    }

    public int getOtherYes() {
        return otherYes;
    }

}
