import java.util.Scanner;

public class StirPath {
    public static int countWays(int n) {
        if (n == 0) return 1; 
        if (n < 0) return 0; 

        return countWays(n - 1) + countWays(n - 2) + countWays(n - 3);
    }

    public static void main(String[] args) {
        int n;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter number of stairs: ");
            n = sc.nextInt();
        }

        System.out.println("Total ways to climb: " + countWays(n));
    }
}
