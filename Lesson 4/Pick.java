import java.util.Scanner;
import java.util.InputMismatchException;

public class Pick {
    Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {
        Pick pick = new Pick();
        int day = pick.get_input();
        pick.switch_case(day);
    }
    
    public int get_input() {
        System.out.println("Enter a number between 1 and 7 which represents the day of the week: ");
        try {
            int day = keyboard.nextInt();
            if (day >= 1 && day <= 7) {
                return day;
            } else {
                System.out.println("Number must be between 1 and 7");
                keyboard.nextLine();
                return get_input();
            }
        } catch (InputMismatchException e) {
            System.out.println("Invalid input: Please enter a number");
            keyboard.nextLine();
            return get_input();
        }
    }

    public void switch_case(int day){
        Pick pick = new Pick();
        switch (day) {
            case 1:
                System.out.println("The day is Monday");
                break;
            case 2:
                System.out.println("The day is Tuesday");
                break;
            case 3:
                System.out.println("The day is Wednesday");
                break;
            case 4:
                System.out.println("The day is Thursday");
                break;
            case 5:
                System.out.println("The day is Friday");
                break;
            case 6:
                System.out.println("The day is Saturday");
                break;
            case 7:
                System.out.println("The day is Sunday");
                break;
            default:
                System.out.println("Invalid day"); 
                day = pick.get_input();
                switch_case(day);
                break;
        }
    }


}
