import java.util.*;

public class Reverse {
    public static void main(String[] args) {
        try (Scanner keyboard = new Scanner(System.in)){
            System.out.print("Enter the no of elements for the array: ");
            int n = keyboard.nextInt();
            System.out.println("Enter the elements for your array: ");
            ArrayList<Integer> al = new ArrayList<>();
            for (int i = 0; i<n; i++){
                al.add(keyboard.nextInt());
            }
            ArrayList<Integer> reversed = reverse(al);
            System.out.println("The reversed array is: "+ reversed.toString());
        }
        
    }
    public static ArrayList<Integer> reverse(ArrayList<Integer> al){
        ArrayList<Integer> reversedal = new ArrayList<>();
        for (int i = al.size()-1; i >= 0; i--){
            reversedal.add(al.get(i));
        }
        return reversedal;
    }    
}
