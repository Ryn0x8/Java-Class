import java.util.*;

public class NumNonZeroRows {
    public static int NumNonZeroRow(int[][] arr) {
        int count = 0;
        
        for (int[] arr1 : arr) {
            boolean NoZero = true;
            for (int j = 0; j < arr1.length; j++) {
                if (arr1[j] == 0) {
                    NoZero = false;
                    break;
                }
            }
            if (NoZero) {
                count++;
            }
        }
        return count;
        
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
            System.out.println("The number of rows having no zero element is "  + NumNonZeroRow(arr));

        }
    }
}