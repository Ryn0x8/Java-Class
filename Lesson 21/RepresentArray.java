import java.util.*;

public class RepresentArray {
    public static void main(String[] args){
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the number of rows for 2d array");
            int r = sc.nextInt();
            System.out.println("Enter the number of columns for 2d array");
            int c = sc.nextInt();

            int [] [] arr = new int [r][c];
            System.out.println("Enter the elements of 2d array");
            for (int i =0; i <r; i++){
                for (int j =0; j <c; j++){
                    arr[i][j] = sc.nextInt();
                }
            }
            System.out.println("Your array is: ");
            for (int i =0; i < r; i++){
                for (int j =0; j<c; j++){
                    System.out.print(arr[i][j] + " ");
                }
                System.out.println();
            }

        }
        
    }
}
