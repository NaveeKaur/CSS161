import java.util.*;
import java.text.DecimalFormat;
/**
 * Write a description of class RaceReport here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class RaceReport
{
    private Race a; //creates a variable that will be used to get race info
    private DecimalFormat df = new DecimalFormat("0.0#"); // used to formate
    private Scanner keyboard = new Scanner(System.in); //scanner used to restart program
    private char next; // check if they want to contuine 
    public RaceReport(){
        do{
            a = new Race(); // set up the race object
            testAndPrintReport(); // call the test and print function to print the race info
            System.out.print("Enter another race? (y/n): "); //ask if the user wants to contuine
            next = keyboard.next().charAt(0); //get the char at the first index of the string they enter
            System.out.print("\n"); // print spaces 
        }while(next == 'y' || next == 'Y');
        if(next == 'n' || next == 'N')//for fun
        {
            System.out.println("Thank you for using the race test statics program");
            System.out.print("GOOD BYE! :)");
        }
    }
    public void testAndPrintReport(){
        System.out.println(a.testTied() +a.testTiedSecond());//check for ties
        
        
        System.out.println(a.getRacerTimes());//print the times of the racers in assending order
        //print the range in the decimal format specified above.
        System.out.println("The range of the race times (in seconds): " +
        df.format(a.range()) + "\n");
        ///print the average in the decimal format specified above. 
        System.out.println("The average time of all racers (in seconds): " +
         df.format(a.average())+ "\n");
    }
}
