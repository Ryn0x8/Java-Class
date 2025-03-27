import java.util.*;

public class ValidateIdentifier{
    public boolean isValid(String id){
        if (id.isEmpty() || id.length() == 0){
            return false;
        }
        if (!Character.isLetter(id.charAt(0)) && id.charAt(0) != '_'){
            return false;
        }
        for (int i=1; i<id.length(); i++){
            if (!Character.isLetterOrDigit(id.charAt(i)) && id.charAt(i) != '_'){
                return false;
            }
        }

        return true;
    }

    public static  void main(String[] args){
        try (Scanner sc = new Scanner(System.in)){
            ValidateIdentifier vi = new ValidateIdentifier();
            while (true){
                System.out.print("Enter the identifier to validate (or type 'exit' to quit): ");
                String identifier = sc.nextLine();

                if (identifier.equals("exit")){
                    break;
                }

                if (vi.isValid(identifier)){
                    System.out.println("The given identifier is valid");
                }else{
                    System.out.println("The given identifier is invalid");
                    System.out.println("Remember: \n 1. The identifier must start with a letter or an underscore\n 2. The identifier can only contain letters, digits, or underscores\n 3. The identifier should not be empty");
                }
                System.out.println();
            }
            System.out.println("Program terminated");
        }
    }
}