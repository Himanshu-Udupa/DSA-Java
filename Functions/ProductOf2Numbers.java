//method that return product of two numbers
import java.util.Scanner;

public class ProductOf2Numbers {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter two numbers");
        int a= in.nextInt();
        int b= in.nextInt();
        System.out.println("The product of two numbers ="+prod(a,b));
    }

    static int prod(int a, int b) {
        return a*b;
    }
}
