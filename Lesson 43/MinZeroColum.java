import java.util.*;

public class MinZeroColum {
    public static int[] MinZeroColm(int[][] arr) {
        int[] minZeroCol = new int[arr[0].length];
        int count = 0;
        for (int[] arr1 : arr) {
            if (arr1[0] == 0) {
                count ++;
            }
        }
        int minNumOfZero  = count;
        int minZeroColm = 0;

        for (int i = 1; i<arr[0].length; i++){
            count = 0;
            for (int[] arr1 : arr) {
                if (arr1[i] == 0) {
                    count++;
                }
            }
            if (count < minNumOfZero){
                minNumOfZero = count;
                minZeroColm = i;
            }
        }
        int index = 0;
        for (int[] arr1 : arr) {
            minZeroCol[index] = arr1[minZeroColm];
            index++;
        }

        return minZeroCol;
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
            System.out.println("Array:");
            for (int[] row : arr) {
                for (int num : row) {
                    System.out.print(num + " ");
                }
                System.out.println();
            }
            int[] columnWithMinZero = MinZeroColm(arr);
            System.out.println("Column with the minimum zero: ");
            for (int num : columnWithMinZero){
                System.out.println(num + " ");
            }

        }
    }

}
