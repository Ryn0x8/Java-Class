public class StringStorage {
    public static void main(String[] args){
        String s1 = "Hello ";
        String s2 = "World!";
        s1.concat(s2);
        System.out.println(s1);

        String s3 = s1.concat(s2);
        System.out.println(s3);

        String s4 = "HLO";
        String s5 = "HLO";
        System.out.println(s4 == s5);

        String s6 = new String("HLO");
        String s7 = new String("HLO");
        System.out.println(s6 == s7);

        String firstname = "John ";
        String lastname = "Cena";
        String fullname = firstname.concat(lastname);
        System.out.println(fullname);
    }    
}
