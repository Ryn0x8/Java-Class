import java.util.*;

public class StringFrequencyIV {
    public static int compareString(String s1, String s2){
        for (int i=0; i<s1.length() && i<s2.length(); i++){
            if (s1.charAt(i) != s2.charAt(i)){
                return s1.charAt(i) - s2.charAt(i);
            }
        }

        return s1.length() - s2.length();
    }

    public static void main(String[] args){
        try (Scanner sc = new Scanner(System.in)){
            System.out.print("Enter the first string: ");
            String s1 = sc.nextLine();
            System.out.print("Enter the second string: ");
            String s2 = sc.nextLine();

            int result = compareString(s1, s2);

            if (result == 0){
                System.out.println("Both strings are equal");
            }else if (result <0){
                System.out.println("The first string is lexographically smaller than the second string");
            }else{
                System.out.println("The first string is lexographically greater than the second string.");
            }
        }
    }

}
