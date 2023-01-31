package semester_1.homework.L5;

public class T4_Matrix {
    public static void main(String[] args) {
        int[][] matrix = {{2, 3}, {4, 5}, {7, 8}, {9, 0}};

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }

            System.out.println();
        }
    }
}