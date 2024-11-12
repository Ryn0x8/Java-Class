import java.util.Scanner;

public class rotate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int number = scanner.nextInt();
        System.out.print("Enter the number to rotate from: ");
        int rotateBy = scanner.nextInt();
        int length = Integer.toString(number).length();
        rotateBy = rotateBy % length;
        if (rotateBy < 0) {
            rotateBy += length;
        }
        int divisor = (int) Math.pow(10, rotateBy);
        int leftPart = number / divisor;
        int rightPart = number % divisor;
        
        int multiplier = (int) Math.pow(10, length - rotateBy);
        int rotatedNumber = rightPart * multiplier + leftPart;

        System.out.println("Rotated Number: " + rotatedNumber);

        scanner.close();
    }
}
