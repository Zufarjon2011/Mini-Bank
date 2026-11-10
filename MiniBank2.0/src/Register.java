import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

public class Register {

    static ArrayList<String> users_base = new ArrayList<>();

    Scanner scanner = new Scanner(System.in);
    static String path = "D:\\Zufar's stuff\\MiniBank2.0\\src\\data.txt";


    static public void getReader(){
        try (BufferedReader reader = new BufferedReader(new FileReader(path))){

            for(int i = 0; i < 2; i++){
                if(reader.readLine() == null){
                    break;
                }
            }
            String line;
            while ((line = reader.readLine()) != null){
                users_base.add(line);
            }
        }catch (Exception e){
            System.out.println("Error");
        }
    }

    void showIDS(){

        for(String ids : users_base){
            System.out.println(ids);
        }
    }
}
