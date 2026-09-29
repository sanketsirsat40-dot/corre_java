package OOP;

class BankAccount{

    private double balance;

    public void deposit(double amount){
        if(amount > 0){
            balance += amount;
        }
    }

    public void withdraw(double amount){
        if(amount <= balance){
            balance -= amount;
        }
    }

    public double getBalance(){
        return balance;
    }
}

public class encapsulation_1{
    public static void main(String[] args){

        BankAccount acc = new BankAccount();

        acc.deposit(5000);
        acc.withdraw(1500);

        System.out.println(acc.getBalance());
    }
}
