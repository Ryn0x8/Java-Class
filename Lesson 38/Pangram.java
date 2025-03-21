import java.util.HashSet;

public class Pangram {
    public static boolean isPangram(String str) {
        if (str == null) {
            return false;
        }
        
        str = str.toLowerCase();
        HashSet<Character> letters = new HashSet<>();

        for (char ch : str.toCharArray()) {
            if (ch >= 'a' && ch <= 'z') {
                letters.add(ch);
            }
        }

        return letters.size() == 26;
    }

    public static void main(String[] args) {
        String input = "The quick brown fox jumps over the lazy dog";
        
        if (isPangram(input)) {
            System.out.println("is a Pangram");
        } else {
            System.out.println("is not a Pangram");
        }
    }
}
