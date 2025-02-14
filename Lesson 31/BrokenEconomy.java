import java.util.Scanner;

public class BrokenEconomy {
    public static void findFloorCeil(int[] arr, int d) {
        int left = 0, right = arr.length - 1;
        int floor = -1, ceil = -1;

        while (left <= right) {
            int mid = (left + right) / 2;

            if (arr[mid] == d) {
                floor = ceil = arr[mid];
                break;
            } else if (arr[mid] < d) {
                floor = arr[mid];
                left = mid + 1;
            } else {
                ceil = arr[mid];
                right = mid - 1;
            }
        }

        System.out.println("Floor: " + floor + ", Ceil: " + ceil);
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the number of elements: ");
            int n = sc.nextInt();
            int[] arr = new int[n];
            
            System.out.println("Enter the sorted elements: ");
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            
            System.out.print("Enter the number to find floor and ceil: ");
            int d = sc.nextInt();
            
            findFloorCeil(arr, d);
        }
    }
}
