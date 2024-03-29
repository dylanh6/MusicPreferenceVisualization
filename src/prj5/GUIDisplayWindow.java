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
    private static int windowWidth;
    private static int windowHeight;
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
    private static final int BAR_WIDTH = 10;
    private static final int BAR_HEIGHT = 80;
    private static int BAR_X;
    private static int BAR_Y;
    private Shape bar;
    private Shape songName;
    private Shape bottomText;
    private Shape dataBar;
    private static final int DATABAR_HEIGHT = BAR_HEIGHT / 4;
    private SongList songList;
    private int windowNum;
    private int windowNumMax;
    private static String currRep;
    private int[] barPercent;
    private String sortType;


    /**
     * Constructor
     */
    public GUIDisplayWindow(String songFile, String personFile) {

        window = new Window("Music Preference Visualization");
        window.setSize(1500, 800);
        windowWidth = window.getWidth();
        windowHeight = window.getHeight();

        BAR_X = (windowWidth / 3) / 3;
        BAR_Y = (windowHeight / 3) / 3;

        createButtons();

        try {
            FileReader fileIn = new FileReader(songFile, personFile);
            Analyzer a = new Analyzer();
            a.representationCount(fileIn.getPersonList(), fileIn.getSongList());

            SongList e = fileIn.getSongList();

            songList = e;

        }
        catch (Exception e) {
            System.out.print(e);
        }

        windowNum = 0;
        windowNumMax = songList.size() / 9;
        currRep = "Hobby";
        sortType = "Name";
        
    }


    /**
     * This method returns the window
     * 
     * @return the window
     */
    public Window getWindow() {

        return window;

    }


    /**
     * This method creates the buttons in the GUI
     */
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
    public void clickedPrev(Button button) {

        window.removeAllShapes();

        if (0 < windowNum) {

            windowNum = windowNum - 1;
            printGylph(windowNum, sortType);
            printLegend(currRep);

        }

    }


    /**
     * This method executes when the Sort by Artist Name button is clicked
     * 
     * @param button
     *            This is the SortName button
     */
    public void clickedSortName(Button button) {
        windowNum = 0;
        sortType = "Name";
        
        songList.sortBy(SortEnum.ARTIST);

        window.removeAllShapes();
        printGylph(windowNum, sortType);
        printLegend(currRep);

    }


    /**
     * This method executes when the Sort by Song Title button is clicked
     * 
     * @param button
     *            This is the SortTitle button
     */
    public void clickedSortTitle(Button button) {
        windowNum = 0;
        sortType = "Title";

        songList.sortBy(SortEnum.TITLE);

        window.removeAllShapes();
        printGylph(windowNum, sortType);
        printLegend(currRep);

    }


    /**
     * This method executes when the Sort by Release Year button is clicked
     * 
     * @param button
     *            This is the SortYear button
     */
    public void clickedSortYear(Button button) {
        windowNum = 0;
        sortType = "Year";

        songList.sortBy(SortEnum.YEAR);

        window.removeAllShapes();
        printGylph(windowNum, sortType);
        printLegend(currRep);

    }


    /**
     * This method executes when the Genre button is clicked
     * 
     * @param button
     *            This is the SortGenre button
     */
    public void clickedSortGenre(Button button) {
        windowNum = 0;
        sortType = "Genre";

        songList.sortBy(SortEnum.GENRE);

        window.removeAllShapes();
        printGylph(windowNum, sortType);
        printLegend(currRep);

    }


    /**
     * This method executes when the Next button is clicked
     * 
     * @param button
     *            This is the next button
     */
    public void clickedNext(Button button) {

        window.removeAllShapes();

        if (windowNum < windowNumMax) {

            windowNum = windowNum + 1;
            printLegend(currRep);
            printGylph(windowNum, sortType);

        }

    }


    /**
     * This method executes when the Represent by Hobby button is clicked
     * 
     * @param button
     *            This is the hobby button
     */
    public void clickedHobby(Button button) {

        windowNum = 0;
        window.removeAllShapes();

        printLegend("Hobby");
        printGylph(windowNum, sortType);

        currRep = "Hobby";

    }


    /**
     * This method executes when the Represent by Major button is clicked
     * 
     * @param button
     *            This is the major button
     */
    public void clickedMajor(Button button) {

        windowNum = 0;
        window.removeAllShapes();
        printLegend("Major");
        printGylph(windowNum, sortType);

        currRep = "Major";

    }


    /**
     * This method executes when the Represent Region button is clicked
     * 
     * @param button
     *            This is the region button
     */
    public void clickedRegion(Button button) {

        window.removeAllShapes();
        printLegend("Region");
        printGylph(windowNum, sortType);

        currRep = "Region";

    }


    /**
     * This method executes when the Quit button is clicked
     * 
     * @param button
     *            This is the quit button
     */
    public void clickedQuit(Button button) {

        System.exit(0);

    }


    /**
     * This method prints the correct legend
     * 
     * @param type
     *            This is the type of legend to be printed
     */
    public void printLegend(String type) {

        // Lines around legend and bar
        horzLineTop = new Shape(1150, 200, 300, 2, Color.BLACK);
        horzLineBottom = new Shape(1150, 600, 300, 2, Color.BLACK);
        vertLineLeft = new Shape(1150, 200, 2, 400, Color.BLACK);
        vertLineRight = new Shape(1450, 200, 2, 400, Color.BLACK);
        barLegend = new Shape(1292, 450, 16, 120, Color.BLACK);

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


    /**
     * This method prints the correct legend
     */
    public void printGylph(int windowNum, String sortType) {

        int widthMulti = 0;
        int heightMulti = 0;
        int j = windowNum * 9;

        for (int i = 0; i < 9; i++) {

            if (i == 0 || i == 1 || i == 2) {
                heightMulti = 1;

            }
            else if (i == 3 || i == 4 || i == 5) {
                heightMulti = 3;

            }
            else if (i == 6 || i == 7 || i == 8) {
                heightMulti = 5;

            }
            if (i == 0 || i == 3 || i == 6) {
                widthMulti = 1;

            }
            else if (i == 1 || i == 4 || i == 7) {
                widthMulti = 3;

            }
            else if (i == 2 || i == 5 || i == 8) {
                widthMulti = 5;

            }

            songName = new TextShape(BAR_X * widthMulti - BAR_WIDTH - 10, BAR_Y
                * heightMulti - 60, songList.get(j).getName());
            songName.setBackgroundColor(Color.WHITE);

            String theBottomText;
            if (sortType.equals("Name") || sortType.equals("Title")) {
                theBottomText = "by " + songList.get(j).getArtist();
            }
            else if (sortType.equals("Year")) {
                theBottomText = Integer.toString(songList.get(j).getYear());

            }
            else { // sortType.equals("Genre")
                theBottomText = songList.get(j).getGenre();
            }

            bottomText = new TextShape(BAR_X * widthMulti - BAR_WIDTH - 10,
                BAR_Y * heightMulti - 30, theBottomText);
            bottomText.setBackgroundColor(Color.WHITE);
            window.addShape(songName);
            window.addShape(bottomText);

            bar = new Shape(BAR_X * widthMulti, BAR_Y * heightMulti, BAR_WIDTH,
                BAR_HEIGHT, Color.BLACK);
            window.addShape(bar);

            leftBars(widthMulti, heightMulti, j);

            rightBars(widthMulti, heightMulti, j);

            j++;

        }

    }


    /**
     * This method prints the left bars in the glyph
     */
    public void leftBars(int widthLoc, int heightLoc, int songNumber) {

        int widthMulti = widthLoc;
        int heightMulti = heightLoc;
        int j = songNumber;
        int counter = 0;

        Color color = null;

        // Print left bars
        for (int i = 0; i < 8; i += 2) {

            if (i == 0) {
                color = Color.PINK;

            }
            else if (i == 2) {
                color = Color.BLUE;

            }
            else if (i == 4) {
                color = Color.YELLOW;

            }
            else {// (i == 3) {

                color = Color.GREEN;

            }

            if (currRep.equals("Hobby")) {
                barPercent = songList.representOutput(RepresentEnum.HOBBY,
                    songList.get(j));
            }
            else if (currRep.equals("Major")) {
                barPercent = songList.representOutput(RepresentEnum.MAJOR,
                    songList.get(j));
            }
            else if (currRep.equals("Region")) {
                barPercent = songList.representOutput(RepresentEnum.REGION,
                    songList.get(j));

            }

            int barSize = barPercent[i];
            dataBar = new Shape(BAR_X * widthMulti - barSize, BAR_Y
                * heightMulti + (counter * DATABAR_HEIGHT), barSize,
                DATABAR_HEIGHT, color);

            counter++;
            window.addShape(dataBar);

        }

    }


    /**
     * This method prints the right bars in the glyph
     */
    public void rightBars(int widthLoc, int heightLoc, int songNumber) {

        int widthMulti = widthLoc;
        int heightMulti = heightLoc;
        int j = songNumber;

        Color color = null;
        int counter = 0;

        // Print right bars
        for (int i = 1; i < 8; i += 2) {

            if (i == 1) {
                color = Color.PINK;

            }
            else if (i == 3) {
                color = Color.BLUE;

            }
            else if (i == 5) {
                color = Color.YELLOW;

            }
            else {// (i == 3) {

                color = Color.GREEN;

            }

            if (currRep.equals("Hobby")) {
                barPercent = songList.representOutput(RepresentEnum.HOBBY,
                    songList.get(j));
            }
            else if (currRep.equals("Major")) {
                barPercent = songList.representOutput(RepresentEnum.MAJOR,
                    songList.get(j));
            }
            else if (currRep.equals("Region")) {
                barPercent = songList.representOutput(RepresentEnum.REGION,
                    songList.get(j));

            }

            int barSize = barPercent[i];

            dataBar = new Shape(BAR_X * widthMulti + BAR_WIDTH, BAR_Y
                * heightMulti + (counter * DATABAR_HEIGHT), barSize,
                DATABAR_HEIGHT, color);

            counter++;
            window.addShape(dataBar);

        }

    }

}
