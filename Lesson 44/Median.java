import java.util.*;

public class Median {
    public static double   median(int[] arr){
        Arrays.sort(arr);
        int n = arr.length;
        if (n % 2 ==0){
            return (arr[n/2] + arr[n/2 - 1]) / 2.0;
        } else {
            return arr[n/2];
        }
    }
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter the number of elements: ");
            int n = scanner.nextInt();
            int[] arr = new int[n];
            System.out.println("Enter the elements:");
            for (int i = 0; i < n; i++) {
                arr[i] = scanner.nextInt();
            }
            double med = median(arr);
            System.out.println("The median is: " + med);
        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter integers only.");
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
