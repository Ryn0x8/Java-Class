
import java.util.Arrays;


public class SubArraySum {

    public static void main(String[] args){
        int[] arr = { 0, 1, 2, 3, 4, 5, -5};

        int max = maxSubArraySum(arr);

        System.out.println("Array is: " +Arrays.toString(arr));
        System.out.println("Max Subarray sum is:" + max);

    }

    static int maxSubArraySum(int[] arr){
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

}
