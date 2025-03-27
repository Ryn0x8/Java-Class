import java.util.*;

public class LongestPalindrome{
    static String longestPalindrome(String str){
        int n = str.length();
        boolean[][] isPalindrome = new boolean[n][n];


        for (int i=0; i<n; i++){
            isPalindrome[i][i] = true;
        }

        for (int i=0; i< n-1; i++){
            if (str.charAt(i) == str.charAt(i+1)){
                isPalindrome[i][i+1] = true;
            }
        }

        for (int len = 3; len <=n; len++){
            for (int i=0; i<n-len+1; i++){
                if (str.charAt(i) == str.charAt(i+len-1) && isPalindrome[i+1][i+len-2]){
                    isPalindrome[i][i+len-1] = true;
                }
            }
        }

        int start = 0;
        int end = 0;

        for (int i=0; i<n; i++){
            for (int j=i; j<n; j++){
                if (isPalindrome[i][j] && j-i > end-start){
                    start = i;
                    end = j;
                }
            }
        }
        return str.substring(start, end+1);
    }

    public static void main(String[] args){
        try (Scanner sc = new Scanner(System.in)){
            System.out.print("Enter the string to find the longest palindrome: ");
            String str = sc.nextLine();
            System.out.println("The longest palindrome in the given string is: " + longestPalindrome(str));
        }
    }
}