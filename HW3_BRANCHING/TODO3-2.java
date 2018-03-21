import SpaceSmasher_FunctionalAPI.*;
import static SpaceSmasher_FunctionalAPI.KeysEnum.*;

/* TODO 3 - Use if/else statements nested inside of if/else statements to determine and return the largest of 3 integers 
 * Outcomes: Nested if/else statements
 * 
 * Function to define:
 *          public int max(int a,int b, int c)
 * 
 * Functions to call:
 *          None!  Especially don't call Math.max!
 *
 * Hints and Tips:
 *         -Don't call Math.max, but make this function instead!
 *         -This is the only function that takes input and provides output in this assignment
 */

public class TODO3 extends SpaceSmasherFunctionalAPI {

    //TODO: declare your one method here
    public int max(int a, int b, int c) {
        int max = 0; 
        if(a >= b) {
            if(a >=c)
                return a;
            else
                return c;
        }
        else {
            if(b>=c)
                return b;
            else
                return c;
        }
    }
}
