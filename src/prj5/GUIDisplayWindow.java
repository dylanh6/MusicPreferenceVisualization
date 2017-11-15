/**
 * 
 */
package prj5;

import CS2114.Window;
import CS2114.WindowSide;
import java.awt.Color;
import CS2114.Button;
import CS2114.Shape;
import CS2114.TextShape;

/**
 * @author David Wise (davidw20)
 * @version Nov 16, 2017
 */
public class GUIDisplayWindow {

    private Window window;
    private int windowWidth;
    private int windowHeight;
    private Button prev;
    private Button sortName;
    private Button sortTitle;
    private Button sortYear;
    private Button sortGenre;
    private Button next;
    private Button hobby;
    private Button major;
    private Button region;
    private Button quit;
    private Shape horzLineTop;
    private Shape horzLineBottom;
    private Shape vertLineLeft;
    private Shape vertLineRight;
    private TextShape legendName;
    private Shape bar;
    private int barWidth;

    private int BAR_HEIGHT = 120;


    /**
     * Constructor
     */
    public GUIDisplayWindow() {

        window = new Window("Music Preference Visualization");
        window.setSize(1500, 800);
        windowWidth = window.getWidth();
        windowHeight = window.getHeight();

        createButtons();

        printLegend("Hobby");

    }


    /**
     * This method returns the window
     * 
     * @return the window
     */
    public Window getWindow() {

        return window;

    }


    private void createButtons() {

        prev = new Button("Prev");
        prev.onClick(this, "clickedPrev");
        window.addButton(prev, WindowSide.NORTH);

        sortName = new Button("Sort by Artist Name");
        sortName.onClick(this, "clickedSortName");
        window.addButton(sortName, WindowSide.NORTH);

        sortTitle = new Button("Sort by Song Title");
        sortTitle.onClick(this, "clickedSortTitle");
        window.addButton(sortTitle, WindowSide.NORTH);

        sortYear = new Button("Sort by Release Year");
        sortYear.onClick(this, "clickedSortYear");
        window.addButton(sortYear, WindowSide.NORTH);

        sortGenre = new Button("Sort by Genre");
        sortGenre.onClick(this, "clickedSortGenre");
        window.addButton(sortGenre, WindowSide.NORTH);

        next = new Button("Next");
        next.onClick(this, "clickedNext");
        window.addButton(next, WindowSide.NORTH);

        hobby = new Button("Represent Hobby");
        hobby.onClick(this, "clickedHobby");
        window.addButton(hobby, WindowSide.SOUTH);

        major = new Button("Represent Major");
        major.onClick(this, "clickedMajor");
        window.addButton(major, WindowSide.SOUTH);

        region = new Button("Represent Region");
        region.onClick(this, "clickedRegion");
        window.addButton(region, WindowSide.SOUTH);

        quit = new Button("Quit");
        quit.onClick(this, "clickedQuit");
        window.addButton(quit, WindowSide.SOUTH);
    }


    /**
     * This method executes when the Prev button is clicked
     */
    public void clickedPrev() {

    }


    /**
     * This method executes when the Sort by Artist Name button is clicked
     */
    public void clickedSortName() {

    }


    /**
     * This method executes when the Sort by Song Title button is clicked
     */
    public void clickedSortTitle() {

    }


    /**
     * This method executes when the Sort by Release Year button is clicked
     */
    public void clickedSortYear() {

    }


    /**
     * This method executes when the Genre button is clicked
     */
    public void clickedSortGenre() {

    }


    /**
     * This method executes when the Next button is clicked
     */
    public void clickedNext() {

    }


    /**
     * This method executes when the Represent by Hobby button is clicked
     */
    public void clickedHobby() {

        hobbyLegend();
    }


    /**
     * This method executes when the Represent by Major button is clicked
     */
    public void clickedMajor() {

        majorLegend();

    }


    /**
     * This method executes when the Represent Region button is clicked
     */
    public void clickedRegion() {

        regionLegend();

    }


    /**
     * This method executes when the Quit button is clicked
     */
    public void clickedQuit() {

    }


    /**
     * This method prints the Hobby Legend to the window
     */
    public void hobbyLegend() {

    }


    /**
     * This method prints the Major Legend to the window
     */
    public void majorLegend() {

    }


    /**
     * This method prints the Region Legend to the window
     */
    public void regionLegend() {

    }


    /**
     * This method prints the correct legend
     */
    public void printLegend(String type) {

        horzLineTop = new Shape(1150, 200, 300, 2, Color.BLACK);
        horzLineBottom = new Shape(1150, 600, 300, 2, Color.BLACK);
        vertLineLeft = new Shape(1150, 200, 2, 400, Color.BLACK);
        vertLineRight = new Shape(1450, 200, 2, 400, Color.BLACK);

        window.addShape(horzLineTop);
        window.addShape(horzLineBottom);
        window.addShape(vertLineLeft);
        window.addShape(vertLineRight);

        legendName = new TextShape(1200, 220, type + " Legend");
        legendName.setBackgroundColor(Color.WHITE);

        bar = new Shape(1300, 500, 15, 120, Color.BLACK);

        window.addShape(legendName);
        window.addShape(bar);

        if (type.equals("Hobby")) {

        }
        else if (type.equals("Major")) {

        }
        else { // type.equals("Region"))

        }

    }

}
