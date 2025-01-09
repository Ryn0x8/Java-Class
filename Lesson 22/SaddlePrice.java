import java.util.Scanner;

public class SaddlePrice {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the size of the matrix (n): ");
            int n = sc.nextInt();
            int[][] matrix = new int[n][n];
            System.out.println("Enter the elements of the matrix row by row:");
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    matrix[i][j] = sc.nextInt();
                }
            }
            for (int i = 0; i < n; i++) {
                int minRowValue = matrix[i][0];
                int minColIndex = 0;
                for (int j = 1; j < n; j++) {
                    if (matrix[i][j] < minRowValue) {
                        minRowValue = matrix[i][j];
                        minColIndex = j;
                    }
                }
                boolean isSaddle = true;
                for (int k = 0; k < n; k++) {
                    if (matrix[k][minColIndex] > minRowValue) {
                        isSaddle = false;
                        break;
                    }
                }
                if (isSaddle) {
                    System.out.println("Saddle price: " + minRowValue);
                    return;
                }
            }
        }
        System.out.println("No saddle price found");
    }
}
