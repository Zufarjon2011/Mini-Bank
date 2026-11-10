import java.io.BufferedReader;
import java.io.FileReader;

public class Main{
    public static void main(String[] args){
//        Account account1 = new Account("Zufar", 777);
//        Account account2 = new Account("Bosd", 444);
//        Account account3 = new Account("Nirvana", 666);
//        Customer customer1 = new Customer(account1.getName(), account1.getBalance(), 16);
//        Customer customer2 = new Customer(account2.getName(), account2.getBalance(), 18);
//        Customer customer3 = new Customer(account3.getName(), account3.getBalance(), 18);
//
//        customer1.addAccount(account1);
//        customer2.addAccount(account2);
//
//        customer1.getAccount();
//        customer2.getAccount();
//
//        account3.Withdraw();
        Register.getReader();

        System.out.println(Register.users_base.get(0));
        System.out.println(Register.users_base.get(1));


        Login.getLogin();


    }
}