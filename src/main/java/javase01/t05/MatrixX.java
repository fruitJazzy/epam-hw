package javase01.t05;

/**
 * Created by jazzt on 27.02.16.
 */
public class MatrixX {
    public static void main(String[] args) {
        int length = Integer.parseInt(args[0]);
        int[][] matrix = new int[length][length];
        int row = 0;

        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++) {
                if (row == j || row == length - 1 - j) matrix[i][j] = 1;
                else matrix[i][j] = 0;
            }
            row++;
        }
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
