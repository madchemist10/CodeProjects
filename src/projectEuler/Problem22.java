package projectEuler;

import utility.Utilities;

import java.io.File;
import java.util.Arrays;

/**
 * Date: 10-01-16
 * @author MadChemist
 *
 *
 * Data files: resources/problem22TextFile.txt
 *
 * Question:
 * Using names.txt (right click and 'Save Link/Target As...'),
 * a 46K text file containing over five-thousand first names, begin by sorting it into alphabetical order.
 * Then working out the alphabetical value for each name, multiply this value by
 * its alphabetical position in the list to obtain a name score.
 * For example, when the list is sorted into alphabetical order, COLIN, which is
 * worth 3 + 15 + 12 + 9 + 14 = 53, is the 938th name in the list.
 * So, COLIN would obtain a score of 938 × 53 = 49714.
 * What is the total of all the name scores in the file?
 *
 * Answer:  871198282
 */
public class Problem22 {
    private static char[] ALPHABET = {'A','B','C','D','E','F','G','H',
            'I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};

    public static void main(String[] args) {
        String filename = "src\\projectEuler\\resources\\problem22TextFile.txt";
        File file = new File(filename);
        String readFile = Utilities.readFileToString(file.getAbsolutePath());
        readFile = readFile.replace("\"","");
        String[] splitFile = readFile.split(",");
        Arrays.sort(splitFile);
        int total = 0;
        for(int i = 0; i < splitFile.length; i++){
            total+=determineValue(i+1,splitFile[i]);
        }
        System.out.println(total);
    }

    /**
     * Helper method to determine value of a name.
     * @param indexValue index of name in sorted list.
     * @param name to determine value of
     * @return int of name's complete value.
     */
    private static int determineValue(int indexValue, String name){
        int sum = 0;
        char[] characters = name.toCharArray();
        for (char character : characters) {
            int charValue = determineCharacterValue(character);
            if (charValue != -1) {
                sum += charValue;
            }
        }
        return sum*indexValue;
    }

    /**
     * Helper method to determine the value of a specific character.
     * @param character to determine value of.
     * @return ALPHABET index of character, -1 if not found.
     */
    private static int determineCharacterValue(char character){
        for(int i = 0; i < ALPHABET.length; i++){
            if(character == ALPHABET[i]){
                return i+1;
            }
        }
        return -1;  //should never occur.
    }
}
