import java.util.*;

public class RemoveDuplicate {
    public static int[] removeDuplicates(int[] arr){
        int[] result = new int[arr.length];
        int index = 0;
        for (int i=0; i<arr.length; i++){
            boolean isDuplicate = false;
            for (int j = 0; j<index; j++){
                if (arr[i] == result[j]){
                    isDuplicate = true;
                    break;
                }
            }
            if (!isDuplicate){
                result[index] = arr[i];
                index++;
            }
        }
        int[] finalResult = new int[index];
        for (int i = 0; i<index; i++){
            finalResult[i] = result[i];
        }
        return finalResult;
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
            System.out.println("Array before removing duplicates: " + Arrays.toString(arr));
            removeDuplicates(arr);
            System.out.println("Array after removing duplicates: " + Arrays.toString(removeDuplicates(arr)));
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
