package codemonk.arraysandstrings.monkandinversions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class MonkAndInversions {

    public String solution(String input) {

        Scanner s = new Scanner(input);
        StringBuilder sb = new StringBuilder();
        int lines = Integer.parseInt(s.nextLine());

        for (int i = 0; i < lines; i++) {

            int matrixSize = s.nextInt();
            int[][] matrix = new int[matrixSize][matrixSize];

            for (int j = 0; j < matrixSize; j++) {

                for (int k = 0; k < matrixSize; k++) {

                    matrix[j][k] = s.nextInt();
                }
            }
            
            int counter = 0;

            for (int j = 0; j < matrixSize; j++) {

                for (int k = 0; k < matrixSize; k++) {

                    counter += inversionCounter(matrix, j, k);
                }
            }
            sb.append(counter).append("\n");
        }
        return sb.toString().trim();
    }
    
    private int inversionCounter(int[][] matrix, int row, int col) {

        int counter = 0;
        int base = matrix[row][col];

        for (int i = row; i < matrix.length; i++) {

            for (int j = col; j < matrix.length; j++) {

                if (matrix[row][col] > matrix[i][j]) {

                    counter++;
                }
            }
        }
        return counter;
    }
}
