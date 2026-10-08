package Bai1.Bai1_6;
public class Account {
    private String id;
    private String name;
    private double balance;

    public Account (String id, String name) {
        this.id = id;
        this.name = name;
        this.balance = 0.0;
    }

    public Account (String id, String name, double balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    public String getID() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getBalance() {
        return balance;
    }

    public double credit(double amount) {
        balance += amount;
        return balance;
    }

    public double debit(double amount) {
        if (amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Amount exceeded balance");
        }
        return balance;
    }

    public double transferTo (Account another, double amount) {
        if (amount <= balance) {
            this.balance -= amount;
            another.credit(amount);
        } else {
            System.out.println("Amount exceeded balance");
        }
        return balance;
    }

    public String toString() {
        return "Account[id=" + id + ",name=" + name + ",balance=" + balance + "]";
    }
}
