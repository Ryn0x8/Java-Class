import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter a year:");
        int year = keyboard.nextInt();
        boolean isLeapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
        if (isLeapYear) {
            System.out.println(year + " is a leap year!");
        } else {
            System.out.println(year + " is not a leap year.");
        }
        keyboard.close();
    }
}
