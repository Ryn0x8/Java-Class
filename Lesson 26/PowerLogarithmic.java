import java.util.*;

public class PowerLogarithmic {
    public static void main(String[] args){
        try (Scanner sc = new Scanner(System.in)){
            System.out.print("Enter the base number(x): ");
            int x = sc.nextInt();
            System.out.print("Enter the power number(n): ");
            int n = sc.nextInt();
            int pw = power(x, n);
            System.out.println("Result: " + pw);
        }
    }
    public static int power(int x, int n){
        if (n==0) return 1;
        int xpnb2 = power(x, n/2);

        int xpn = xpnb2 * xpnb2;
        System.out.println("x: " + x + " n: " + n + " xpnb2: " + xpnb2 + " xpn: " + xpn + " n/2: " + n/2);
        if (n% 2 == 1){
            xpn *= x;
        }
        System.out.println("11. x: " + x + " n: " + n + " xpn: " + xpn);
        return xpn;
    }    
}
