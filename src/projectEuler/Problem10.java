package projectEuler;

import utility.Utilities;

/**
 * Date: 09-28-16
 * @author MadChemist
 *
 * Question:
 * The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.
 * Find the sum of all the primes below two million.
 *
 * Answer:  142913828922
 */
public class Problem10 {

    public static void main(String[] args) {
        int maxVal = 2000000;
        long sum = 2;
        //start at 3 because 2 is only even and 1 is not
        for(int i = 2; i < maxVal; i++){
            if(i % 2 == 0){
                continue;
            }
            if(Utilities.isPrime(i)){
                sum += i;
            }
        }
        System.out.println(sum);
    }
}
