package recursionAssignment;

public class Recursion{

    /**
     * Counts the number of zeros in the inputed int
     * Returns the number of 7s
     * @author A. Wong
     */

    public static int count7(int n){

        int check = 0;

        //Check if the number is bigger than 1 digit
        if (n/10 == 0){

            //If the single digit is 7 return 1
            //Otherwise return 0
            if (n == 7){

             return 1;

            }

            return 0;

        }
        //If the last digit is a 7 adds 1
        else if (n%10 == 7){

            check = 1;

        }

        //Recursively goes through the number until it is finished
        return count7(n/10) + check;

    }

    public static String changePi(String str){

        return "x3.14x";

    }



}
