//name is given as input and a greet message is displayed
import java.util.Scanner;

public class GreetMessage {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter a name");
        String name=in.nextLine();
        greet(name);
    }

    private static void greet(String name) {
        System.out.println("Hi! "+name+"\nWelcome to programming :)");
    }
}
