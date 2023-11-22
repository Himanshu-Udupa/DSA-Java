//a method is defined that calculates the factorial of a number
import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the number");
        int n= in.nextInt();
        System.out.println("The factorial of given number ="+factorial(n));
    }

    static int factorial(int n) {
        int p=1;
        if(n==1||n==0)
            return 1;
        for(int i=2;i<=n;i++)
            p=p*i;
        return p;
    }
}
