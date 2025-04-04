import java.util.*;

public class ArrayReverse {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)){
            System.out.print("Enter the number of elements: ");
            int n = sc.nextInt();
            int[] arr = new int[n];
            System.out.print("Enter the elements: ");
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            displayReverseArray(arr, arr.length-1);
        }   
    }
    public static void displayReverseArray(int[] arr, int idx){
        if (idx < 0) return;
        System.out.println(arr[idx]);
        displayReverseArray(arr, idx-1);     
    }
}
