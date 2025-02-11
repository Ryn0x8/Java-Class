import java.util.*;

public class BinarySearchIte{
    
    private static int binarySearch(int[] arr, int x){
        int l = 0; int r = arr.length -1;
        while (l <=r){
            int mid = l+ (r-1)/ 2;
            if (arr[mid]==x)
                return mid;
            if  (arr[mid] <x)
                l = mid +1;
            else
                r = mid -1;
        }
        return -1;
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)){
            System.out.print("Enter the number of elements in the array: ");
            int n = sc.nextInt();
            int[] arr = new int[n];
            System.out.print("Enter all the elements of the array in sorted order: ");
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            System.out.print("Enter the element to be searched: ");
            int x = sc.nextInt();
            int result = binarySearch(arr, x);
            if (result == -1){
                System.out.println("Element not found in the array");
            }
            else{
                System.out.println("Element found at index " + result);
            }
        }
    }
}