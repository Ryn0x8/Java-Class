import java.util.*; 

public class RabinKarp{

    public final static int D = 10;
    static void search(String pat, String str, int q){
        int m = pat.length();
        int n = str.length();
        int p = 0;
        int t = 0;
        int h = 1;

        for (int i = 0; i<m-1; i++){
            h = (h*D)%q;
        }
        for (int i = 0; i<m; i++){
            p = (D*p + pat.charAt(i))%q;
            t = (D*t + str.charAt(i))%q;
        }

        for (int i=0; i<=n-m; i++){
            if (p==t){
                int j=0;
                while (j<m && str.charAt(i+j)==pat.charAt(j)){
                    j++;
                }

                if (j==m){
                    System.out.println("Pattern found at index " + i);
                }
            }

            if (i<n-m){
                t = (D*(t - str.charAt(i)*h)+ str.charAt(i+m))%q;
                if (t<0){
                    t = (t+q);
                }
            }
        }

    }

    public static void main(String[] args){
        try (Scanner sc = new Scanner(System.in)){
            System.out.print("Enter the string to search in: ");
            String str = sc.nextLine();

            System.out.print("Enter the pattern to search for: ");
            String pat = sc.nextLine();

            System.out.print("Enter the value of prime number for modulus (for eg: 13): ");
            int q = sc.nextInt();
            search(pat, str, q);
        }
    }
}