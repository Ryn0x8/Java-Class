import java.util.InputMismatchException;
import java.util.Scanner;

public class Rating {
    Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args){
        Rating ratingclass = new Rating();
        int rating = ratingclass.get_input();
        ratingclass.switch_case(rating);
        
    }
    public int get_input() {
        System.out.println("Enter the rating of a movie:  ");
        try {
            int rating = keyboard.nextInt();
            return rating;
            
        }catch (InputMismatchException e) {
            System.out.println("Invalid input: Please enter a number");
            keyboard.nextLine();
            return get_input();
        }
    }
    public void switch_case(int rating){
        Pick pick = new Pick();
        int category;

        if (rating > 75000) {
            category = 4; 
        } else if (rating > 45000) {
            category = 3; 
        } else if (rating > 25000) {
            category = 2; 
        } else if (rating > 5000) {
            category = 1; 
        } else {
            category = 0; 
        }
        switch (category) {
            
            case 4:
                System.out.println("Rating greater than 75000: out of the world");
                break;
            case 3:
                System.out.println("Rating greater than 45000 but less than 70000: best");
                break;
            case 2:
                System.out.println("Rating greater than 25000: better");
                break;
            case 1:
                System.out.println("Rating greater than 5000: good");
                break;
            case 0:
                System.out.println("Rating: Not rated");
                break;
            default:
            System.out.println("Invalid Rating"); 
            rating = pick.get_input();
            switch_case(rating);
            break;
        }

        }
    }

