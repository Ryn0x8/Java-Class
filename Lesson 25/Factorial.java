import java.util.*;

public class Factorial {
    public static void main(String[] args) {
        try (Scanner keyboard = new Scanner(System.in)){
            System.out.print("Enter the number to find its factorial: ");
            int n = keyboard.nextInt();
            System.out.println("Factorial of "+n+" is "+ factorial(n));
        }
    }
    
    public static int factorial(int n) {
        if (n==0 || n==1) return 1;
        return n*factorial(n-1);
    }
}
