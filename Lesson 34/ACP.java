import java.util.*;

public class ACP {
    public static int[] Generatearray() {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the number of elements: ");
            int n = sc.nextInt();
            int[] arr = new int[n];

            System.out.println("Enter the elements: ");
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            return arr;

        }
    }

    void sort(int[] arr) {
        int n = arr.length;
        for (int i=1; i< n; i++){
            int key = arr[i];
            int j = i-1;
            while(j>=0 && arr[j]> key){
                arr[j+1] = arr[j];
                j-=1;
            }
            arr[j+1] = key;
        }
    }


    void printArray(int[] arr, HashMap<Integer, Integer> map) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            System.out.print("Element "+ arr[i] + " should be placed at index "+ map.get(arr[i]));
            System.out.println();
        }
    }

    public static void main(String[] args){
        int[] arr = Generatearray();
        int[] nonSortedArr = arr.clone();
        ACP ob = new ACP();
        ob.sort(arr);
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i], i);
        }
        ob.printArray(nonSortedArr, map );
    }
}
