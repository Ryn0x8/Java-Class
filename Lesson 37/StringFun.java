import java.util.*;

public class StringFun {
    public static void main(String[] args){
        try (Scanner sc = new Scanner(System.in)){
            System.out.println("Enter a message: ");
            String message = sc.nextLine();
            String secretmessage = message
                .replace("a", "@")
                .replace("e", "$")
                .replace("i", "!")
                .replace("o", "*")
                .replace("u", "#");

            System.out.println("Secret message: " + secretmessage);

            System.out.println("Enter a String: ");
            String s = sc.nextLine();
            System.out.println("Original String: " + s);
            String reversed = new StringBuilder(s).reverse().toString();
            System.out.println("Reversed String: " + reversed);

            System.out.println("Enter the no of characters to reverse: ");
            int n = sc.nextInt();
            
            String ReversedCharacter = reversed.substring(0, n);
            System.out.println("Reversed characters: " + ReversedCharacter);
        }
    }
}
