import java.util.*;

public class Reverse {
    public static String reverseString(String s){
        char[] ch = s.toCharArray();
        int left = 0;
        int right = ch.length - 1;
        while (left<right){
            char temp = ch[left];
            ch[left] = ch[right];
            ch[right] = temp;
            left++;
            right--;
        }
        return new String(ch);
    }

    public static String reverseWordAndSentence(String s){
        String[] words = s.split(" ");
        StringBuilder reversed = new StringBuilder();
        for (int i=words.length-1; i>=0; i--){
            reversed.append(reverseString(words[i])).append(" ");
        }
        return reversed.toString();
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)){
            System.out.println("Enter word or a sentence you want to reverse");
            String input = sc.nextLine();
            if (input.split(" ").length >1){
                System.out.println(reverseWordAndSentence(input));
            }else{
                System.out.println(reverseString(input));
            }
        }
    }
}
