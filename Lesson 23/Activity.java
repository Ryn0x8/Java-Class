import java.util.*;

public class Activity {
    public static void removePrime(ArrayList<Integer> al){
        for (int i = al.size()-1; i>= 0; i--){
            if (isPrime(al.get(i))){
                al.remove(i);
            }
        }
    }

    public static boolean isPrime(int num){
        if (num <= 1){
            return false;
        }
        for (int i = 2; i * i <=num; i++){
            if (num%i ==0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args){

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

            removePrime(al);
            System.out.println("ArrayList after removing prime numbers: "+ al.toString());
            System.out.println("ArrayList Size after removing prime numbers: "+ al.size());
        }

    }
}
