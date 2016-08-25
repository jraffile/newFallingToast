package pos.toasttab.com.fallingtoast;

/**
 * Created by jraffile on 8/25/16.
 */
public class FallingObject {

    private int objectXLocation;
    // figure out our object size so the object is not cut off on the screen
    private int objectSize;
    // i dont know why the following line is what it is
    private int objectYLocation = -objectSize;
    private int fallSpeed = 1;
    Random rand = new Random();

    //iniital position math.random
    // creates a random value inside the window and stores it in fallingObjectXLocation
    public int generateRandomXLocation() {
        // change Game.WINDOW_WIDTH to whatever Game is in our code
        return fallingObjectXLocation = rand.nextInt(Game.WINDOW_WIDTH - objectSize);
    }

    // creates a random non-zero vlaue and stores it in fallSpeed
    public int generateRandomFallSpeed() {
        return fallSpeed = rand.ints(1, 1, 10).findFirst().getAsInt();
    }
}
