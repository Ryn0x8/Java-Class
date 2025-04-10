import java.util.*;

public class FindSubArray {
    public static int[] getSubArray(int[] arr, int start, int end){
        int length = end - start;
        int[] subarray = new int[length];
        for (int i = start; i < end; i++){
            subarray[i-start] = arr[i];
        }
        return subarray;
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)){
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println("Enter the start index of the subarray:");
        int start = sc.nextInt();
        System.out.println("Enter the end index of the subarray:");
        int end = sc.nextInt();

        int[] subarray = getSubArray(arr, start, end);
        for (int i = 0; i < subarray.length; i++){
            System.out.print(subarray[i] + " ");
        }
        System.out.println("");
    }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Invalid index: " + e.getMessage());
        }
        catch (InputMismatchException e){
            System.out.println("Invalid input: " + e.getMessage());
        }
        catch (Exception e){
            System.out.println("An error occurred: " + e.getMessage());
        }
        finally {
            System.out.println("End of program.");
        }
           
    }
}
