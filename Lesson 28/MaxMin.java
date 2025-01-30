import java.util.*;

public class MaxMin {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)){
            System.out.print("Enter the number of elements: ");
            int n = sc.nextInt();
            int[] arr = new int[n];
            System.out.print("Enter the elements: ");
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            System.out.println("Max: "+max(arr, Integer.MIN_VALUE, 0));
            System.out.println("Min: "+min(arr, Integer.MAX_VALUE, 0));
        }   
    }
    
    public static int max(int[] arr, int max, int idx){
        if (arr.length == 0) return max;
        if (idx == arr.length) return max;
        if (arr[idx] > max) max = arr[idx];
        return max(arr, max, idx+1);
    }

    public static int min(int[] arr, int min, int idx){
        if (arr.length == 0) return min;
        if (idx == arr.length) return min;
        if (arr[idx] < min) min = arr[idx];
        return min(arr, min, idx+1);
    }
}
