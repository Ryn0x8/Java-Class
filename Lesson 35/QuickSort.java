import java.util.*;

public class QuickSort{
    public static int[] Generatearray() {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the number of elements: ");
            int n = sc.nextInt();
            int[] arr = new int[n];

            System.out.println("Enter the elements: ");
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            return arr;

        }
    }

    public static void printArray(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static int partition(int[] arr, int low, int high){
        int pivot = arr[high];

        int i = (low-1);

        for (int j = low; j<=high-1; j++){
            if (arr[j] < pivot){
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, i+1, high);
        return (i+1);
    }

    static void quickSort(int[] arr, int low, int high){
        if (low < high){
            int pi = partition(arr, low, high);
            quickSort(arr, low, pi-1);
            quickSort(arr, pi+1, high);
        }
    }

    public static void main(String[] args) {
    int[] arr = Generatearray();
    int n = arr.length;
    quickSort(arr, 0, n-1);
    System.out.println("Sorted array: ");
    printArray(arr);
    }
}