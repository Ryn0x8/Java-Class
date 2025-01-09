import java.util.Scanner;

public class DiagonalTraversal {
    public static void main(String[] args) {
        try (Scanner scn = new Scanner(System.in)) {
            System.out.print("Enter the size of the matrix (n x n): ");
            int n = scn.nextInt();

            int[][] arr = new int[n][n];
            System.out.println("Enter the elements of the " + n + "x" + n + " matrix:");
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    arr[i][j] = scn.nextInt();
                }
            }

            System.out.println("The diagonally traversed matrix:");

            for (int move = 0; move < n; move++) {
                int i = 0;
                int j = move;
                while (i < n && j < n) {
                    System.out.print(arr[i][j] + " ");
                    i++;
                    j++;
                }
                System.out.println();
            }

            for (int move = 1; move < n; move++) {
                int i = move;
                int j = 0;
                while (i < n && j < n) {
                    System.out.print(arr[i][j] + " ");
                    i++;
                    j++;
                }
                System.out.println();
            }
        }
    }
}
