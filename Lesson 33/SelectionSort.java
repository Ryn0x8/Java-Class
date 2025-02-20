import java.util.*;;

public class SelectionSort{
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
    void sort(int[] arr){
        int n = arr.length;
        for (int i=0; i<n-1; i++){
            int min_idx = i;
            for (int j=i+1; j<n; j++){
                if (arr[j] < arr[min_idx]){
                    min_idx = j;
                }
            }
            int temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;
        }
    }

    void reversesort(int[] arr){
        int n = arr.length;
        for (int i=n-1; i>0; i--){
            int max_idx = i;
            for (int j=i-1; j>=0; j--){
                if (arr[j] < arr[max_idx]){
                    max_idx = j;
                }
            }
            int temp = arr[max_idx];
            arr[max_idx] = arr[i];
            arr[i] = temp;
        }
    }

    void printArray(int[] arr){
        int n=arr.length;
        for (int i=0; i<n; i++){
            System.out.print(arr[i] + " ");

        }
        System.out.println();
    }

    public static void main(String[] args){
        
        int[] arr = Generatearray();

            SelectionSort ob = new SelectionSort();
            ob.sort(arr);
            System.out.println("Sorted array: ");
            ob.printArray(arr);
            ob.reversesort(arr);
            System.out.println("Reverse Sorted array: ");
            ob.printArray(arr);
        }
    }
