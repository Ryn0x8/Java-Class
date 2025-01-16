import java.util.*;

public class ZigZag {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)){
            System.out.print("Enter the number to print its zigzag numbers: ");
            int n = scanner.nextInt();
            zigzag(n);
        }
    }
    public static void zigzag(int n){
        if (n == 0) return;
        System.out.print(n+ " ");
        
        zigzag(n-1);

        System.out.print(n+ " ");

        zigzag(n-1);

        System.out.print(n + " ");
    }

}