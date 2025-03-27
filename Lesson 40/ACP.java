import java.util.HashMap;
import java.util.Scanner;

public class ACP {
    public static void main(String[] args) {
        String s;
        int length;
        try (Scanner scanner = new Scanner(System.in)) {
            s = scanner.nextLine();
            length = scanner.nextInt();
        }

        HashMap<String, Integer> result = countSubstrings(s, length);

        for (String key : result.keySet()) {
            System.out.println("'" + key + "': " + result.get(key));
        }
    }

    public static HashMap<String, Integer> countSubstrings(String s, int length) {
        HashMap<String, Integer> result = new HashMap<>();
        for (int i = 0; i <= s.length() - length; i++) {
            String sub = s.substring(i, i + length);
            result.put(sub, result.getOrDefault(sub, 0) + 1);
        }
        return result;
    }
}
