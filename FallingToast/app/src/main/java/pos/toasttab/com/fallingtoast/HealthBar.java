package pos.toasttab.com.fallingtoast;

/**
 * Created by jraffile on 8/25/16.
 */
public class HealthBar {
    int totalHP = 5;
    int currentHP = 5;

    public boolean isAlive() {
        if (currentHP > 0) {
            return true;
        } else
            return false;
    }
}

