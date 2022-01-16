import java.util.Scanner;

public class Task2 {

    public static void hasNeighbor(int[][] A, int[][] B, int row, int column, int i, int j) {

        if (B[i][j] == -1) {
            return;
        }

        B[i][j] = -1;

        if (i + 1 < row) {
            if (A[i + 1][j] == A[i][j]) {
                hasNeighbor(A, B, row, column, i + 1, j);
            }
        }

        if (i - 1 >= 0) {
            if (A[i - 1][j] == A[i][j]) {
                hasNeighbor(A, B, row, column, i - 1, j);
            }
        }

        if (j + 1 < column) {
            if (A[i][j + 1] == A[i][j]) {
                hasNeighbor(A, B, row, column, i, j + 1);
            }
        }

        if (j - 1 >= 0) {
            if (A[i][j - 1] == A[i][j]) {
                hasNeighbor(A, B, row, column, i, j - 1);
            }
        }

    }

    public static int solution(int[][] A) {
        int row = A.length;
        int column = A[0].length;
        int result = 0;

        if (row == 0 || column == 0) {
            return 0;
        }

        int[][] B = new int[A.length][];

        // Clonning A array into B
        for (int i = 0; i < A.length; i++) {
            int[] aMatrix = A[i];
            int aLength = aMatrix.length;
            B[i] = new int[aLength];
            System.arraycopy(aMatrix, 0, B[i], 0, aLength);
        }

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                if (B[i][j] >= 0) {
                    hasNeighbor(A, B, row, column, i, j);
                    result += 1;
                }
            }
        }
        return result;

    }

    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {
            // Enter number of rows
            int row = scanner.nextInt();

            // Enter number of columns
            int column = scanner.nextInt();

            int[][] A = new int[row][column];

            int row_counter = 1;
            while (row_counter <= row) {
                int column_counter = 1;
                while (column_counter <= column) {

                    // Enter elements of each rows
                    int element = scanner.nextInt();

                    A[row_counter - 1][column_counter - 1] = element;
                    column_counter++;
                }
                column_counter = 1;
                row_counter++;
            }
            int result = solution(A);

            // Final Answer
            System.out.println(result);
        }

    }
}
