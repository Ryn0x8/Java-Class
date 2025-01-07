
import java.util.*;

public class ACP {
    public static String getRomanName(int num){
        // roman_values = {'I': 1, 'V': 5, 'X': 10, 'L': 50, 'C': 100, 'D': 500, 'M': 1000}
        int[] romanValues = {1000, 500, 100, 50, 10, 5, 1};
        String[] romanNames = {"M", "D", "C", "L", "X", "V", "I"};
        StringBuilder romanName = new StringBuilder();

        for (int i = 0; i <= romanValues.length -1; i++){
            while (num >= romanValues[i]){
                num -= romanValues[i];
                romanName.append(romanNames[i]);
            }
        }
        return romanName.toString();
    }

    public static ArrayList<String> getRomanArrays(ArrayList<Integer> al) {
        ArrayList<String> romanAL = new ArrayList<>();
        for (int i = 0; i < al.size(); i++) {
            romanAL.add(getRomanName(al.get(i)));
        }
        return romanAL;
    }

    public static void main(String[] args) {
        try (
            Scanner keyboard = new Scanner(System.in)
        ){
            System.out.print("Enter the number of integers for ArrayList: ");
            int n = keyboard.nextInt();
            ArrayList<Integer> al = new ArrayList<>();
            System.out.println("Enter the integers: ");
            for (int i = 1; i<=n; i++){
                al.add(keyboard.nextInt());
            }
            System.out.println("Original ArrayList: "+ al.toString());
            System.out.println("Original ArrayList Size: "+ al.size());

            ArrayList<String> romanAL = getRomanArrays(al);
            System.out.println("Roman ArrayList: "+ romanAL.toString());
            System.out.println("Roman ArrayList Size: "+ romanAL.size());
        }
    }
}
