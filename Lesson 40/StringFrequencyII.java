import java.util.*;

public class StringFrequencyII {
    public static int countOccurences(String s, String sub){
        int count = 0;
        int index = 0;
        while (index >=0){
            index = s.indexOf(sub, index);
            if (index >=0){
                count ++;
                index += sub.length();
            }
        }
        return count;
    }

    public static void main(String[] args){
        try (Scanner keyboard = new Scanner(System.in)){
            System.out.print("Enter a string: ");
            String s = keyboard.nextLine();
            System.out.print("Enter its Substring: ");
            String sub = keyboard.nextLine();

            int count = countOccurences(s, sub);

            System.out.println("The substring appears " + count +" times in the given string");
        }
    }
    
}
