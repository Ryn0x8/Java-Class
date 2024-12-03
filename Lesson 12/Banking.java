import java.util.Scanner;

class InvalidOptionException extends Exception {
    public InvalidOptionException(String message) {
        super(message);
    }
}

class InsufficientOpeningBalanceException extends Exception {
    public InsufficientOpeningBalanceException(String message) {
        super(message);
    }
}

public class Banking {

    private double balance;

    public Banking(double openingBalance) throws InsufficientOpeningBalanceException {
        if (openingBalance < 500) {
            throw new InsufficientOpeningBalanceException("Opening balance must be at least 500.");
        }
        this.balance = openingBalance;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount + ", New Balance: " + balance);
    }

    public void withdraw(double amount) throws Exception {
        if (amount > balance) {
            throw new Exception("Insufficient balance to withdraw " + amount);
        }
        balance -= amount;
        System.out.println("Withdrew: " + amount + ", New Balance: " + balance);
    }

    public void displayBalance() {
        System.out.println("Current Balance: " + balance);
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter opening balance: ");
            double openingBalance = scanner.nextDouble();
            Banking bank = new Banking(openingBalance);

            while (true) {
                System.out.println("\nMenu:");
                System.out.println("1. Deposit");
                System.out.println("2. Withdraw");
                System.out.println("3. Display Balance");
                System.out.println("4. Exit");
                System.out.print("Choose an option: ");
                int option = scanner.nextInt();

                try {
                    switch (option) {
                        case 1 -> {
                            System.out.print("Enter amount to deposit: ");
                            double depositAmount = scanner.nextDouble();
                            bank.deposit(depositAmount);
                        }
                        case 2 -> {
                            System.out.print("Enter amount to withdraw: ");
                            double withdrawAmount = scanner.nextDouble();
                            bank.withdraw(withdrawAmount);
                        }
                        case 3 -> bank.displayBalance();
                        case 4 -> {
                            System.out.println("Exiting...");
                            return;
                        }
                        default -> throw new InvalidOptionException("Invalid option chosen. Please choose 1-4.");
                    }
                } catch (InvalidOptionException e) {
                    System.out.println(e.getMessage());
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
            }
        } catch (InsufficientOpeningBalanceException e) {
            System.out.println(e.getMessage());
        }
    }
}
