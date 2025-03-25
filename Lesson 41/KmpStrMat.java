import java.util.*;

public class KmpStrMat {
    void Kmp(String str, String pat){
        int m = pat.length();
        int n = str.length();

        int[] lps = new int[m];
        int j = 0;
        computeLPSArray(pat, m, lps);
        int i = 0;
        while ((n-i) >= (m-j)){
            if (pat.charAt(j)==str.charAt(i)){
                i++;
                j++;
            }

            if (j==m){
                System.out.println("Pattern found at index " + (i-j));
                j = lps[j-1];
            }

            else if(i<n && pat.charAt(j)!=str.charAt(i)){
                if (j!=0){
                    j=lps[j-1];
                }else{
                    i=i+1;
                }
            }
        }
    }

    void computeLPSArray(String pat, int m, int[] lps){
        int len = 0;
        int i=1;
        lps[0] = 0;

        while (i<m){
            if (pat.charAt(i)==pat.charAt(len)){
                len++;
                lps[i] = len;
                i++;
            }else{
                if (len!=0){
                    len = lps[len-1];
                }else{
                    lps[i] = len;
                    i++;
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

            new KmpStrMat().Kmp(str, pat);
        }
    }
}
