package projectEuler;

import utility.Utilities;

/**
 * Date: 09-28-16
 * @author MadChemist
 *
 * Question:
 * By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.
 * What is the 10001st prime number?
 *
 * Answer:  104743
 */
public class Problem7 {

    public static void main(String[] args) {
        int maxPrime = 10001;
        int counter = 0;
        int num = 2;
        while(counter != maxPrime){
            /*Edge case for number 2 is prime.*/
            if(num == 2){
                counter++;
            }
            /*If number is mod 2 evenly, number is not prime.
            * Check if number is prime, increment counter if
            * number found is prime.*/
            else if(num % 2 != 0 && Utilities.isPrime(num)){
                counter++;
            }
            /*If counter is equal, dnt increment number for next
             * prime check.*/
            if(counter != maxPrime) {
                num++;
            }
        }
        System.out.println(num);
    }
}
