import java.util.Scanner;
/**
 * This is HW#1 for CSS161, called "Methods - Mario Boards"
 * 
 * @author (Navdeep Kaur) 
 * @version (04/06/2016)
 */
public class KaurNavdeep_HW_Methods
{
    public static void main (String[] args) {
        runProgramOne(); 
        runProgramTwo();
    }

    public static void runProgramOne() {
        System.out.println("Mario Board 1:"); 
        segment1();
        segment2();
        segment2();
        segment1();
        segment3();
    }
    public static void runProgramTwo() {  
        Scanner keyboard1 = new Scanner(System.in); 
        System.out.print("What does Mario Look like? "); 
        String mario = keyboard1.next();
        System.out.print("What does a Coin look like? "); 
        String coin = keyboard1.next(); 
        System.out.println("Here is your level ..."); //header 
        segment1();
        segment2();
        segment2WithCoin(coin); //with coins 
        segment1WithCoin(coin); 
        segment3WithMario(mario); //with mario 

    }

    public static void segment1() {
        System.out.println("||\n||\n||\n||\n||\n||\n");
    }

    public static void segment1WithCoin(String coin) {
        System.out.println("||\n||"); 
        System.out.println("||" + coin); 
        System.out.println("||" + coin); 
        System.out.println("||" + coin);
        System.out.println("||\n");
    }

    public static void segment2() {
        System.out.println("||\n||    |?|\n||\n||\n||    |?|\n||\n");
    }

    public static void segment2WithCoin(String coin) {
        System.out.println("||");
        System.out.println("||    |?|" + coin); 
        System.out.println("||\n||"); 
        System.out.println("||    |?|" + coin); 
        System.out.println("||\n");
    }

    public static void segment3() {
        System.out.println("||\n||||\n||||||\n||||||||\n||||||||||\n||||||||||||"); 
        System.out.println("||\n||              ^\n|----------------");
    }

    public static void segment3WithMario(String mario) {
        System.out.println("||\n||||\n||||||\n||||||||\n||||||||||\n||||||||||||" + mario); 
        System.out.println("||\n||              ^\n|----------------");
    }

}

