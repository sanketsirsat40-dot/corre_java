package OOP;
class BankAccountt {

    String name;
    int accountNumber;
    double balance;

    // Constructor 1
    BankAccountt() {
        name = "Unknown";
        accountNumber = 0;
        balance = 0;
    }

    // Constructor 2
    BankAccountt(String name) {
        this.name = name;
        accountNumber = 0;
        balance = 0;
    }

    // Constructor 3
    BankAccountt(String name, int accountNumber) {
        this.name = name;
        this.accountNumber = accountNumber;
        balance = 0;
    }

    // Constructor 4
    BankAccountt(String name, int accountNumber, double balance) {
        this.name = name;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: " + balance);
        System.out.println("------------------");
    }
}
public class Constructor_Overloading {

    public static void main(String[] args) {

        BankAccountt a1 = new BankAccountt();

        BankAccountt a2 = new BankAccountt("Sanket");

        BankAccountt a3 = new BankAccountt("Sanket", 12345);

        BankAccountt a4 = new BankAccountt("Sanket", 12345, 50000);

        a1.display();
        a2.display();
        a3.display();
        a4.display();
    }
}
