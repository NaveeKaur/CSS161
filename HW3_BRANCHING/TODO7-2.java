import SpaceSmasher.Ball;
import SpaceSmasher_FunctionalAPI.*;
import static SpaceSmasher_FunctionalAPI.WallsEnum.*;
import static SpaceSmasher_FunctionalAPI.PaddleAndBallStatesEnum.*;

/* TODO 7 - Use a multi-way if/else statement to detect and handle ball and wall collisions. 
 * Outcomes: Multi-way if/else statement
 * 
 * Function to define:
 *          public void ballAndWallCollisionCheck()
 * 
 * Functions to call:
 *          WallsEnum getCollidedWall()
 *          void ballReflectOffTopWall()
 *          void ballReflectOffLeftWall()
 *          void ballReflectOffRightWall()
 *          void ballReflectOffBottomWall()
 *          void loseALife()
 *          void ballPlayBounceSound()
 *          
 * Extended functions to call:
 *         void ballReflectOffTopWall(int whichBall)
 *         void ballReflectOffLeftWall(int whichBall)
 *         void ballReflectOffRightWall(int whichBall)
 *         void ballReflectOffBottomWall(int whichBall)
 *         
 * Useful Walls Enums:    
 *         {LEFT, RIGHT, TOP, BOTTOM, NO_COLLISION}
 */

public class TODO7 extends SpaceSmasherFunctionalAPI {
    
    //TODO: declare your one method her
            public void ballAndWallCollisionCheck()
            {
            	if(LEFT == getCollidedWall())
            	{
            		ballPlayBounceSound();
            		ballReflectOffLeftWall();
            	}
            	else if(TOP == getCollidedWall())
            	{
            		ballPlayBounceSound();
            		ballReflectOffLeftWall();
            	}
            	else if(RIGHT  == getCollidedWall())
            	{
            		ballPlayBounceSound();
            		ballReflectOffRightWall();
            	}
            	else if(BOTTOM == getCollidedWall())
            	{
            		loseALife();
            		ballSetToInvisible()();
            	}
                  else
                  {
                        //do nothing
                  }


            }

    
}

