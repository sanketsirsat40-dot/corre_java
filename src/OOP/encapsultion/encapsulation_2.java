package OOP.encapsultion;


class DigitalWallet {

    // Private data members (Encapsulation)
    private String walletId;
    private String ownerName;
    private double balance;
    private double dailyLimit;
    private double totalSpentToday;

    // Initialize wallet
    public void setWalletDetails(String id, String name,
                                 double openingBalance,
                                 double limit) {
        walletId = id;
        ownerName = name;
        balance = openingBalance;
        dailyLimit = limit;
        totalSpentToday = 0;

        System.out.println("Wallet Created Successfully");
    }

    // Add money
    public void addMoney(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("₹" + amount + " Added Successfully");
        } else {
            System.out.println("Invalid Deposit Amount");
        }
    }

    // Make payment
    public void pay(double amount) {

        if (amount <= 0) {
            System.out.println("Invalid Payment Amount");
        }
        else if (amount > balance) {
            System.out.println("Payment Failed: Insufficient Balance");
        }
        else if (totalSpentToday + amount > dailyLimit) {
            System.out.println("Payment Failed: Daily Limit Exceeded");
        }
        else {
            balance -= amount;
            totalSpentToday += amount;
            System.out.println("Payment of ₹" + amount + " Successful");
        }
    }

    // Reset daily spending
    public void resetDailyLimit() {
        totalSpentToday = 0;
        System.out.println("Today's Limit Reset Successfully");
    }

    // Getter
    public double getBalance() {
        return balance;
    }

    // Display details
    public void displayWallet() {
        System.out.println("\n------ Wallet Details ------");
        System.out.println("Wallet ID      : " + walletId);
        System.out.println("Owner Name     : " + ownerName);
        System.out.println("Balance        : ₹" + balance);
        System.out.println("Daily Limit    : ₹" + dailyLimit);
        System.out.println("Spent Today    : ₹" + totalSpentToday);
    }
}

public class encapsulation_2 {

    public static void main(String[] args) {

        DigitalWallet wallet = new DigitalWallet();

        wallet.setWalletDetails("W101", "Sanket", 5000, 3000);

        wallet.addMoney(1000);

        wallet.pay(1200);

        wallet.pay(2500);

        wallet.pay(500);

        System.out.println("\nCurrent Balance: ₹" + wallet.getBalance());

        wallet.resetDailyLimit();

        wallet.displayWallet();
    }
}