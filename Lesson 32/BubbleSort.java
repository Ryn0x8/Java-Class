import java.util.*;

public class BubbleSort {

    public static void bubbleSort(int[] arr, int n) {
        int temp, i, j;
        boolean swapped;

        for (i=0; i<n; i++){
            swapped = false;
            for (j=0; j<n-i-1; j++){
                if (arr[j]> arr[j+1]){
                    temp = arr[j];
                    arr[j]  = arr[j+1];
                    arr[j+1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) break;
        }
    }

    public static void printArray(int[] arr, int n){
        for (int i=0; i<n; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)){
            System.out.print("Enter the number of elements: ");
            int n = sc.nextInt();
            int[] arr = new int[n];
            System.out.print("Enter the elements: ");
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            bubbleSort(arr, n);
            System.out.println("Sorted Array: ");
            printArray(arr, n);
        }
    }
}
