import java.util.*;

public class IsSorted {
    public static boolean isSorted(int[] arr){
        for (int i = 1; i< arr.length; i++){
            if (arr[i] < arr[i-1]){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)){
            System.out.println("Enter the number of elements in the array: ");
            int n = sc.nextInt();
            int[] arr = new int[n];
            System.out.println("Enter the elements of the array: ");
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            System.out.println("The array is: " + Arrays.toString(arr));
            boolean sortedArray = isSorted(arr);

            if (sortedArray) {
                System.out.println("The array is sorted.");
            } else {
                System.out.println("The array is not sorted.");
            }

        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
