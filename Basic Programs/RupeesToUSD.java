//converts rupees to USD
import java.util.Scanner;
//assuming 1 rupee is 0.012 dollar
public class RupeesToUSD {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter rupees");
        float rupees=in.nextInt();
        System.out.println("Rs."+rupees+" = "+"$"+(rupees*0.012));
    }
}
