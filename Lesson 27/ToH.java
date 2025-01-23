import java.util.*;

public class ToH {
    public static void main(String[] args) {
     try (Scanner sc = new Scanner(System.in)){
         System.out.print("Enter the number of disks: ");
         int n = sc.nextInt();
         System.out.print("Enter the numbe of first tower (t1): ");
         int t1 = sc.nextInt();
         System.out.print("Enter the numbe of second tower (t2): ");
         int t2 = sc.nextInt();
         System.out.print("Enter the numbe of third tower (t3): ");
         int t3 = sc.nextInt();
         toh(n, t1, t2, t3);
     }   
    }
    public static void toh(int n, int t1, int t2, int t3){
        if (n==0) return;
        toh(n-1, t1, t3, t2);
        System.out.println("Move disk "+n+" from TOWER "+t1+" to TOWER "+ t2);
        toh(n-1, t3, t2, t1);
    }
}
