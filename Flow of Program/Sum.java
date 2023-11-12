import java.util.Scanner;
//sum of two numbers
public class Sum {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter two numbers");
        int a=in.nextInt();
        int b=in.nextInt();
        System.out.println("Sum = "+(a+b));
    }
}
