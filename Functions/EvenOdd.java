//defines a method to check if a given number is even or odd
import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter a number");
        int n=in.nextInt();
        if(evenOdd(n)) System.out.println(n+" is an even number");
        else System.out.println(n+" is an odd number");
    }

    static boolean evenOdd(int n) {
        return n%2==0;
    }
}
