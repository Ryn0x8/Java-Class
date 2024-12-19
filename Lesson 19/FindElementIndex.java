import java.util.Scanner;

public class FindElementIndex {
    public static void main(String[] args){
        try (Scanner keyboard = new Scanner(System.in)){
            System.out.println("Enter the size of the array: " );
            int n = keyboard.nextInt();

            int[] a = new int[n];

            System.out.println("Enter the numbers of the elements: " );
            for (int i = 0; i<n; i++){
                a[i] = keyboard.nextInt();
            }

            System.out.println("Enter the element to search in array: ");
            int x = keyboard.nextInt();

            int index = -1;
            for (int ind = 0; ind<n; ind++){
                if (a[ind] == x){
                    index = ind;
                    break;
                }
            }

            System.out.println("Index of the given element: "+ index);
        }
    }
}
