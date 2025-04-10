import java.util.*;

public class FindDuplicates{
    public static int[] findDuplicates(int[] orgArray){
        Set<Integer> uniqueValues = new HashSet<>();
        Set<Integer> duplicates = new HashSet<>();
        for (int num: orgArray){
            if (!uniqueValues.add(num)){
                duplicates.add(num);
            }
        }
        int[] result = new int[duplicates.size()];
        int i = 0;
        for (int num: duplicates){
            result[i++] = num;
        }
        
        return result;
    }

    public static void main(String[] args) {
        int[] orgArr = {2, 4, 6, 3, 5, 2, 6, 7, 4, 9, 8, 9, 5};
        int[] duplicates = findDuplicates(orgArr);

        if (duplicates.length == 0) {
            System.out.println("No duplicates found.");
        } else {
            System.out.print("Duplicates: ");
            for (int num : duplicates) {
                System.out.print(num + " ");
            }
        }

    }
}