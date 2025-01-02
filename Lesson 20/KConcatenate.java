import java.util.Scanner;

public class KConcatenate {

    public static int maxSubArraySum(int[] arr){
        int max_so_far = Integer.MIN_VALUE;
        int max_ending_here = 0;
        for (int  num: arr){
            max_ending_here += num;
            if (max_so_far < max_ending_here){
                max_so_far = max_ending_here;
            }
            System.out.println("[DEBUG]: Max SO Far:" + max_so_far + " Max Ending Here: " + max_ending_here);

            if (max_ending_here < 0){
                max_ending_here = 0;
                System.out.println("[DEBUG]: Max Ending Here: " + max_ending_here);

            }
        }
        return max_so_far;

    
    }

    public static int maxSubarraySumKConcat(int[] arr, int k) {
        int n = arr.length;
        int kadaneSum = maxSubArraySum(arr);

        if (k == 1) {
            return kadaneSum;
        }

        int arraySum = 0;
        for (int value : arr) {
            arraySum += value;
        }

        int[] doubleArray = new int[2 * n];
        System.arraycopy(arr, 0, doubleArray, 0, n);
        System.arraycopy(arr, 0, doubleArray, n, n);
        int kadaneTwoArraySum = maxSubArraySum(doubleArray);

        if (arraySum > 0) {
            return kadaneTwoArraySum + (k - 2) * arraySum;
        } else {
            return kadaneTwoArraySum;
        }
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter the size of array (N): ");
            int n = scanner.nextInt();
            
            System.out.println("Enter the elements of the array:");
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = scanner.nextInt();
            }
            
            System.out.print("Enter the value of K: ");
            int k = scanner.nextInt();
            
            int result = maxSubarraySumKConcat(arr, k);
            System.out.println("Maximum subarray sum of new array: " + result);
        }
    }
}
