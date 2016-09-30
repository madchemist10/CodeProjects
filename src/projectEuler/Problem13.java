package projectEuler;

import utility.Utilities;

import java.io.File;
import java.util.ArrayList;

/**
 * Date: 09-29-16
 * @author MadChemist
 *
 * Data files: resources/problem13TextFile.txt
 *
 * Question:
 * Work out the first ten digits of the sum of the following one-hundred 50-digit numbers.
 *
 * Answer:  5537376230
 */
public class Problem13 {

    public static void main(String[] args) {
        String filename = "src\\projectEuler\\resources\\problem13TextFile.txt";
        File file = new File(filename);
        ArrayList<String> readFile = Utilities.readFileToStringArray(file.getAbsolutePath());
        String[] numbers = new String[readFile.size()];
        for(int i = 0; i < readFile.size(); i++){
            numbers[i] = readFile.get(i);
        }
        long sum = 0;
        for (String number : numbers) {
            sum += Long.parseLong(number.substring(0, 15));
        }
        String strSum = Long.toString(sum);
        System.out.println(strSum.substring(0,10));

    }
}
