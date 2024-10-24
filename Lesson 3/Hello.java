import java.util.Scanner;

public class Hello {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String input = keyboard.nextLine();
        System.out.println("You entered: " + input);
        System.out.println("Enter a Integer: ");
        int number = keyboard.nextInt();
        System.out.println("You entered: " + number);
        System.out.println("Enter a Float: ");
        float floats = keyboard.nextFloat();
        System.out.println("You entered: " + floats);
        System.out.println("Enter a Long: ");
        long longs = keyboard.nextLong();
        System.out.println("You entered: " + longs);
        System.out.println("Enter a Boolean: ");
        boolean booleans = keyboard.nextBoolean();
        System.out.println("You entered: " + booleans);
        System.out.println("Enter a Double: ");
        double doubles = keyboard.nextDouble();
        System.out.println("You entered: " + doubles);
        System.out.println("Enter a Byte: ");
        byte bytes = keyboard.nextByte();
        System.out.println("You entered: " + bytes);
        System.out.println("Enter a Short: ");
        short shorts = keyboard.nextShort();
        System.out.println("You entered: " + shorts);
        keyboard.close();
    }
}
