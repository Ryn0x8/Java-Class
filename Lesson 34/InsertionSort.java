import java.util.*;

public class InsertionSort {
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

    void sort(int[] arr) {
        int n = arr.length;
        for (int i=1; i< n; i++){
            int key = arr[i];
            int j = i-1;
            while(j>=0 && arr[j]> key){
                arr[j+1] = arr[j];
                j-=1;
            }
            arr[j+1] = key;
        }
    }

    void reversesort(int[] arr) {
        int n = arr.length;
        for (int i=1; i< n; i++){
            int key = arr[i];
            int j = i-1;
            while(j>=0 && arr[j]< key){
                arr[j+1] = arr[j];
                j-=1;
            }
            arr[j+1] = key;
        }
    }

    void printArray(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");

        }
        System.out.println();
    }

    public static void main(String[] args){
        int[] arr = Generatearray();
        InsertionSort ob = new InsertionSort();
        ob.sort(arr);
        ob.printArray(arr);
        ob.reversesort(arr);
        ob.printArray(arr);
    }
}
