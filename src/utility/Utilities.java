package utility;

/**
 * Helper static methods to assist with functionality in different modules.
 */
public class Utilities {

    /**
     * Check to see if the given number is prime.
     * Accounts for 2 being prime.
     * @param num number to check for prime.
     * @return true if prime, false if not prime.
     */
    public static boolean isPrime(int num){
        double root = Math.sqrt(num)+1;
        /*Handles case where 2 is prime number.*/
        if(num == 2){
            return true;
        }
        /*Handles case where number is even.*/
        else if(num % 2 == 0){
            return false;
        }
        int i = 3;
        while(i < root){
            if (num % i == 0){
                return false;
            }
            i+=2;
        }
        return true;
    }
}
