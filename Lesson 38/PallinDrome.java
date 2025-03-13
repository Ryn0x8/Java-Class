import java.util.*;

public class PallinDrome {
    public static void main(String[] args){
        try (Scanner sc = new Scanner(System.in)){
            System.out.println("Enter a string");
            String s = sc.nextLine();
            if(isPallindrome(s)){
                System.out.println("The string is a pallindrome");
            }else{
                System.out.println("The string is not a pallindrome");
            }
            
        }
    }

    public static boolean isPallindrome(String s){
        int left = 0;
        int right = s.length() - 1;
        while(left<right){
            if (s.charAt(left)!=s.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        // return s.equals(new StringBuilder(s).reverse().toString());
        return true;
    }
}
