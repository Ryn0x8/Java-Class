import java.util.*;

public class UniqueElements {
    public static int[] getUniqueElements(int[] arr1, int[] arr2){
        Set<Integer> uniqueElements = new HashSet<>();
        for (int num: arr1){
            uniqueElements.add(num);
        }
        for (int num: arr2){
            uniqueElements.add(num);
        }
        int[] result = new int[uniqueElements.size()];
        int i = 0;
        for (int num: uniqueElements){
            result[i++] = num;
        }
        return result;
    }
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {4, 5, 6, 7, 8};
        int[] uniqueElements = getUniqueElements(arr1, arr2);
        System.out.print("Unique elements: ");
        for (int num: uniqueElements){
            System.out.print(num + " ");
        }
    }

}
