import java.util.*;

public class GetKPC {

    static Character[][] numtocharmap ;
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)){
            System.out.print("Enter the number of digits: ");
            int n = sc.nextInt();
            System.out.print("Enter the digits: ");
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            printWords(arr);
        }
    }

    public static void generateNumToCharMap(){
        numtocharmap = new Character[10][5];

        numtocharmap[0] = new Character[]{'\0'};
        numtocharmap[1] = new Character[]{'\0'};
        numtocharmap[2] = new Character[]{'a', 'b', 'c'};
        numtocharmap[3] = new Character[]{'d', 'e', 'f'};
        numtocharmap[4] = new Character[]{'g', 'h', 'i'};
        numtocharmap[5] = new Character[]{'j', 'k', 'l'};
        numtocharmap[6] = new Character[]{'m', 'n', 'o'};
        numtocharmap[7] = new Character[]{'p', 'q', 'r', 's'};
        numtocharmap[8] = new Character[]{'t', 'u', 'v'};
        numtocharmap[9] = new Character[]{'w', 'x', 'y', 'z'};
    }
    
    public static void printWords(int[] arr){
    generateNumToCharMap();
    List<String> stringList = printWords(arr, arr.length, 0, "");
    stringList.stream().forEach(System.out::println);
    }

    public static List<String> printWords(int[] arr, int len, int idx, String s){
        if (idx == len){
            return new ArrayList<>(Collections.singleton(s));
        }
        List<String> stringList = new ArrayList<>();
        for (Character item : numtocharmap[arr[idx]]) {
            String scopy = String.copyValueOf(s.toCharArray());
            scopy = scopy.concat(item.toString());
            stringList.addAll(printWords(arr, len, idx+1, scopy));
        }
        return stringList;
    }
}
