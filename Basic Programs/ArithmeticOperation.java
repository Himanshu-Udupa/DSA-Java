//two numbers and an operator are given as input and the result is displayed
import java.util.Scanner;

public class ArithmeticOperation {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter two numbers");
        int a=in.nextInt();
        int b=in.nextInt();
        System.out.println("Enter an operator");
        char ch=in.next().trim().charAt(0);
        int res=0;
        if(ch=='+')
            res=a+b;
        else if(ch=='-')
            res=a-b;
        else if(ch=='*')
            res=a*b;
        else res=a/b;
        System.out.println("The result is "+res);
    }
}
