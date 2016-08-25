package pos.toasttab.com.fallingtoast;

import java.util.Random;

/**
 * Created by jraffile on 8/25/16.
 */
public class FallingObject {

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
        return fallingObjectXLocation = rand.nextInt(Game.WINDOW_WIDTH - objectSize);
    }

    // creates a random non-zero vlaue and stores it in fallSpeed
    public int generateRandomFallSpeed() {
        return fallSpeed = rand.ints(1, 1, 10).findFirst().getAsInt();
    }

    // collide?
    public boolean hasCollided(Boolean hasCollided) {
        // if fork hits toaster lives -1
        // if bread hits toaster score +1
        return hasCollided(hasCollided);
    }
}
