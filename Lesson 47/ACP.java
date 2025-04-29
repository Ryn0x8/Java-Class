import java.util.*;

public class ACP {
    public static List<String> getStrings(String s) {
        List<String> result = new ArrayList<>();
        backtrack(s.toCharArray(), 0, result);
        return result;
    }

    private static void backtrack(char[] chars, int index, List<String> result) {
        if (index == chars.length) {
            result.add(new String(chars));
            return;
        }

        if (Character.isLetter(chars[index])) {
            chars[index] = Character.toLowerCase(chars[index]);
            backtrack(chars, index + 1, result);

            chars[index] = Character.toUpperCase(chars[index]);
            backtrack(chars, index + 1, result);
        } else {
            backtrack(chars, index + 1, result);
        }
    }

    public static void main(String[] args) {
        String input = "a1b2";
        List<String> result = getStrings(input);
        System.out.println(result);
    }
}
