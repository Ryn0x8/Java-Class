
import java.util.Arrays;

public class CircularSubArraySum {
    public static void main(String[] args) {
        int[] arr = {5, -3, 5};
        System.out.println("Array is: " + Arrays.toString(arr));

        int max = maxCircularSubArraySum(arr);
        System.out.println("Max Circular Subarray sum is:"+ max);

    }
    static int maxCircularSubArraySum(int[] arr){
        int max = maxSubArraySum(arr);
        int sum = 0;
        for (int i = 0; i < arr.length; i++){
            sum += arr[i];
            arr[i] = -arr[i];
        }
        int maxWrap = sum + maxSubArraySum(arr);
        if (maxWrap == 0){
            return max;
        }
        return Math.max(max, maxWrap);
        

    }

    static int maxSubArraySum(int[] arr){
        int max_so_far = Integer.MIN_VALUE;
        int max_ending_here = 0;
        for (int num: arr){
            max_ending_here += num;
            if (max_so_far < max_ending_here){
                max_so_far = max_ending_here;
            }
            if (max_ending_here <0){
                max_ending_here = 0;
            }
        }
        return max_so_far;

    }

}