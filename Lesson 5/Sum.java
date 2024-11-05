import java.util.Scanner;

public class Sum{
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        int n = keyboard.nextInt();
        int sum = 0;
        for (int i = 1; i<=n; i++){
            sum += i;
        }
        System.out.println(sum);
        keyboard.close();
    }
}