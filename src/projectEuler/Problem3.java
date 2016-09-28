package projectEuler;

import utility.Utilities;

/**
 * Date: 09-28-16
 * @author MadChemist
 *
 * Question:
 * The prime factors of 13195 are 5, 7, 13 and 29.
 * What is the largest prime factor of the number 600851475143 ?
 *
 * Answer:  6857
 */
public class Problem3 {

    public static void main(String[] args) {
        long endNum = 600851475143L;  //L denotes long
        int largestPrimeFactor = 1;
        int startNum = 1;
        while(startNum < Math.sqrt(endNum)+1){
            if(endNum % startNum == 0){
                if(Utilities.isPrime(startNum)){
                    if(startNum > largestPrimeFactor){
                        largestPrimeFactor = startNum;
                    }
                }
            }
            startNum++;
        }
        System.out.println(largestPrimeFactor);
    }
}
