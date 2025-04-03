import java.util.*;

public class LongestConsecutiveSequence {
    
    public static int findlongestconsecutivesequence(int[] arr){
        Set<Integer> set = new HashSet<>();
        for (int num: arr){
            set.add(num);
        }
        int max = 0;
        for (int num:arr){
            if (!set.contains(num-1)){
                int length = 1;
                while (set.contains(num+1)){
                    length++;
                    num++;
                }
                max = Math.max(max, length);
            }
        }
        return max;
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
            int longestSequence = findlongestconsecutivesequence(arr);
            System.out.println("The length of the longest consecutive sequence is: " + longestSequence);

        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
