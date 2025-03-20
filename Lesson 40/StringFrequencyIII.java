import java.util.*;

public class StringFrequencyIII {
    public static String modify(String s, String sub, String replace){
        if (!s.contains(sub)){
            return s;
        }
        StringBuilder sb = new StringBuilder();
        String[] spl = s.split(sub);
        for (int i=0; i<spl.length; i++){
            sb.append(spl[i]);
            if (i != spl.length-1){
                sb.append(replace);
            }
        }
        String modified = sb.toString();
        if (!modified.contains(replace)){
            return new StringBuilder().append(modified).append(replace).toString();
        }
        return modified;
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)){
            System.out.print("Enter a string: ");
            String s = sc.nextLine();
            System.out.print("Enter the substring you want to replace: ");
            String sub = sc.nextLine();
            System.out.print("Enter the substring you want to replace with: ");
            String replace = sc.nextLine();

            String modified = modify(s, sub, replace);
            System.out.println("Modified string: " + modified); 
        }
    }    
}
