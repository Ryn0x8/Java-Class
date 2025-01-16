import java.util.*;

public class PrintDecreasing {
    public static void main(String[] args) {
        try (Scanner keyboard = new Scanner(System.in)) {
            System.out.print("Enter the number to print its decreasing numbers");
            int number = keyboard.nextInt();
            printDecreasing(number);
        }
    }

    public static void printDecreasing(int number) {
        if (number == 0)
            return;
        System.out.println(number);
        printDecreasing(number - 1);
    }
}
