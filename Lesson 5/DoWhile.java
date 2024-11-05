import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        int min = Integer.MIN_VALUE;
        int max = Integer.MAX_VALUE;
        char choice;
        do{
            int number = keyboard.nextInt();
            if (number> max){
                max = number;
            }
            else{
                min = number;
            }
            System.out.println("Do you want to continue?: ");
            choice = keyboard.next().charAt(0);
        }while(choice == 'y'|| choice == 'Y');
    System.out.println("Max number is "+ max);
    System.out.println("Min number is "+ min);
    keyboard.close();

    }
}
