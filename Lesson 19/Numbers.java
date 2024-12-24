
import java.util.Arrays;
import java.util.Scanner;


public class Numbers {
    public static int size = 0;
    public static int[] defaultArray = new int[0];
    public static int[] sortedArray = new int[0];
    public static int[] reversedArray = new int[0];


    public static void sortArray(){
        sortedArray = new int[size];
        sortedArray = Arrays.copyOf(defaultArray, defaultArray.length);
        Arrays.sort(sortedArray);
    }

    public static void printArray(){
        System.out.println("Elements of the Array: ");
        for (int i =0; i < size; i++){
            System.out.println("Element "+i+": "+ defaultArray[i]);
        }
    }

    public static void arrayReverse(){
        int ind = 0;
        sortedArray = new int[size];
        reversedArray = new int[size];
        sortedArray = Arrays.copyOf(defaultArray, defaultArray.length);
        Arrays.sort(sortedArray);

        int sze = sortedArray.length;

        for (int i = sze-1; i >= 0; i--){
            reversedArray[ind] = sortedArray[i];
            ind++;
        }
    }

    public static int searchElement(int number){
        int index = -1;

        for (int i = 0; i<size; i++){
            if (defaultArray[i] == number){
                index = i;
                break;
            }
        }
        return index;
    }

    public static void main(String[] args){
        try (Scanner scanner = new Scanner(System.in)){
            System.out.print("Enter the size of the array: ");
            size = scanner.nextInt();
            defaultArray = new int[size];
            for (int i = 0; i< size; i++){
                defaultArray[i] = scanner.nextInt();
            }
            sortArray();
            System.out.println("Sorted Array: "+ Arrays.toString(sortedArray));
            printArray();
            System.out.println("Enter a number to search: ");
            int num = scanner.nextInt();
            System.out.println("Index of given element is: "+searchElement(num));
            arrayReverse();
            System.out.println("Reversed Array: "+ Arrays.toString(reversedArray));
        }
    }
}

