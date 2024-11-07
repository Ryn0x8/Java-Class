import java.util.*;

public class Prime2 {
    private static Scanner keyboard = new Scanner(System.in);
    public static void main(String[] args){
        System.out.println("Please enter a number to check its prime factors: ");
        int n = keyboard.nextInt();
        String printmsg = "The prime factors of the given number is ";
        
        for (int div = 2; div*div <=n; div++){
            while (n%div == 0){
                n = n/div;
                printmsg+=div+", ";
            }
        }
        System.out.println(printmsg);

        if (n!=1){
            System.out.println(n);
        }
    }
}
