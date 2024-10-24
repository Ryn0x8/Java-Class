import java.util.Scanner;
public class OddEven {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = 0;
        try{
        number = keyboard.nextInt();
        }catch(Exception e){
            System.out.println("Invalid input: " + e);
            keyboard.close();
            return;
        }
        String value = (number % 2 == 0) ? "Even" : "Odd";
        System.out.println("The number is " + value);
        keyboard.close();
    }
}
