import java.util.ArrayList;
import java.util.Scanner;

public class SwapFirstLast {
    public static ArrayList<String> swapFirstLast(ArrayList<String> list) {
        if (list.size() < 2) {
            return list;
        }
        String first = list.get(0);
        String last = list.get(list.size() - 1);

        list.set(0, last);
        list.set(list.size() - 1, first);

        return list;
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            ArrayList<String> list = new ArrayList<>();
            
            System.out.println("Enter the number of elements you want to add to the list:");
            int numElements = scanner.nextInt();
            scanner.nextLine();
            
            System.out.println("Enter the elements:");
            for (int i = 0; i < numElements; i++) {
                list.add(scanner.nextLine());
            }
            
            System.out.println("Original list: " + list);
            ArrayList<String> swappedList = swapFirstLast(list);
            System.out.println("Swapped list: " + swappedList);
        }
    }
}
