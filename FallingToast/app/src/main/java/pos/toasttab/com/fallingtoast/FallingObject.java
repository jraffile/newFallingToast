package pos.toasttab.com.fallingtoast;

import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Toolkit;
import java.util.Random;

public class FallingObject extends Rectangle {

    Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
    double screenWidth = screenSize.getWidth();
    double screenHeight = screenSize.getHeight();

    int windowWidth = (int) screenWidth;
    int windowHeight = (int) screenHeight;

//    public int objectXLocation;
    // figure out our object size so the object is not cut off on the screen
    public int objectSize;
    // i dont know why the following line is what it is
    public int objectYLocation = -objectSize;
    public int fallSpeed = 1;
    Random rand = new Random();
    public int fallingObjectXLocation;

    // creates a random value inside the window and stores it in fallingObjectXLocation
    public int generateRandomXLocation() {
        // change Game.WINDOW_WIDTH to whatever Game is in our code
        return fallingObjectXLocation = rand.nextInt(windowWidth - objectSize);
    }

    // creates a random non-zero vlaue and stores it in fallSpeed
    public int generateRandomFallSpeed() {
        return fallSpeed = rand.ints(1, 1, 10).findFirst().getAsInt();
    }

//    // collide?
//    public boolean hasCollided() {
//        // if fork hits toaster lives -1
//        // if bread hits toaster score +1
//        return hasCollided();
//    }

    public void checkCollisions() {
        Rectangle r1 = fork.getBoundsOfObject;
        Rectangle r2 = toast.getBoundsOfObject;
    }

    // getBoundsOfObject
    @Override
    public Rectangle getBounds() {
        return new Rectangle(x, y, objectx, objecty);
    }

    // moves the object down if the object is inside the window
//    if(objectYLocation <= windowHeight) {
//        objectYLocation += fallSpeed;
//    }
}
