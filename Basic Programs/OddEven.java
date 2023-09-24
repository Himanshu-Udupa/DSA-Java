//This program displays whether a given number is even or odd
import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter a number");
        int num=in.nextInt();
        if(num%2==0)
            System.out.println(num+" is an even number");
        else System.out.println(num+" is a odd number");
    }
}
