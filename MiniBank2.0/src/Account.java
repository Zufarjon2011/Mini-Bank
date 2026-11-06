import java.util.Random;
import java.util.Scanner;

public class Account {

    String[] letters = {"A", "B", "C", "D", "E", "F", "G", "J"};

    Random random = new Random();
    Scanner scanner = new Scanner(System.in);

    private final String id;
    private String name;
    private double balance = 0;

    Account(String name, double balance){
        this.name = name;
        this.id = letters[random.nextInt(8)] + random.nextInt(100, 999);
        this.balance = balance;
    }

    @Override
    public String toString(){
        return "Account id: " + this.id +
               "\nBalance: " + this.balance;
    }

    //getters
    String getId(){
        return this.id;
    }
    String getName(){
        return this.name;
    }
    double getBalance(){
        return this.balance;
    }
    //setters
    void setName(String newname){
        this.name = newname;
    }

    void Deposit(){
        System.out.print("Enter amount to deposit: ");
        double deposit = scanner.nextDouble();
        scanner.nextLine();

        this.balance += deposit;

        System.out.println("Balance $" + this.balance);
    }
    void Withdraw(){
        System.out.println("You Have $" + this.balance + " in Your Account!");
        System.out.print("Enter Amount To Withdraw: ");
        double amount = scanner.nextDouble();
        scanner.nextLine();

        this.balance -= amount;

        System.out.println("Balance $" + this.balance);
    }
}
