import java.util.*;

public class RowWithMoreSum {
    public static int[] MaxSumRow(int[][] arr) {
        int[] maxRow = arr[0];
        int maxSum = 0;
        for (int k = 0; k < arr[0].length; k++) {
            maxSum += arr[0][k];
        }
        for (int i = 1; i < arr.length; i++){
            int sum = 0;
            for (int j = 0; j < arr[i].length; j++){
                sum += arr[i][j];
            }
            if (sum > maxSum){
                maxSum = sum;
                maxRow = arr[i];
            }
        }
        return maxRow;
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
            int[] rowWithMax = MaxSumRow(arr);
            System.out.println("Row with the maximum sum: ");
            for (int num : rowWithMax){
                System.out.print(num + " ");
            }

        }
    }
}
