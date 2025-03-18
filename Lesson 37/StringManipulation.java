import java.util.ArrayList;
import java.util.Scanner;

public class StringManipulation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Character> charList = new ArrayList<>();

        System.out.println("Enter characters one by one (type '0' to stop):");
        while (true) {
            char ch = scanner.next().charAt(0);
            if (ch == '0') break;
            charList.add(ch);
        }

        StringBuilder sb = new StringBuilder();
        for (char c : charList) {
            sb.append(c);
        }
        String originalString = sb.toString();

        int length = originalString.length();
        System.out.println("Length of the string: " + length);

        String reversedString = new StringBuilder(originalString).reverse().toString();
        System.out.println("Reversed string: " + reversedString);

        if (length % 2 == 0) {
            String part1 = originalString.substring(0, length / 2);
            String part2 = originalString.substring(length / 2);
            System.out.println("First half: " + part1);
            System.out.println("Second half: " + part2);
        } else {
            System.out.println("Cannot split into two equal parts as the length is odd.");
        }

        scanner.close();
    }
}
