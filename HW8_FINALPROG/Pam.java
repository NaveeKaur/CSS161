
/** 
 * The purpose of this code is to create a template for PAM250 to compare DNA sequences using a multidimensional array. 
 * For example, if you have two DNA sequences <AATGCTA> and <AAGGA>, you notice that there are two gaps and one mistmatch. Essentially,
 * you would implement these numbers into the main below. The bigger and the more negative the score is, the less related the two DNA sequences are.
 * 
 * @author (Navdeep Kaur) 
 * @version (Final HW Assignment)
 * 
 * All credit for the PAM250 template goes to <https://github.com/blackrim/phyutility/blob/master/src/jebl/evolution/align/scores/Pam250.java>
 * I could have never done it by myself in such little time. Everything else is my work. 
 */

public class Pam //Feature #5
{

    public final int[][] PAM_SCORES = { //Feature #6: This is a multi-dimesnional array. 
            // A=0 R=1 N=2 D=3 C=4 Q=5 E=6 G=7 H=8 I=9 L=10 K=11 M=12 F=13 P=14 S=15 T=16 W=17 Y=18 V=19 /
            /*A=0*/{   2},
            /*R=1*/{  -2,  6},
            /*N=2*/{   0,  0,  2},
            /*D=3*/{   0, -1,  2, 4},
            /*C=4*/{  -2, -4, -4, -5, 12},
            /*Q=5*/{   0,  1,  1,  2, -5, 4},
            /*E=6*/{   0, -1,  1,  3, -5,  2, 4},
            /*G=7*/{   1, -3,  0,  1, -3, -1,  0, 5},
            /*H=8*/{  -1,  2,  2,  1, -3,  3,  1, -2, 6},
            /*I=9*/{  -1, -2, -2, -2, -2, -2, -2, -3, -2,  5},
            /*L=10*/{  -2, -3, -3, -4, -6, -2, -3, -4, -2,  2,  6},
            /*K=11*/{  -1,  3,  1,  0, -5,  1,  0, -2,  0, -2, -3,  5},
            /*M=12*/{  -1,  0, -2, -3, -5, -1, -2, -3, -2,  2,  4,  0,  6},
            /*F=13*/{  -3, -4, -3, -6, -4, -5, -5, -5, -2,  1,  2, -5,  0,  9},
            /*P=14*/{   1,  0,  0, -1, -3,  0, -1,  0,  0, -2, -3, -1, -2, -5,  6},
            /*S=15*/{   1,  0,  1,  0,  0, -1,  0,  1, -1, -1, -3,  0, -2, -3,  1,  2},
            /*T=16*/{   1, -1,  0,  0, -2, -1,  0,  0, -1,  0, -2,  0, -1, -3,  0,  1,  3},
            /*W=17*/{  -6,  2, -4, -7, -8, -5, -7, -7, -3, -5, -2, -3, -4,  0, -6, -2, -5, 17},
            /*Y=18*/{  -3, -4, -2, -4,  0, -4, -4, -5,  0, -1, -1, -4, -2,  7, -5, -3, -3,  0, 10},
            /*V=19*/{   0, -2, -2, -2, -2, -2, -2, -1, -2,  4,  2, -2,  2, -1, -1, -1,  0, -6, -2,  4}}; 

    //size is 20, indices are 0-19. 0 is a, 19 is v. 

    public Pam() { //you dont need anything in this bc its only relvent for the class Alignment 

    }

    public int translate(char var) //this translates the amino acid one-letter codes to a number, according to the matrix above. 
    {
        if(var == 'A') { ////Feature #3
            return 0;
        } else if(var =='R') {
            return 1;
        }else if(var =='N') {
            return 2;
        }else if(var =='D') {
            return 3;
        }else if(var =='C') {
            return 4;
        }else if(var =='Q') {
            return 5;
        }else if(var =='E') {
            return 6;
        }else if(var =='G') {
            return 7;
        }else if(var =='H') {
            return 8;
        }else if(var =='I') {
            return 9;
        }else if(var =='L') {
            return 10;
        }else if(var =='K') {
            return 11;
        }else if(var =='M') {
            return 12;
        }else if(var =='F') {
            return 13;
        }else if(var =='P') {
            return 14;
        }else if(var =='S') {
            return 15;
        }else if(var =='T') {
            return 16;
        }else if(var =='W') {
            return 17;
        }else if(var =='Y') {
            return 18;
        }else if(var =='V') {
            return 19;
        }
        else {
            System.out.println("Error: Invalid Amino Acid - returning default value -1"); 
            return -1; 
        }
    }


    public int getScore(int row, int column) { //Feature #1

        if(row < column) //Feature #3
        {
            int temp = row;
            row = column;
            column = temp;
        }

        return PAM_SCORES[row][column]; //leave this alone. This is for getting the PAM250 score. 
    }

    public int getScoreWithCharacter(char row, char column) { //Feature #1: this is to translate the characters of the rows and columns. Using different methods makes life easier. 
        int r,c;
        r = translate(row);
        c = translate(column);
        return getScore(r,c);
    }

}
