
public class Zad7 {
    public void Init() {
        int[][] matrixA = new int[10][10];
        int[][] matrixB = new int[10][10];

        FillMatrix(matrixA);
        FillMatrixWithZero(matrixB);
        SumMatrixes(matrixA, matrixB);
        PrintMatrix(matrixB);
    }

    public void FillMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = j;
            }
        }
    }

    public void FillMatrixWithZero(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = 0;
            }
        }
    }

    public void SumMatrixes(int[][] matrixA, int[][] matrixB) {
        for (int i = 0; i < matrixA.length; i++) {
            for (int j = 0; j < matrixA[i].length; j++) {
                matrixB[j][i] = matrixA[i][j];
            }
        }
    }

    public void PrintMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }
}
