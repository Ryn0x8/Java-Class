import java.util.*;

public class CFrequency1 {
    public static void main(String[] args) {
        try (Scanner keyboard = new Scanner(System.in)){
            System.out.println("Enter the first string");
            String s1 = keyboard.nextLine();
            frequency(s1);

            System.out.println("Enter the second string");
            String s2 = keyboard.nextLine();
            frequency(s2);
        }
    }
    private static void frequency(String s){
        if (s.length() == 0){
            System.out.println("Empty string");
            return;
        }
        ArrayList<CharOccur> occurrences = new ArrayList<CharOccur>();

        for (int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            int flag = 0;

            for (CharOccur o: occurrences){
                if (o.ch == ch){
                    o.occurences++;
                    flag = 1;
                }
            }
            if (flag == 0){
                occurrences.add(new CharOccur(ch, 1));
            }

            
        }
        for (CharOccur o :  occurrences){
                System.out.println(o.ch + " - " + o.occurences);
        }

    }
}

class CharOccur{
    char ch;
    int occurences;
    CharOccur(char ch, int occurences){
        this.ch = ch;
        this.occurences = occurences;
    }
}
