import java.util.*;

public class CFrequency {
    public static void main(String[] args){
        try (Scanner keyboard = new Scanner(System.in)){
            System.out.println("Enter a word or a sentence");
            String input = keyboard.nextLine();
            char[] ch = input.toCharArray();
            int[] frequency = new int[input.length()];

            for (int i=0; i<input.length(); i++){
                frequency[i] = 1;
                for (int j = i+1; j<input.length(); j++){
                    if (ch[i] == ch[j]){
                        frequency[i]++;
                        ch[j] = '0';
                    }
                }
            }
            System.out.println("Character frequency");
            for (int i=0; i<frequency.length; i++){
                if (ch[i] != ' ' && ch[i] != '0'){
                    System.out.println(ch[i] + " - " + frequency[i]);
                }
            }
        }
    }    
}
