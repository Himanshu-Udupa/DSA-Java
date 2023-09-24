//This program displays the Ascii value of a character 
import java.util.Scanner;

public class AsciiVal {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the character");
        char ch=in.next().trim().charAt(0);
        System.out.println(ch+0);
    }
}
