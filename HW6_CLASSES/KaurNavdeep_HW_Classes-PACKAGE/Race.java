import java.util.*;
/**
 * Write a description of class Race here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Race
{
    private double racer1,racer2,racer3; //the three racers
    boolean first = true;
    public Race()
    {
        readInTimes(); //during construcion of the program this is called to recieve input from the user
        sortTimesAscending();//This called to sort the racers time for futer evealtion.
    }
    //gets the inputs from the user
    
    public void readInTimes(){
        System.out.println("Enter the race times (in seconds): ");
        Scanner keyboard = new Scanner(System.in);
        racer1 = keyboard.nextDouble();
        racer2 = keyboard.nextDouble();
        racer3 = keyboard.nextDouble();
        System.out.println();
    }
    //Sorts the time in ascending order, so the smallest is racer1 and the largers is racer3
    public void sortTimesAscending(){
        if (racer1 > racer2){
            double temp = racer1;
            racer1 = racer2;
            racer2 = temp;
        }

        if (racer2 > racer3){
            double temp = racer2;
            racer2 = racer3;
            racer3 = temp;
        }

        if (racer1 > racer2) {
            double temp = racer1;
            racer1 = racer2;
            racer2 = temp;
        }
    }   

    public String testTied(){
        //check if the racers tied for first
        if(racer1 == racer3 || racer1 == racer2)
        {
            if(racer1 == racer3 && racer1 == racer2)
            {
                first =true;
                return "All are tied for first.\n";
            }
            else
            {
                first =true;
                return "Some racers are tied for first \n";
            }
        }
        first = false;
        return "None are tied for first.\n";

    }

    public String testTiedSecond(){
        //check if the racers tied
        if(!first){
            if(racer2 == racer3)
            {
                return "Two racers are tied for second\n";
            }
            return "None are tied for Second.\n";
        }
        return "";
    }

    //retruns an string with times and the postions of the times
    public String getRacerTimes(){
        return "First place (time in seconds): " + racer1 + 
        "\nSecond place (time in seconds): " + racer2 + 
        "\nThird place (time in seconds): "+ racer3 + "\n";
    }
    //finds and returns the range for the race.
    public double range(){
        return racer3-racer1;
    }
    //finds the average of the race. 
    public double average(){
        double total = racer1 + racer2 + racer3;
        return (total/3);
    }

}
