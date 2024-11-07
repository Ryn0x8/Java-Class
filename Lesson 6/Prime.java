import java.util.Scanner;

public class Prime {
    private static Scanner keyboard = new Scanner(System.in);
    public static void main(String[] args){
        System.out.println("How many times do you want to check the prime number");
        int t = keyboard.nextInt();
        for (int i = 1; i <=t; i++ ){
            System.out.println("Enter the number to check: ");
            int n = keyboard.nextInt();
            int count = 0;
            for (int div = 2; div*div<=n; div++){
                if (n%div==0){
                    count ++;
                    break;
                }
            }
            if (count == 0){
                System.out.println(n+ " is a prime number");
            }else{
                System.out.println(n+" is not a prime number");
            }
        }
        keyboard.close();
    }
}
