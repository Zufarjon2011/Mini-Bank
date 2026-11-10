import java.util.Scanner;

public class Login extends Register{

    static String unique_id;
    static String pass;
    static boolean success = false;

    static Scanner scanner = new Scanner(System.in);

    static void getLogin(){

        System.out.print("Enter Unique ID:");
        unique_id = scanner.nextLine();

        System.out.print("Enter Passcode:");
        pass = scanner.nextLine();

        for(int i = 0; i < users_base.size(); i++){
            if(unique_id.equals(users_base.get(i)) && pass.equals(users_base.get(i+1))){
                success = true;
                break;
            }
        }

        if(success){
            System.out.println("Login Success");
        }else {
            System.out.println("Passcode or Login wrong!");
        }
    }

}
