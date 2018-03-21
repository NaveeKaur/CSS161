/**
 * Navdeep Kaur 
 * April 29th 2016 
 */
import java.text.DecimalFormat;
import java.util.*;
public class KaurNavdeep_HW_Loops
{
    static DecimalFormat df = new DecimalFormat("0.###");
    public static void main (String[] args)
    {
        pairwise();
    }

    private static String complement(String dna)
    {
        String a ="";
        String upper = dna.toUpperCase();
        for(int i = 0; i < upper.length();i++)
        {
            if(upper.charAt(i) == 'A')
            {
                a += 'T';
            }
            else if(upper.charAt(i) == 'T')
            {
                a += 'A';
            }
            else if(upper.charAt(i) == 'G')
            {
                a+= 'C';
            }
            else
            {
                a+='G';
            }
        }
        return a;

    }

    public static String getuserdna()
    {
        String dna ="";
        Scanner keypord = new Scanner(System.in);
        do
        {
            System.out.print("Enter DNA string using the characters A/C/T/G: ");
            dna = keypord.next();
        }while (!verify(dna));
        return dna;
    }
    public static boolean verify(String dna)
    {
        String upper = dna.toUpperCase();
        for(int i = 0; i < upper.length();i++)
        {
            if(upper.charAt(i) == 'A' ||upper.charAt(i) == 'C'||upper.charAt(i) == 'G'||upper.charAt(i) == 'T')
            {

            }
            else
            {
                System.out.println("The dna base pair at index "+ i + " is not correct." );
                System.out.println(upper.charAt(i));
                return false;
            }
        }
        return true;
    }

    public static int getCount(char base, String dna)
    {
        int count = 0;
        String upper = dna.toUpperCase();
        for(int i =0; i< upper.length();i++)
        {
            if(upper.charAt(i) == base)
            {
                count++;
            }
        }
        return count;
    }
    public static double calculateRatio(char a, char b, String dna)
    {
        double ratio = 1;
        int length = dna.length();
        ratio = ((double)getCount(a,dna) + getCount(b,dna))/length;
        return ratio;
    }

    public static void pairwise()
    {
        String dna = getuserdna();
        System.out.println("Sequence 1: " + dna);
        System.out.println("\tC-count: "+ getCount('C', dna));
        System.out.println("\tCG-ratio: " +df.format(calculateRatio('C','G',dna)));
        System.out.println("\tComplement: " +complement(dna));
        System.out.println();
        String dna2 = getuserdna();
        System.out.println("Sequence 2: " + dna2);
        System.out.println("\tC-count: "+ getCount('C', dna2));
        System.out.println("\tCG-ratio: " +df.format(  calculateRatio('C','G',dna2)));
        System.out.println("\tComplement: " +complement(dna2));
        alignment(dna,dna2);
    }

    private static void alignment(String dna, String dna2)
    {
        int score = 0;
        int maxScore = 0;
        String smaller, bigger;
        if(dna.length() > dna2.length())
        {
            bigger= dna;
            smaller= dna2;
        }
        else
        {
            bigger = dna2;
            smaller = dna;
        }
        String bestbig ="";
        String bestsmall="";

        int difference = bigger.length()-smaller.length();
        for(int j =0; j < difference; j++)
        {
            score= 0;
            for (int i = 0; i < smaller.length(); i++)
            {
                if (bigger.charAt(i) == smaller.charAt(i))
                {
                    score++;
                }
            }
            if(maxScore < score)
            {
                maxScore = score;
                bestbig = bigger;
                bestsmall=smaller;
            }
            smaller = ' ' + smaller;
        }
        System.out.println("Best Alignment score: " + maxScore);
        System.out.println("\t" + bestbig +"\n\t" + bestsmall);
    }
}