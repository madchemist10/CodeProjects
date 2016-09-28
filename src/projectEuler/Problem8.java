package projectEuler;

import utility.Utilities;

import java.io.File;

/**
 * Date: 09-28-16
 * @author MadChemist
 *
 * Data files: resources/problem8TextFile.txt
 *
 * Question:
 * The four adjacent digits in the 1000-digit number that have the greatest product are 9 × 9 × 8 × 9 = 5832.
 * Find the thirteen adjacent digits in the 1000-digit number that have the greatest product. What is the value of this product?
 *
 * Answer:  23514624000
 */
public class Problem8 {

    public static void main(String[] args) {
        String filename = "src\\projectEuler\\resources\\problem8TextFile.txt";
        File file = new File(filename);
        String readFile = Utilities.readFileToString(file.getAbsolutePath());
        long largestProduct = 0;
        int numOfConsecutiveIntegers = 13;
        int startPointer = 0;
        for(int i = 0; i < readFile.length()-numOfConsecutiveIntegers; i++){
            String consecutiveNumbers = readFile.substring(startPointer+i, numOfConsecutiveIntegers+i);
            /*Result will always result in 0 if 0 is in string.*/
            if(consecutiveNumbers.contains("0")){
                continue;
            }
            String[] splitArray = Utilities.splitString(consecutiveNumbers);
            long product = 1;
            for(String num : splitArray){
                product *= Integer.parseInt(num);
            }
            if(product > largestProduct){
                largestProduct = product;
            }
        }
        System.out.println(largestProduct);
    }
}
