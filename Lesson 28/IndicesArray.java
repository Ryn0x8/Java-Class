import java.util.*;

public class IndicesArray {
    public static void main(String[] args){
        try (Scanner sc = new Scanner(System.in)){
            System.out.print("Enter the number of elements: ");
            int n = sc.nextInt();
            int[] arr = new int[n];
            System.out.print("Enter the elements: ");
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            System.out.print("Enter the element to search: ");
            int x = sc.nextInt();
            AllIndexes(arr, n, x);
        }   
    }

    public static int AllIndexesRecursive(int[] arr, int n, int x, int[] output){
        if (n==0) return 0;
        int outsize = AllIndexesRecursive(arr, n-1, x, output);

        if (arr[n-1] == x){
            output[outsize++] = n-1;
        }
        return outsize;
    }

    public static void AllIndexes(int[] arr, int n, int x){
        int[] output = new int[n];
        int size = AllIndexesRecursive(arr, n, x, output);
        for (int i = 0; i < size; i++) {
            System.out.println(output[i]);
        }
    }
}
