import java.util.ArrayList;
import java.util.Random;

public class Customer extends Account{
    Random random = new Random();

    private ArrayList<Account> accounts = new ArrayList<>();

    private String customer_id;
    private int age;


    Customer(String name, double balance, int age) {
        super(name, balance);
        this.customer_id = letters[random.nextInt(8)] + random.nextInt(100, 999) + "CUS";
        this.age = age;
    }

    public void addAccount(Account account){
        accounts.add(account);
    }

    void getAccount(){
        for(Account account : accounts){
            System.out.println(account);
        }
    }

    String getCustomer_id(){
        return this.customer_id;
    }
    int getAge(){
        return this.age;
    }


}
