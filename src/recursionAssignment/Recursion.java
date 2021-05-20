package recursionAssignment;

public class Recursion{

    public static int count7(int n){

        int check = 0;

        if (n/10 == 0){

            if (n == 7){

             return 1;

            }
            
            return 0;

        }
        else if (n%10 == 7){

            check = 1;

        }

        return count7(n/10) + check;

    }




}
