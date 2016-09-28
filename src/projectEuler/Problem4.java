package projectEuler;

import utility.Utilities;

/**
 * Date: 09-28-16
 * @author MadChemist
 *
 * Question:
 * A palindromic number reads the same both ways. The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.
 * Find the largest palindrome made from the product of two 3-digit numbers.
 *
 * Answer:  906609
 */
public class Problem4 {

    public static void main(String[] args) {
        int startNum1 = 100;
        int startNum2 = 100;
        int maxNum = 1000;
        int largestNum = 0;
        for(int i = startNum1; i < maxNum; i++){
            for(int j = startNum2; j < maxNum; j++){
                int product = i * j;
                String potentialPalindrome = Integer.toString(product);
                if(Utilities.isPalindrome(potentialPalindrome) && product > largestNum){
                    largestNum = product;
                }
            }
        }
        System.out.println(largestNum);
    }
}
