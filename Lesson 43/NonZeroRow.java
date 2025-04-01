import java.util.*;

public class NonZeroRow {
    public static boolean isNonZeroRow(int[][] arr, int r) {
        if (r < 0 || r >= arr.length) {
            System.out.println("Invalid row number");
            return false;
        }
        for (int j = 0; j < arr[r].length; j++) {
            if (arr[r][j] == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the number of rows and columns in the array:");
            int n = sc.nextInt();
            int m = sc.nextInt();
            System.out.println("Enter the elements of the array:");
            int[][] arr = new int[n][m];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    arr[i][j] = sc.nextInt();
                }
            }
            System.out.println("Enter the row number to check for non-zero elements:");
            int r = sc.nextInt();
            boolean nonZero = isNonZeroRow(arr, r);
            if (nonZero) {
                System.out.println("Row " + r + " contains only non-zero elements.");
            } else {
                System.out.println("Row " + r + " contains zero elements.");
            }

        }
    }
}