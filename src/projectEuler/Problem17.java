package projectEuler;

/**
 *
 * Date: 10-17-16
 * @author MadChemist
 *
 * Question:
 * If the numbers 1 to 5 are written out in words: one, two, three, four, five, then there are 3 + 3 + 5 + 4 + 4 = 19 letters used in total.
 * If all the numbers from 1 to 1000 (one thousand) inclusive were written out in words, how many letters would be used?
 * NOTE: Do not count spaces or hyphens.
 * For example, 342 (three hundred and forty-two) contains 23 letters and 115 (one hundred and fifteen) contains 20 letters.
 * The use of "and" when writing out numbers is in compliance with British usage.
 *
 * Answer:  21124
 */
public class Problem17 {
    /**Words 1 - 15 are special cases and basis for all other numbers.*/
    private static String[] words = {"","one","two","three","four","five","six","seven","eight","nine","ten","eleven","twelve","thirteen","fourteen","fifteen","sixteen","seventeen","eighteen","nineteen"};
    private static String[] tensWords = {"","","twenty","thirty","forty","fifty","sixty","seventy","eighty","ninety"};
    private static String HUNDRED = "hundred";
    private static String THOUSAND = "thousand";
    private static String AND = "and";

    public static void main(String[] args) {
        int minNum = 1;
        int maxNum = 1000;
        int totalCount = 0;
        for(int i = minNum; i <= maxNum; i++){
            totalCount += numToWords(i).length();
        }
        System.out.println(totalCount);
    }

    private static String numToWords(int num){
        String number = Integer.toString(num);
        switch(number.length()){
            case 1:
                return getOneDigitWord(num);
            case 2:
                return getTwoDigitWord(num);
            case 3:
                return getThreeDigitWord(num);
            case 4:
                return getFourDigitWord(num);
        }
        return "";
    }

    private static String getOneDigitWord(int num){
        return words[num];
    }

    private static String getTwoDigitWord(int num){
        String number = Integer.toString(num);
        if(number.length() == 1){
            return getOneDigitWord(num);
        }
        int onesPlace = Integer.parseInt(number.substring(1));
        int tensPlace = Integer.parseInt(number.substring(0,1));
        if(num >= 10 && num < 20){
            return getOneDigitWord(num);
        }
        if(tensPlace != 0) {
            return tensWords[tensPlace] + getOneDigitWord(onesPlace);
        }
        return getOneDigitWord(onesPlace);
    }

    private static String getThreeDigitWord(int num){
        int tens = Integer.parseInt(Integer.toString(num).substring(1));
        int hundredsPlace = Integer.parseInt(Integer.toString(num).substring(0,1));
        if(tens != 0) {
            return getOneDigitWord(hundredsPlace) + HUNDRED + AND + getTwoDigitWord(tens);
        }
        return getOneDigitWord(hundredsPlace) + HUNDRED;
    }

    private static String getFourDigitWord(int num){
        int hundreds = Integer.parseInt(Integer.toString(num).substring(1));
        int thousandsPlace = Integer.parseInt(Integer.toString(num).substring(0,1));
        if(hundreds != 0) {
            return getOneDigitWord(thousandsPlace) + THOUSAND + AND + getThreeDigitWord(hundreds);
        }
        return getOneDigitWord(thousandsPlace) + THOUSAND;
    }
}
