import java.util.*;

public class ACP {
    public static void main(String[] args) {
        int[] A = {40, 10, 20, 50, 30}; 
        int N = A.length;

        int[] sortedArray = selectionSort(A.clone());
        printSortedPositions(A, sortedArray);
    }

    public static int[] selectionSort(int[] arr) {
        int N = arr.length;
        for (int i = 0; i < N - 1; i++) {
            int minIdx = i;
            for (int j = i + 1; j < N; j++) {
                if (arr[j] < arr[minIdx]) {
                    minIdx = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[minIdx];
            arr[minIdx] = temp;
        }
        return arr;
    }

    public static void printSortedPositions(int[] original, int[] sorted) {
        Map<Integer, Integer> positionMap = new HashMap<>();
        for (int i = 0; i < sorted.length; i++) {
            positionMap.put(sorted[i], i);
        }

        for (int num : original) {
            System.out.print(positionMap.get(num) + " ");
        }
    }
}
