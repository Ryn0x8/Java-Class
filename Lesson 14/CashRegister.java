class CashReg {
    private double purchase;
    private double payment;
    private int itemCount;

    public CashReg() {
        purchase = 0;
        payment = 0;
        itemCount = 0;
    }

    public void recordPurchase(double amount) {
        purchase += amount;
        itemCount++;
    }

    public void receivePayment(double amount) {
        payment += amount;
    }

    public double giveChange() {
        double change = payment - purchase;
        purchase = 0;
        payment = 0;
        return change;
    }

    public int getItemCount() {
        return itemCount;
    }
    public static int countTotal(CashReg[] registers) {
        int totalItems = 0;
        for (CashReg register : registers) {
            totalItems += register.getItemCount();
        }
        return totalItems;
    }

    @Override
    public String toString() {
        return "Purchase: " + purchase + ", Payment: " + payment + ", Items: " + itemCount;
    }
}


public class CashRegister {
    public static void main(String[] args) {
        CashReg register = new CashReg();
        System.out.println("Starting Cash Register Operations...");
        register.recordPurchase(25.50); 
        register.recordPurchase(14.75);
        System.out.println("Number of items purchased: " + register.getItemCount());
        System.out.println("Total purchase amount: " + register.toString());

        register.receivePayment(50.00);

        double change = register.giveChange();
        System.out.println("Change to be given: $" + change);

        System.out.println("After reset: " + register.toString());
    }
}
