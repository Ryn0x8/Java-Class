import java.util.*;

public class MissingNumber {
    public static int findMissingNumber(int[] arr, int n){
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < n; i++){
            set.add(arr[i]);
        }
        for (int i = 1; i<=n+1; i++){
            if (!set.contains(i)){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 5, 6};
        int n = arr.length;
        int missingNumb = findMissingNumber(arr, n);
        if (missingNumb != -1){
            System.out.println("The missing number is: " + missingNumb);
        } else {
            System.out.println("No missing number found.");
        }
    }
}
