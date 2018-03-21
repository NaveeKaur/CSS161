import java.util.*; 
import java.io.IOException; 
/**
 * This is the main program that includes a loop that allows you to enter in the specifications for more than one jump.
 * 
 * @author Navdeep Kaur 
 * @version Due May 27th 2016 
 */
public class DiveDriver
{
    private Skydiver a; 
    private Skydive b; 
    public static void main(String[] args) throws IOException {
        Scanner keyboard = new Scanner(System.in); 
        double time[] = new double[20]; //we need two seperate one dimensional arrrays for time and  velocity. 
        double velocity[] = new double[20]; //timesteps need to be at least t=16sec... 
        int h = 0;
        System.out.println("Enter the mass of the skydiver (kg) : "); 
        double mass = keyboard.nextDouble(); 

        System.out.println("Enter cross-sectional area of the skydiver (m^2) : "); 
        double area = keyboard.nextDouble(); 

        System.out.println("Enter the drag coeffiicient of the skydiver : "); 
        double drag = keyboard.nextDouble(); 

        System.out.println("Enter the ending time (sec) : "); 
        int endTime = keyboard.nextInt(); 

        System.out.println("Enter the time step (sec) : "); 
        int timeStep = keyboard.nextInt();

        for (double i = timeStep; i < endTime; i = i + 0.01) { //for statement for the time&velocity array
            time[h] = i; 
            velocity[h] = diver.calcVelocity(i); 
            j++; 
        }

        do{
            System.out.print("Enter another dive? (y/[n]): "); 
            next = keyboard.next().charAt(0); //get the char at the first index of the string they enter
            System.out.print("\n"); // print spaces 
        }
        while(next == 'y' || next == 'Y');

        if(next == 'n' || next == 'N')//for fun
        {
            System.out.println("Thank you for using the skydiving test statics program");
            System.out.print("GOOD BYE! :)");
        }

        System.out.println("Enter the output filename : "); 
        String outputFile = keyboard.next(); 
        FileWriter out = new FileWriter(new File(outputFile)); //prints results to output file. 
        for(double j = 0; j < h; j++) {
            out.write(time[j] + "   " + velocity[j]); 
        }
        System.out.println("Writing out file to: "+outputFile);
    }
}


