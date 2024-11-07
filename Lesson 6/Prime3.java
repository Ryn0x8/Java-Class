import java.util.Scanner;

public class Prime3 {
    private static Scanner keyboard = new Scanner(System.in);
    public static void main(String[] args){
            System.out.println("Enter the lowest range: ");
            int l = keyboard.nextInt();
            System.out.println("Enter the highest range: ");
            int h = keyboard.nextInt();
            for (int n = l;n<=h; n++){
            int count = 0;

            for (int div = 2; div*div<=n; div++){
                if (n%div==0){
                    count ++;
                    break;
                }
            }
            if (count == 0&&n>1){
                System.out.println(n);
            }
        }
        
        keyboard.close();
    }
}
