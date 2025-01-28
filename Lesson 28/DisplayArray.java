import java.util.*;

public class DisplayArray{
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)){
            System.out.print("Enter the number of elements: ");
            int n = sc.nextInt();
            int[] arr = new int[n];
            System.out.print("Enter the elements: ");
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            displayArray(arr, 0);
        }   
    }

    public static void displayArray(int[] arr, int idx){
        if (idx == arr.length) return;
        System.out.println(arr[idx]);
        displayArray(arr, idx+1);
    }
}