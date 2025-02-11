import java.util.ArrayList;
import java.util.List;

public class KTH {
    public static String getPermutation(int n, int k) {
        List<Integer> numbers = new ArrayList<>();
        int fact = 1;

        for (int i = 1; i <= n; i++) {
            numbers.add(i);
            fact *= i;
        }
        k--;

        return findKthPermutation(numbers, k, fact / n);
    }

    private static String findKthPermutation(List<Integer> numbers, int k, int fact) {
        if (numbers.isEmpty()) {
            return "";
        }

        int index = k / fact;
        int num = numbers.remove(index);
        k %= fact;

        fact = numbers.isEmpty() ? 1 : fact / numbers.size();

        return num + findKthPermutation(numbers, k, fact);
    }

    public static void main(String[] args) {
        int n = 3, k = 3;
        System.out.println(getPermutation(n, k));
    }
}
