import java.util.Scanner;

public class Span {
    public static void main(String[] args){
        try (Scanner keyboard = new Scanner(System.in)) {
            System.out.println("Enter the no of elements (Numbers): ");
            int n = keyboard.nextInt();
            
            int[] numbers = new int[n];
            
            System.out.println("Enter all the numbers: ");
            
            for (int i =0; i <n; i++){
                numbers[i] = keyboard.nextInt();
                
            }
            
            int max = numbers[0];
            int min = numbers[0];
            
            for (int i=1; i<n; i++){
                if(numbers[i]> max){
                    max = numbers[i];
                }
                if (numbers[i]<min){
                    min = numbers[i];
                }
            }
            
            int span = max-min;
            
            System.out.println("Span of the given numbers is: "+ span);
        }
    }
    
}
