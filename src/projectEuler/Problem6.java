package projectEuler;

/**
 * Date: 09-28-16
 * @author MadChemist
 *
 * Question:
 * The sum of the squares of the first ten natural numbers is,
 * 1^2 + 2^2 + ... + 10^2 = 385
 * The square of the sum of the first ten natural numbers is,
 * (1 + 2 + ... + 10)^2 = 55^2 = 3025
 * Hence the difference between the sum of the squares of the first ten natural numbers and the square of the sum is 3025 − 385 = 2640.
 * Find the difference between the sum of the squares of the first one hundred natural numbers and the square of the sum.
 *
 * Answer:  25164150
 */
public class Problem6 {

    public static void main(String[] args) {
        int startNum = 1;
        int endNum = 100;
        int sumOfSquares = 0;
        int squareOfSum = 0;
        for(int i = startNum; i <= endNum; i++){
            sumOfSquares += (i * i);
            squareOfSum += i;
        }
        squareOfSum = squareOfSum * squareOfSum;
        int difference = squareOfSum - sumOfSquares;
        System.out.println(difference);
    }
}
