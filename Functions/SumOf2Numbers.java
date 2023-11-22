//method to compute sum of two numbers
import java.util.Scanner;

public class SumOf2Numbers {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter two numbers");
        int a= in.nextInt();
        int b= in.nextInt();
        System.out.println("The sum of two numbers ="+add(a,b));
    }

    static int add(int a, int b) {
        return a+b;
    }
}
