package pos.toasttab.com.fallingtoast;

/**
 * Created by jraffile on 8/25/16.
 */
public class HealthBar {
    int totalHP;
    int currentHP;

    totalHP = 5
    currentHP = 5

    public boolean isAlive() {
        if (currentHP > 0){
            return true;
        }else
            return false
    }
                    //method isalive reutrns a boolean if current hp is > 0 return true if not return false

}
