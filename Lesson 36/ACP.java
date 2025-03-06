import java.util.*;

public class ACP {
    public static int[] Generatearray(){
        try (Scanner sc = new Scanner(System.in)){
            System.out.print("Enter the number of elements: ");
            int n = sc.nextInt();
            int[] arr = new int[n];

            System.out.println("Enter the elements: ");
            for (int i=0; i<n; i++){
                arr[i] = sc.nextInt();
            }
            return arr;
    
        }
    }

    int mergeAndCount(int[] arr, int l, int m, int r){
        int c = 0;

        int j = m+1;

        for (int i=l; i<=m; i++){
            while (j<=r && arr[i] > 2L* arr[j]){
                j++;
            }
            c += j-(m+1);

        }

        int[] L = new int[m-l+1];
        int[] R = new int[r-m];

        for (int i=0; i<L.length; i++){
            L[i] = arr[l+i];
        }
        for (int i=0; i<R.length; i++){
            R[i] = arr[m+1+i];
        }
        int i = 0, k = l;
         j = 0;
        while (i<L.length && j<R.length){
            if (L[i] <= R[j]){
                arr[k++] = L[i++];
            } else {
                arr[k++] = R[j++];
            }
        }
        while (i<L.length){
            arr[k++] = L[i++];
        }
        while (j<R.length){
            arr[k++] = R[j++];
        }
        return c;
    }

    int mergeSortAndCount(int[] arr, int l, int r){
        if (l>=r) return 0;
        
        int m = l + (r-l)/2;
        int c = mergeSortAndCount(arr, l, m) + mergeSortAndCount(arr, m+1, r);
        c += mergeAndCount(arr, l, m, r);
        return c;
    }

    int reversePairs(int[] arr){
        return mergeSortAndCount(arr, 0, arr.length-1);
    }

    static void printArray(int[] arr){
        for (int num:arr){
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void main(String[] args){
        int[] arr = Generatearray();
        ACP ob = new ACP();
        System.out.println("Number of reverse pairs: " + ob.reversePairs(arr));
        printArray(arr);
    }


}
