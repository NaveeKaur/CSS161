import java.util.*; 
import java.io.File;
import java.io.FileNotFoundException;
/**
 * This class is used to determine the alignment sqore of two different DNA sequencees.
 * Assumption: the DNA sequences are pairs; they are not odd numbered. 
 * 
 * @author Navdeep Kaur  
 * @version Final HW due June 3rd 2016 
 */
public class Alignment //Feature #5
{
    public static final String FILENAME = "sequences.txt";
    static Pam pam250 = new Pam();
    static String one;
    static String two; 
    static Scanner input = null;
    public static void main(String[] args) { 
        try { //Feature #3
                input = new Scanner(new File(FILENAME)); // Feature #4
            } catch (FileNotFoundException e) {
                System.out.print("File not found, sorry!");
                return;
            }
          while (input.hasNext()) { //Feature #2
            readFile();
            System.out.println("First sequences is: \t" +one); 
            System.out.println("Second sequences is: \t" +two); 
            System.out.println("Score is: "+getAlignmentScore());
        }
    }

    public static void readFile() { //Feature #4 //also //Feature #1 bc it is more meaningful to use different methods. 
        int smaller, bigger; 
        if (input.hasNext()) { //Feature #3
            one = input.next().toUpperCase(); //will check if all the letters are valid amino acids and are all upper case 
        }
        if (input.hasNext()) {
            two = input.next().toUpperCase(); 
        }
    }

    public static int getAlignmentScore() {
        int smaller, bigger; 
        if (one.length() < two.length()) { //will compare the smaller one first as the difference is just the gap penalty. 
            bigger = two.length(); 
            smaller = one.length(); 
        }
        else {
            bigger = one.length(); 
            smaller = two.length(); 
        }  
        int score = 0; 
        for(int i = 0; i < smaller; i++) { // Feature #2
            score += pam250.getScoreWithCharacter(one.charAt(i), two.charAt(i)); 
        }
        int gapPenalty = (bigger - smaller) * -2; 
        score += gapPenalty; 
        return score; 
    }

}
