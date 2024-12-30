import java.util.*;

public class SpiralArray {
    public static void main(String[] args){
        try (Scanner sc= new Scanner(System.in)){
            System.out.println("Enter the number of rows for 2d array");
            int r = sc.nextInt();
            System.out.println("Enter the number of columns for 2d array");
            int c = sc.nextInt();

            int[][] arr = new int[r][c];
            System.out.println("Enter the elements of 2d array");
            for (int i = 0; i<r; i++){
                for (int j = 0; j<c; j++){
                    arr[i][j] = sc.nextInt();
                }
            }

            System.out.println("Your 2d array is: ");
            for (int i =0; i < r; i++){
                for (int j =0; j<c; j++){
                    System.out.print(arr[i][j] + " ");
                }
                System.out.println();
            }

            int rmin = 0;
            int cmin = 0;
            int rmax = r-1;
            int cmax = c-1;
            int count = 0;

            int total = c*r;

            System.err.println("Spiral array is: ");

            while(count < total){
                for (int col = cmin; col <= cmax && count<total; col++){
                    System.out.print(arr[rmin][col]+"  ");
                    count ++;
                }
                rmin++;

                for (int row = rmin; row<=rmax && count < total; row ++){
                    System.out.print(arr[row][cmax]+"  ");
                    count ++;
                }
                cmax--;

                for (int col = cmax; col >= cmin && count<total; col--){
                    System.out.print(arr[rmax][col]+"  ");
                    count ++;
                }
                rmax--;

                for (int row = rmax; row>=rmin && count < total; row --){
                    System.out.print(arr[row][cmin]+"  ");
                    count ++;
                }
                cmin++;
                
            }
        }
    }
}
