import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.text.DecimalFormat;
/**
 * This is the 5th coding HW assignment for CSS161.
 * @author Navdeep Kaur
 * @version 6th May 2016
 */
public class KaurNavdeep_HW_Loops_Files
{
    static DecimalFormat df = new DecimalFormat("0.00##");
    public static final String FILENAME = "courseData.txt";
    public static double PROGRAM_WEIGHT;
    public static double MIDTERM_WEIGHT;
    public static double FINAL_WEIGHT;

    public static void main(String[] args)
    {
        Scanner input = null;
        try
        {
            input = new Scanner(new File(FILENAME));
            System.out.println("File read successfully!");
        } catch (FileNotFoundException e)
        {
            System.out.print("File not found, sorry!");
            return;
        }
        PROGRAM_WEIGHT = input.nextDouble();
        MIDTERM_WEIGHT = input.nextDouble();
        FINAL_WEIGHT = input.nextDouble();

        while (input.hasNextInt())
        {
            int classTotal = 0;
            int students =0;
            int course = input.nextInt();
            System.out.println("Grade Data for Class " + course + "\n");
            System.out.println(" ID      Programs       Midterm         Final       Weighted Average        " +
                "Programs grade");
            System.out.println(" --      --------       -------         -----       ----------------        " +
                "--------------");
            while (true)
            {
                if(course == 0)
                {
                    break;
                }

                int id = input.nextInt();
                if(id == 0)
                {break;}
                int n4 = input.nextInt();
                int n5 = input.nextInt();
                int n6 = input.nextInt();
                students++;
                String pass = "";
                double individualAverage = n4 * PROGRAM_WEIGHT + n5 * MIDTERM_WEIGHT + n6 * FINAL_WEIGHT;

                classTotal += individualAverage;

                if (individualAverage >= 59)
                {
                    pass = "Pass";
                } else
                {
                    pass = "Fail";
                }

                System.out.println(id + "        " + n4 + "            " + n5 + "             " + n6 + "             " +
                    " " + df.format(individualAverage) + "                " + pass);
            }
            System.out.println("Class Average: "+df.format(classTotal/students)+ "\n");

        }
    }
}

