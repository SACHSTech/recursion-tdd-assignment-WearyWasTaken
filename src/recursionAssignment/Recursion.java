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

    /**
     * Replaces all "pi"s in a string with 3.14
     * @author A. Wong
     */
    public static String changePi(String str){

        int check;

        //Finds the index of the first pi
        check = str.indexOf("pi");

        //If pi was not found, return the string
        if (check == -1){

            return str;

        }

        //Checks if pi is at the end of string
        //If it is adds 3.14 to the end of the string
        else if (check + 1 < str.length()){

            return str.substring(0,check) + 3.14 + changePi(str.substring(check + 2, str.length()));

        }
        else{

            return str.substring(0,check) + 3.14;

        }

    }

    /**
     * Checks if a string contains a substring a certain amount of times
     * @author A. Wong
     */
     public static boolean strCopies(String str, String sub, int n){

        return true;

     }

}
