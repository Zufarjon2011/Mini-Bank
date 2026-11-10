import java.util.Random;

public class tester {
    public static void main(String[] args){
        Random random = new Random();

        String name = "Zufar";
        int len = name.length();

        name = name.toUpperCase();
        char first = name.charAt(random.nextInt(len));

        char second = name.charAt(random.nextInt(len));


        String id = "" + first + second + random.nextInt(100, 999);

        System.out.println(id);
    }
}
