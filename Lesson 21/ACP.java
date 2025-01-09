import java.util.Scanner;

public class ACP {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the number of rows and columns for the first matrix:");
            int n1 = sc.nextInt();
            int m1 = sc.nextInt();

            System.out.println("Enter the elements of the first matrix:");
            int[][] a1 = new int[n1][m1];
            for (int i = 0; i < n1; i++) {
                for (int j = 0; j < m1; j++) {
                    a1[i][j] = sc.nextInt();
                }
            }

            System.out.println("Enter the number of rows and columns for the second matrix:");
            int n2 = sc.nextInt();
            int m2 = sc.nextInt();

            System.out.println("Enter the elements of the second matrix:");
            int[][] a2 = new int[n2][m2];
            for (int i = 0; i < n2; i++) {
                for (int j = 0; j < m2; j++) {
                    a2[i][j] = sc.nextInt();
                }
            }

            if (m1 != n2) {
                System.out.println("Invalid input");
                return;
            }

            int[][] product = new int[n1][m2];
            for (int i = 0; i < n1; i++) {
                for (int j = 0; j < m2; j++) {
                    for (int k = 0; k < m1; k++) {
                        product[i][j] += a1[i][k] * a2[k][j];
                    }
                }
            }

            System.out.println("The product of the matrices is:");
            for (int i = 0; i < n1; i++) {
                for (int j = 0; j < m2; j++) {
                    System.out.print(product[i][j] + " ");
                }
                System.out.println();
            }
        }
    }
}
