import java.util.*;
public class FactorFinder {
    public static ArrayList<Integer> getFactors(int n){
        ArrayList<Integer> factors = new ArrayList<>();
        for (int i = 1; i<=n; i++){
            if (n%i ==0){
                factors.add(i);
            }
        }
        return factors;
    }

    public static void main(String[] args){
        try (Scanner sc = new Scanner(System.in)){
            System.out.print("Enter a number to find its factors: ");
            int n = sc.nextInt();
            ArrayList<Integer> factors = getFactors(n);
            System.out.print("Factors of " + n + " are: " );
            for (int factor : factors){
                System.out.print(factor + " ");
            }
            System.out.println();

        }
    }
}
