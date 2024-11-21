import java.util.Scanner;

class Operation {
    protected int num1, num2;

    public void setNumbers(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }
}

class Addition extends Operation {
    public int add() {
        return num1 + num2;
    }
}

class Subtraction extends Addition {
    public int subtract() {
        return num1 - num2;
    }
}

class Multiplication extends Subtraction {
    public int multiply() {
        return num1 * num2;
    }
}

class Division extends Multiplication {
    public double divide() {
        if (num2 == 0) {
            throw new ArithmeticException("Division by zero is not allowed.");
        }
        return num1 / num2;
    }
}

public class Operations {
    public static void main(String[] args) {
        try{
        Scanner keyboard = new Scanner(System.in);
        Division calculator = new Division();

        System.out.println("Enter two numbers:");
        int num1 = keyboard.nextInt();
        int num2 = keyboard.nextInt();
        calculator.setNumbers(num1, num2);

        System.out.println("Choose an operation: ");
        System.out.println("1 - Addition");
        System.out.println("2 - Subtraction");
        System.out.println("3 - Multiplication");
        System.out.println("4 - Division");

        int choice = keyboard.nextInt();
        keyboard.close();
        

        switch (choice) {
            case 1:
                System.out.println("Result: " + calculator.add());
                break;
            case 2:
                System.out.println("Result: " + calculator.subtract());
                break;
            case 3:
                System.out.println("Result: " + calculator.multiply());
                break;
            case 4:
                try {
                    System.out.println("Result: " + calculator.divide());
                } catch (ArithmeticException e) {
                    System.out.println(e.getMessage());
                }
                break;
            default:
                System.out.println("Invalid choice");
        }            

    }
catch (Exception e) {

}

}
}
