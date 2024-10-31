public class Predict {
    public static void main(String[] args) {
        boolean sunny = true;
        boolean hot = true;
        if (sunny){
            if (hot){
                System.out.println("Wear sunscreen");
            }else{
                System.out.println("Wear a hat");
            }
        }else{
            System.out.println("Stay inside");
        }
    }
}
