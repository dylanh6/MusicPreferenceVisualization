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
    private TextShape heardLikes;
    private TextShape songTitle;
    private TextShape category1;
    private TextShape category2;
    private TextShape category3;
    private TextShape category4;
    private Shape barLegend;
    private static final int BAR_WIDTH = 16;
    private static final int BAR_HEIGHT = 120;


    /**
     * Constructor
     */
    public GUIDisplayWindow() {

        window = new Window("Music Preference Visualization");
        window.setSize(1500, 800);
        windowWidth = window.getWidth();
        windowHeight = window.getHeight();

        createButtons();

        printLegend("Ma");

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

        // Lines around legend and bar
        horzLineTop = new Shape(1150, 200, 300, 2, Color.BLACK);
        horzLineBottom = new Shape(1150, 600, 300, 2, Color.BLACK);
        vertLineLeft = new Shape(1150, 200, 2, 400, Color.BLACK);
        vertLineRight = new Shape(1450, 200, 2, 400, Color.BLACK);
        barLegend = new Shape(1292, 450, BAR_WIDTH, BAR_HEIGHT, Color.BLACK);

        window.addShape(horzLineTop);
        window.addShape(horzLineBottom);
        window.addShape(vertLineLeft);
        window.addShape(vertLineRight);
        window.addShape(barLegend);

        // Legend Text
        legendName = new TextShape(1200, 220, type + " Legend");
        legendName.setBackgroundColor(Color.WHITE);
        heardLikes = new TextShape(1240, 550, "Heard         Likes");
        heardLikes.setBackgroundColor(Color.WHITE);
        songTitle = new TextShape(1255, 425, "Song Title");
        songTitle.setBackgroundColor(Color.WHITE);

        window.addShape(legendName);
        window.addShape(heardLikes);
        window.addShape(songTitle);

        // Left side categories
        category1 = new TextShape(1180, 320, "");
        category2 = new TextShape(1180, 340, "");
        category3 = new TextShape(1180, 360, "");
        category4 = new TextShape(1180, 380, "");

        category1.setBackgroundColor(Color.WHITE);
        category2.setBackgroundColor(Color.WHITE);
        category3.setBackgroundColor(Color.WHITE);
        category4.setBackgroundColor(Color.WHITE);

        category1.setForegroundColor(Color.PINK);
        category2.setForegroundColor(Color.BLUE);
        category3.setForegroundColor(Color.YELLOW);
        category4.setForegroundColor(Color.GREEN);

        if (type.equals("Hobby")) {

            category1.setText("Read");
            category2.setText("Art");
            category3.setText("Sports");
            category4.setText("Music");

        }
        else if (type.equals("Major")) {

            category1.setText("Comp Sci");
            category2.setText("Other Eng");
            category3.setText("Math/CMDA");
            category4.setText("Other");

        }
        else { // type.equals("Region"))

            category1.setText("Northeast US");
            category2.setText("Southeast US");
            category3.setText("The Rest of US");
            category4.setText("Outside the US");

        }

        window.addShape(category1);
        window.addShape(category2);
        window.addShape(category3);
        window.addShape(category4);

    }

}
