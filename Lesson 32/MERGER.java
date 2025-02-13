public class MERGER {
    public static void bubbleSort(int[] arr, int n) {
        int temp, i, j;
        boolean swapped;

        for (i=0; i<n; i++){
            swapped = false;
            for (j=0; j<n-i-1; j++){
                if (arr[j]> arr[j+1]){
                    temp = arr[j];
                    arr[j]  = arr[j+1];
                    arr[j+1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) break;
        }
    }

    // public static void mergeinSorted(int[] arr1, int[] arr2, int[] merged){
    //     int i = 0, j = 0, k = 0;
    //     int n1= arr1.length, n2 = arr2.length;
    //     System.out.println("Debug: n1: "+ n1 + " n2: "+ n2);
    //     System.out.println("Debug: arr1: ");
    //     printArray(arr1, n1);
    //     System.out.println("Debug: arr2: ");
    //     printArray(arr2, n2);
        
    //     while (i< n1 || j<n2){
    //         if (arr1[i] < arr2[j]){
    //             merged[k] = arr1[i];
    //             System.out.println("Debug: merged[k]" + merged[k]+"arr1: "+ arr1[i]);
    //             i++;
    //             k++;
    //         }
    //         else{
    //             merged[k] = arr2[j];
    //             System.out.println("Debug: merged[k]" + merged[k]+"arr2: "+ arr2[j]);
    //             j++;
    //             k++;
    //         }
    //     }
// 
    // }

    public static void mergeinSorted(int arr1[], int arr2[], int n1, int n2, int merged[]) {
    int i = 0, j = 0, k = 0;
    while (i < n1 && j < n2) {
        if (arr1[i] < arr2[j]) {
            merged[k++] = arr1[i++];
        } else {
            merged[k++] = arr2[j++];
        }
    }
    while (i < n1) {
        merged[k++] = arr1[i++];
    }
    while (j < n2) {
        merged[k++] = arr2[j++];
    }
}


    public static void printArray(int[] arr, int n){
        for (int i=0; i<n; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args){
        int[] arr1 = {1, 3, 5, 7, 9};
        int[] arr2 = {2, 4, 6, 8, 10};
        int n1 = arr1.length;
        int n2 = arr2.length;
        bubbleSort(arr2, n2);
        bubbleSort(arr1, n1);

        int[] mergedarr = new int[n1+n2];
        mergeinSorted(arr1, arr2, n1,  n2,mergedarr);
        System.out.println("Merged Array: ");
        printArray(mergedarr, n1+n2);
        
    }    
}
