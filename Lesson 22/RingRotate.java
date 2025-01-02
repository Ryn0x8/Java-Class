import java.util.Scanner;

public class RingRotate{
    public static void main(String[] args){
        try(Scanner sc = new Scanner(System.in)){
            System.out.println("Enter the number of rows for 2d array");
            int r = sc.nextInt();
            System.out.println("Enter the number of columns for 2d array");
            int c = sc.nextInt();

            int[][] arr = new int[r][c];
            System.out.println("Enter the elements for "+ r+"x"+c+" Matrix");
            for (int i = 0; i<r; i++){
                for (int j = 0; j<c; j++){
                    arr[i][j] = sc.nextInt();
                }
            }

            System.out.println("Your 2d array is: ");
            displayMatrix(arr);

            System.out.print("Enter the ring no (sno): ");
            int sno = sc.nextInt();
            System.out.print("Enter the number of rotations: ");
            int rotations = sc.nextInt();

            if (sno > Math.min(r, c) /2 ){
                System.out.println("Invalid ring number");
            }
            else{
                ringRotate(arr, sno, rotations);
                displayMatrix(arr);
            }
            
        }
    }

    public static void ringRotate(int[][] arr, int sno, int rotations){
        int[] la = fill1DFrom2D(arr, sno);
        if (la.length == 0){
            return;

        }
        rotate1D(la, rotations);
        fill2DFrom1D(arr, la,sno);
    }

    public static int[] fill1DFrom2D(int[][] arr, int sno){
        int rmin = sno-1;
        int cmin = sno-1;
        int rmax = arr.length - sno;
        int cmax = arr[0].length - sno;

        int size = 2 * (rmax - rmin + cmax - cmin);

        if (size <= 0){
            return new int[0];
        }

        int[] la = new int[size];
        int idx = 0;

        for (int i =rmin; i<=rmax; i++){
            la[idx++] = arr[i][cmin];
        }
        for (int i = cmin+1; i<=cmax; i++){
            la[idx++] = arr[rmax][i];
        }

        for (int i =rmax-1; i>=rmin; i--){
            la[idx++] = arr[i][cmax];
        }
        for (int i = cmax-1; i>cmin; i--){
            la[idx++] = arr[rmin][i];
        }

        return la;
    }

    public static void rotate1D(int[] la, int rno){
        rno = rno %la.length;
        if (rno<0){
            rno += la.length;
        }
        reverse(la, 0, la.length-1);
        reverse(la, 0, rno-1);
        reverse(la, rno, la.length-1);
    }
    public static void reverse(int[] la, int left, int right){
        while (left < right){
            int temp = la[left];
            la[left] = la[right];
            la[right] = temp;
            left++;
            right--;
        }
    }

    public static void fill2DFrom1D(int[][] arr, int[] la, int sno){
        int rmin = sno-1;
        int cmin = sno-1;
        int rmax = arr.length - sno;
        int cmax = arr[0].length - sno;
        int idx = 0;

        for (int i =rmin; i<=rmax; i++){
            arr[i][cmin] = la[idx++]; 
        }
        for (int i = cmin+1; i<=cmax; i++){
            arr[rmax][i] = la[idx++];
        }

        for (int i =rmax-1; i>=rmin; i--){
            arr[i][cmax]= la[idx++];
        }
        for (int i = cmax-1; i>cmin; i--){
            arr[rmin][i]  = la[idx++];
        }


    }

    public static void displayMatrix(int[][] arr){
        for (int[] row : arr){
            for (int val: row){
                System.out.print(val+" ");
            }
            System.out.println();
        }
    }
}
