import java.util.Scanner;

public class RotateByNinety {
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

            rotateBy90(arr);

            System.out.println("The rotated matrix is:");
            display(arr);
        }
    }

    public static void rotateBy90(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }

        for (int[] arr1 : arr) {
            int left = 0;
            int right = arr1.length - 1;
            while (left < right) {
                int temp = arr1[left];
                arr1[left] = arr1[right];
                arr1[right] = temp;
                left++;
                right--;
            }
        }
    }

    public static void display(int[][] arr) {
        for (int[] arr1 : arr) {
            for (int j = 0; j < arr1.length; j++) {
                System.out.print(arr1[j] + " ");
            }
            System.out.println();
        }
    }
}
