import java.util.*;

public class LongestUniqueSubString {
    static String LongestUniqueSUbStr(String str){
        Set<Character> seen = new HashSet<>();
        int start = 0;
        String longest = "";

        for (int i=0; i<str.length(); i++){
            while (seen.contains(str.charAt(i))){
                seen.remove(str.charAt(start));
                start++;
            }
            seen.add(str.charAt(i));
            if (i-start+1 > longest.length()){
                longest = str.substring(start, i+1);
            }
            
        }
        return longest;
    }    

    public static void main(String[] args){
        try (Scanner sc = new Scanner(System.in)){
            System.out.print("Enter the string to find the longest unique substring: ");
            String str = sc.nextLine();
            System.out.println("The longest unique substring in the given string is: " + LongestUniqueSUbStr(str));
        }
    }
}
