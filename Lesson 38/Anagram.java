import java.util.*;

public class Anagram {
    public static void main(String[] args){
        try (Scanner sc = new Scanner(System.in)){
            System.out.println("Enter the first string: ");
            String s1 = sc.nextLine();
            System.out.println("Enter the second string: ");
            String s2 = sc.nextLine();
            if(isAnagram(s1.toCharArray(), s2.toCharArray())){
                System.out.println("The strings are anagrams");
            }else{
                System.out.println("The strings are not anagrams");
            }
        }
    }

    public static boolean isAnagram(char[] s1, char[] s2){
        if (s1.length!=s2.length){
            return false;
        }
        Arrays.sort(s1);
        Arrays.sort(s2);
        return Arrays.equals(s1, s2);
    }
}

