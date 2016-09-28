package utility;

import java.io.*;

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

    /**
     * Determine if input string is a palindrome.
     * @param str input string of potential palindrome.
     * @return true if palindrome, false if not palindrome.
     */
    public static boolean isPalindrome(String str){
        int length = str.length();
        for(int i = 0; i < ((length)/2); i++){
            if(str.charAt(i) != str.charAt(length-1-i)){
                return false;
            }
        }
        return true;
    }

    /**
     * Determine if a number is evenly divisible by another number.
     * @param num number to be divided.
     * @param divisor number to divide by.
     * @return true if evenly divisible, false if not evenly divisible.
     */
    public static boolean isEvenlyDivisible(int num, int divisor){
        return (num % divisor) == 0;
    }

    /**
     * Read a file into a string representation.
     * @param filename to read data from file.
     * @return string representation of the file read in.
     */
    public static String readFileToString(String filename){
        String output = "";
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(filename)));
            String line;
            while((line = reader.readLine()) != null){
                output += line;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return output;
    }

    /**
     * Split a string into a string array with 1 char as each
     * element.
     * @param str input string to split.
     * @return str array of individual characters.
     */
    public static String[] splitString(String str){
        String[] strArray = new String[str.length()];
        for(int i = 0; i < str.length(); i++){
            strArray[i] = str.substring(i,i+1);
        }
        return strArray;
    }
}
