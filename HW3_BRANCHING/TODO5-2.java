import SpaceSmasher_FunctionalAPI.*;
import static SpaceSmasher_FunctionalAPI.KeysEnum.*;

/* TODO 5 - Use a single if statement with && to combine all nested if statements into one. 
 * Outcomes: Transforming nested ifs into a single if statement using &&
 * 
 * Function to define:
 *          public void mouseSpawnBallCheck()
 * 
 * Functions to call:
 *          boolean isMouseOnScreen()
 *          boolean isMouseButtonDown(MouseClicksEnum targetButton)
 *          boolean ballGetVisibility()
 *          void ballSpawnNearPaddle()
 *                   
 * Extended functions to call: 
 *          boolean ballGetVisibility(int whichBall)
 *          void ballSpawnNearPaddle(int whichBall, int whichPaddle)
 *
 * Useful Mouse Enums:
 *          {LEFT, RIGHT, CENTER}
 * 
 */

public class TODO5 extends SpaceSmasherFunctionalAPI {

    //TODO: declare your one method here
    public void mouseSpawnBallCheck() {
        if (isMouseOnScreen() && isMouseButtonDown(LEFT) && !ballGetVisibility()) {
            ballSpawnNearPaddle(); 
        }
    }
}
