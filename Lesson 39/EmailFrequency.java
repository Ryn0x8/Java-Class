import java.util.*;

public class EmailFrequency {
    public static void main(String[] args) {
        try (Scanner keyboard = new Scanner(System.in)){
            System.out.println("Enter a email address: ");
            String email = keyboard.nextLine();
            Map <Character, Integer> frequency = new HashMap<>();
            char[] ch = email.toCharArray();
            for (char c : ch){
            if (!Character.isLetter(c) && c != '.') {
                frequency.put(c, frequency.getOrDefault(c, 0) + 1);
            }

        }
        System.out.println("Character frequency");
        for (Map.Entry<Character, Integer> entry : frequency.entrySet()){
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}
}
