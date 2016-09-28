package projectEuler;

/**
 * Date: 09-28-16
 * @author MadChemist
 *
 * Question:
 * If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.
 * Find the sum of all the multiples of 3 or 5 below 1000.
 *
 * Answer: 233168
 */
public class Problem1 {

    public static void main(String[] args) {
        int maxNum = 1000;
        int runningSum = 0;
        for(int i = 0; i < maxNum; i++){
            if(i % 3 == 0 || i % 5 == 0){
                runningSum += i;
            }
        }
        System.out.println(runningSum);
    }
}
