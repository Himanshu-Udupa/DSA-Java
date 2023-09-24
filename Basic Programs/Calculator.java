//calculator program without using switch statement
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int result=0;
        while(true){
            System.out.println("Enter the operator");
            char op=in.next().trim().charAt(0);
            if(op=='+' || op=='-' || op=='*' || op=='/' || op=='%') {
                System.out.println("Enter two numbers");
                int a = in.nextInt();
                int b = in.nextInt();
                if (op == '+')
                    result = a + b;
                if (op == '-')
                    result = a - b;
                if (op == '*')
                    result = a * b;
                if (op == '/')
                    result = a / b;
                if (op == '%')
                    result = a % b;
            }
            else if(op=='x'||op=='X')
                break;
            else
                System.out.println("Invalid operator");
            System.out.println("The result ="+result);
        }
    }
}
