package projectEuler;

import utility.Utilities;

import java.io.File;

/**
 * Date: 09-29-16
 * @author MadChemist
 *
 * Data files: resources/problem11TextFile.txt
 *
 * Question:
 * In the 20×20 grid below, four numbers along a diagonal line have been marked in red.
 * The product of these numbers is 26 × 63 × 78 × 14 = 1788696.
 * What is the greatest product of four adjacent numbers in the same direction
 * (up, down, left, right, or diagonally) in the 20×20 grid?
 *
 * Answer:  70600674
 */
public class Problem11 {

    public static void main(String[] args) {
        String filename = "src\\projectEuler\\resources\\problem11TextFile.txt";
        File file = new File(filename);
        String readFile = Utilities.readFileToString(file.getAbsolutePath());
        String[] fullGrid = readFile.split(" ");
        int gridDim = 20;
        int[][] grid = new int[gridDim][gridDim];
        int[] tempRow = new int[gridDim];
        int counter = 0;
        for(int i = 0; i < 400; i++){
            int temp = Integer.parseInt(fullGrid[i]);
            if(temp < 10){
                temp = 0;
            }
            tempRow[i%gridDim] = temp;
            if(i%gridDim == gridDim-1) {
                grid[counter] = tempRow;
                tempRow = new int[gridDim];
                counter++;
            }
        }
        long maxProduct = 0;
        for(int row = 0; row < gridDim; row++){
            for(int col = 0; col < gridDim; col++){
                /*Horizontal*/
                if(col < gridDim-3) {
                    int productHorizontal = grid[row][col] * grid[row][col+1] * grid[row][col+2] * grid[row][col+3];
                    if (productHorizontal > maxProduct) {
                        maxProduct = productHorizontal;
                    }
                }
                /*Vertical*/
                if(row < gridDim-3){
                    int productVertical = grid[row][col] * grid[row+1][col] * grid[row+2][col] * grid[row+3][col];
                    if(productVertical > maxProduct){
                        maxProduct = productVertical;
                    }
                }
                /*Diagonal Left to Right*/
                if(row < gridDim-3 && col < gridDim-3){
                    long productLeftRightDiagonal = grid[row][col] * grid[row + 1][col + 1] * grid[row + 2][col + 2] * grid[row + 3][col + 3];
                    if (productLeftRightDiagonal > maxProduct) {
                        maxProduct = productLeftRightDiagonal;
                    }
                }
                /*Diagonal Right to Left*/
                if(row >= 3 && col >= 3 && row < gridDim-3 && col < gridDim-3){
                    int productRightLeftDiagonal = grid[row][col] * grid[row-1][col+1] * grid[row-2][col+2] * grid[row-3][col+3];
                    if(productRightLeftDiagonal > maxProduct){
                        maxProduct = productRightLeftDiagonal;
                    }
                }
            }
        }
        System.out.println(maxProduct);
    }
}
