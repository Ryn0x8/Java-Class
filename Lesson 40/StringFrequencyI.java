import java.util.*;

public class StringFrequencyI {
    public static boolean isSubString(String s1, String s2){
        int index = s1.indexOf(s2);
        return index >= 0;
    }  
    
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)){
            System.out.print("Enter the first string: ");
            String s1 = sc.nextLine();
            System.out.print("Enter the second string: ");
            String s2 = sc.nextLine();
            if (isSubString(s1, s2)){
                System.out.println("The second string is a substring of the first");

            }
            else{
                System.out.println("The second string is not a substring of the first");
            }
        }
    }
}
