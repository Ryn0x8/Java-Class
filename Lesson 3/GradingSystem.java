import java.util.Scanner;

public class GradingSystem {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter your marks:");
        int Marks = keyboard.nextInt();
        if (Marks >= 90) {
            System.out.println("Grade: A");
        }
        else if (Marks >= 80) {
            System.out.println("Grade: B");
        }
        else if (Marks >= 70) {
            System.out.println("Grade: C");
        }
        else if (Marks >= 60) {
            System.out.println("Grade: D");
        }
        else {
            System.out.println("Grade: F");
        }
        keyboard.close();
    }
}
