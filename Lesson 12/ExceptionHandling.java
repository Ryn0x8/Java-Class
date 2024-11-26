import java.util.Scanner;

public class ExceptionHandling {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter two number: ");
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            int result = x / y;
            System.out.println(x+" /"+y+" = " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero");
        }finally{
            System.out.println("Program execution completed");
        }
    }
}
