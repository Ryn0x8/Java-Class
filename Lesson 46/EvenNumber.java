import java.util.*;

public class EvenNumber {
    public static List<Integer> getEvenNumbers(int[] arr){
        List<Integer> evenNumbers = new ArrayList<>();
        for (int num: arr){
            if (num %2 == 0){
                evenNumbers.add(num);
            }
        }
        return evenNumbers;
    }
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)){
            System.out.print("Enter the number of elements for array: ");
            int n = sc.nextInt();
            int[] arr = new int[n];
            System.out.println("Enter the elements of the array:");
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            System.out.print("Even numbers in the array: ");
            List<Integer> evenNumbers = getEvenNumbers(arr);
            for (int num : evenNumbers) {
                System.out.print(num + " ");
            }
            System.out.println();

        }
    }
}
