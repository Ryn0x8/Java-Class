import java.util.Arrays;
import java.util.Scanner;

public class ACP {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the size of the array: ");
            int n = sc.nextInt();
            
            int[] a = new int[n];
            for (int i = 0; i< n; i++){
                a[i] = sc.nextInt();
            }

            int [] reversedArray = new int[n];

            int sze = a.length;
            int ind = 0;

            for (int i = sze-1; i >= 0; i--){
                reversedArray[ind] = a[i];
                ind++;
        }
        System.out.println("Reversed Array: "+ Arrays.toString(reversedArray));

            
            
        }
    }
}
