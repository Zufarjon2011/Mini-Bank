import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Random;

public class Transaction extends Account{

    Random random = new Random();
    private String transaction_id;
    private String type;
    private double amount;
    private LocalDateTime dateTime;

    Transaction(String name, double balance) {
        super(name, balance);
    }
}
