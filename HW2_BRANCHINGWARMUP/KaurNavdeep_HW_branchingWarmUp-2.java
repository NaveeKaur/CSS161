import java.util.Scanner;
/**
 * Write a description of class branchingWarmUp here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class branchingWarmUp
{
    public static Scanner keyboard = new Scanner(System.in); 
    public static void main (String[] args) {
        TODO1();
        TODO2();
        TODO3();
        TODO4n5();
        TODO6();
        TODO7n8();
        TODO9();
        TODO10();
        TODO11();
        runMax(); 
    }

    /*
     * Prompt the user with: "Enter the number".  
     * Determine if it is negative and if so, print: 
     * "The number is negative."  Use a Scanner to collect the 
     * input, and report to the console if the variable called 
     * “number” is negative using System.out.println().
     */
    public static void TODO1(){
        //TODO1
        System.out.println("Enter the number." ); 
        int number = keyboard.nextInt();
        if (number < 0) {
            System.out.println("The number is negative. "); 
        }
        else
        {
            System.out.println("The number is positive or zero. "); 
        }

    }

    /*
     * Prompt the user with: "Enter a second number".  
     * Determine if the number is zero and if 
     * so, print: "The number is zero."  Use a Scanner 
     * to get the input, and report if the number is zero next. 
     * You can reuse the variables "number" and "keyboard" here.
     */
    public static void TODO2(){

        //TODO2
        System.out.println("Enter a second number. "); 
        int number2 = keyboard.nextInt(); 
        if (number2 == 0) {
            System.out.println("The number is zero. "); 
        }
        else{
            System.out.println("The number is not zero. "); 
        }
    }

    /*
     * Continue to use Scanner for input.  Prompt the user with: 
     * "Enter a third number, a double, for the class average." 
     * Determine if the class average is a passing grade, and 
     * if so, print: "A passing grade", and print to the console 
     * otherwise if not (not passing is if the class average was below a 65).
     */
    public static void TODO3(){
        //TODO3
        System.out.println("Enter a third number, a double, for the class average. ");
        double number3 = keyboard.nextDouble(); 
        if (number3 >= 65) {
            System.out.println("A passing grade. "); 
        }
        else{            
            System.out.println("So sorry but you did not pass... try again next time. "); 
        }
    }

    /*
     * Prompt the user with: "Is the answer the user reported true?  
     * Enter a Boolean value."  Store the value in the variable called 
     * "answer".  Let the user know if the value in the variable “answer” 
     * is true by printing an appropriate message to the console.
     * Starting with the "if" statement you built in the previous 
     * problem, add an "else" clause to it so that if the answer was false
     * your program will output "The value was false" instead.
     */
    public static void TODO4n5(){

        //TODO4&&5
        System.out.println("Is the answer the user reported true? Enter a Boolean value. "); 
        boolean answer = keyboard.nextBoolean(); 
        if (answer == true) {
            System.out.println("The value is true. "); 
        }
        else {
            System.out.println("The value is false. "); 
        }
    }

    /*
     * Ask the user for a number and then determine if the number is even or odd.  
     * Print out “the number is even” if the “number” variable holds an even value, else 
     * { print out “the number is odd” } 
     */

    public static void TODO6(){

        //TODO6
        System.out.println("Enter a number. "); 
        int number4 = keyboard.nextInt();
        if(number4%2 == 0){
            System.out.println("The number is even. ");
        }
        else {
            System.out.println("The number is odd. "); 
        }
    }

    /*
     * Ask the user for a float value that will represent a grade and determine if the grade is 
     * in the “A” range.  Print to the console “The grade is above an X” (where X is the minimum 
     * value for an "A" grade) if the grade is an “A”.  (See the grading tables linked in the 
     * Syllabus for the value.) Add to the previous "if" statement so that it becomes an "if/else"
     * structure that will now also test to see if the grade is a “B”?  Output to the console if
     * the grade is in that range. (Note the use of “&” or “&&” for logical "and" in Java.)
     */
    public static void TODO7n8(){
        //TODO7&&8
        System.out.println("Enter a float value that represents the class grade"); 
        float grade = keyboard.nextFloat();
        if (grade >= 87){
            System.out.println("The grade is above 87.\nTherefore, it is an A "); 
        }

        else if (grade >=75 && grade <= 87) {
            System.out.println("The grade is above 75 and below 87.\nTherefore, it is a B. ");  
        }
        else{
            System.out.println("Your grade is below a B.\nTry again next time :(");
        }
    }

    /*
     * Ask the user for a temperature, stored in a double.  Is the temperature higher than 78 
     * degrees or less than (or equal to) 78 degrees?  Describe the current temperature as “higher
     * than 78 degrees” or “less than or equal to 78 degrees”. 
     */

    public static void TODO9(){

        //TODO9
        System.out.println("Enter a temperature. "); 
        double temperature = keyboard.nextDouble(); 
        if (temperature > 78) {
            System.out.println("The temperature is higher than 78 degrees. "); 
        }
        else {
            System.out.println("The temperature is less than or equal to 78 degrees. "); 
        }
    }

    /* 
     * For the temperature, write an "if/else" statement that asks if the temperature is 
     * (positive & odd) OR (zero & even)?  (Notice the use of parenthesis here to define 
     * operator precedence.  Look up order of operations (PEMDAS) and “logical AND” if this is
     * unfamiliar in your text).  If it is, output “yes; positive and odd” and if it’s not, say 
     * “no; not positive and odd” on the console.
     */
    public static void TODO10(){

        //TODO10
        System.out.print("Enter a temperature: "); 
        double temperature = keyboard.nextDouble(); 
        if ((temperature > 0 && temperature%2 == 1) || 
        (temperature == 0 && temperature%2 == 0)) {
            System.out.println("Yes; positive and odd");
        }else{
            System.out.println("no; not positive and even");
        }
    }

    /*
     * Prompt the user for a letter grade and store this in a char.  Then, write a multi-way 
     * "if" statement that ends in an else-if instead of an else.  The multi-way "if" asks:  Is 
     * the grade an “A”? Else is the grade a “B”? Else is the grade a “C”? Else is the grade a “D”?
     * Else is the grade an “F”?  Notice the use of the word else in the sentence above, which 
     * provides for a more precise meaning.  In spoken English we might use the word “or” instead,
     * but of course, English is terribly ambiguous and Java needs to be discrete, deterministic, 
     * and precise.
     */
    public static void TODO11(){

        System.out.println("Enter a letter grade. "); 
        char letterGrade = keyboard.next().charAt(0);
        if(letterGrade =='A' || letterGrade == 'a')
        {
            System.out.println("The grade is an A. "); 
        }else if(letterGrade == 'B' || letterGrade =='b'){
            System.out.println("The grade is a B. "); 
        }else if(letterGrade == 'C' || letterGrade =='c'){
            System.out.println("The grade is a C. "); 
        }else if(letterGrade == 'D' || letterGrade =='d'){
            System.out.println("The grade is a D. "); 
        }else if(letterGrade == 'F' || letterGrade =='f'){
            System.out.println("The grade is an F. "); 
        }else {
            System.out.println("This is not a valid letter grade. ");
        }

    }

    /*
     * Write a function called “max” that takes two integers as input and returns the larger of 
     * the two.  
     */
    public static void runMax(){
        System.out.print("Enter two integers: ");
        int a = keyboard.nextInt(); 
        int b = keyboard.nextInt(); 
        int max = max(a,b); 
        int min;
        if (a == max) {
            min = b;
        }
        else {
            min = a;
        }

        System.out.println("Largest is " + max); 
        System.out.println("Smallest is " + min); 
    }

    /* 
     * Ask the user for two integers using a Scanner and report the largest and smallest values 
     * using the method you just built in TODO12. Feel free to copy and paste.  
     */
    public static int max(int a, int b){
        if (a>b) {
            return a; 
        }
        else {
            return b;
        }
    }

}
