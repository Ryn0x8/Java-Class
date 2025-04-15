import java.util.*;

public class UniqueElements {
    private static ArrayList<String> getUniqueElements(ArrayList<String> arr) {
        ArrayList<String> uniqueElements = new ArrayList<>();

        for (String str: arr){
            if (!uniqueElements.contains(str)) {
                uniqueElements.add(str);
            }
        }
        return uniqueElements;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();
        ArrayList<String> arr = new ArrayList<>();

        System.out.println("Enter the elements:");
        for (int i = 0; i <= n; i++) {
            String element = sc.nextLine();
            arr.add(element);
        }

        System.out.print("Original array: ");
        for (String element : arr) {
            System.out.print(element + " ");
        }
        System.out.println();

        ArrayList<String> uniqueElements = getUniqueElements(arr);
        System.out.print("Unique elements: ");
        for (String element : uniqueElements) {
            System.out.print(element + " ");
        }
        System.out.println();
    }
}
