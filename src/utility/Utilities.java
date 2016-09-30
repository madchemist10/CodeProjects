package utility;

import java.io.*;
import java.util.ArrayList;

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
     * Read a file into a string arrayList representation.
     * @param filename to read data from file.
     * @return string arrayList representation of the file read in.
     */
    public static ArrayList<String> readFileToStringArray(String filename){
        ArrayList<String> output = new ArrayList<>();
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(filename)));
            String line;
            while((line = reader.readLine()) != null){
                output.add(line);
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

    /**
     * Helper method to retrieve num of divisors of a given number.
     * @param num base number to be subdivided.
     * @return int of number of divisors for given num.
     */
    public static int getNumDivisors(int num){
        //if the number is even, only need to check half of numbers
        if(num % 2 == 0) {
            num = num /2;
        }
        int divisors = 1;
        int count = 0;
        /*while numbers are evenly divisible by 2
        * increment our count (depth) and half number*/
        while(num%2 == 0){
            count++;
            num = num/2;
        }
        /*number of divisors is equal to the number of
        *times we divided num in half, plus the first time*/
        divisors = divisors * (count + 1);
        int p = 3;
        /*until the number is equal to 1, means we have
        * found all divisors*/
        while (num != 1){
            count = 0;
            //if evenly divisible, increment count, divide by p
            while(num % p == 0){
                count += 1;
                num = num / p;
            }
            /*number of divisors is equal to the number of
            *times we divided num in half, plus the first time*/
            divisors = divisors * (count + 1);
            p += 2;
        }
        return divisors;
    }
}
