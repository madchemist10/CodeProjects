package projectEuler;

/**
 * Date: 09-29-16
 * @author MadChemist
 *
 * Question:
 * The following iterative sequence is defined for the set of positive integers:
 * n → n/2 (n is even)
 * n → 3n + 1 (n is odd)
 * Using the rule above and starting with 13, we generate the following sequence:
 * 13 → 40 → 20 → 10 → 5 → 16 → 8 → 4 → 2 → 1
 * It can be seen that this sequence (starting at 13 and finishing at 1)
 * contains 10 terms. Although it has not been proved yet (Collatz Problem),
 * it is thought that all starting numbers finish at 1.
 * Which starting number, under one million, produces the longest chain?
 * NOTE: Once the chain starts the terms are allowed to go above one million.
 *
 * Answer:  837799
 */
public class Problem14 {

    public static void main(String[] args) {
        int maxNum = 1000000;   //one million
        int largestChain = 0;
        int largestStartNum = 0;
        for(int i = 1; i < maxNum; i++){
            int chainLength = determineChainLength(i);
            if(chainLength > largestChain){
                largestChain = chainLength;
                largestStartNum = i;
            }
        }
        System.out.println(largestStartNum);
    }

    /**
     * Determine length of chain based on number.
     * @param num starting value
     * @return length of chain.
     */
    private static int determineChainLength(long num){
        int count = 0;
        while(num != 1){
            if(num%2 == 0){
                count++;
                num = num/2;
            } else{
                count++;
                num = (3*num)+1;
            }
        }
        return count+1;
    }
}
