package projectEuler;

import utility.Utilities;

/**
 * Date: 09-28-16
 * @author MadChemist
 *
 * Question:
 * 2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.
 * What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?
 *
 * Answer:  232792560
 */
public class Problem5 {

    public static void main(String[] args) {
        int smallestNum;
        int startNum = 1;
        int endNum = 20;
        boolean found = false;
        int num = 1;
        while(true) {
            for (int i = startNum; i < endNum; i++) {
                found = Utilities.isEvenlyDivisible(num, i);
                if(!found){
                    break;
                }
            }
            if(found){
                smallestNum = num;
                break;
            }
            num++;
        }
        System.out.println(smallestNum);
    }
}
