package pos.toasttab.com.fallingtoast;

import java.awt.Rectangle;


/**
 * Created by jraffile on 8/25/16.
 */
public class Fork extends FallingObject {
    //fork image falls according to FallingObject and on collision with Toaster object declares currentHP as 0*/


    public void checkCollisions(){
        Rectangle f = Bread.getBounds();
        Rectangle t = Toaster.getBounds();
        if (t.interesects(f) || currentHP = 0)
            gameOver = true;


    }
}


