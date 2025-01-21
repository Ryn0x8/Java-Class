import java.util.*;

public class FibonacciSeries {
    static int n1 = 0, n2 = 1, n3 = 0;
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)){
            System.out.print("Enter the number of terms in the Fibonacci series: ");
            int count = scanner.nextInt();
            System.out.print(n1 + " " + n2 + " ");

            fibonacci(count-2);
        }
    }
    public static void fibonacci(int count){
        if (count >0){
            n3 = n1+n2;
            n1 = n2;
            n2 = n3;
            System.out.print(n3 + " ");
            fibonacci(count-1);
        }
    }    
}
