//to check whether a number is odd or even
import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter a number");
        int a=in.nextInt();
        if(isEvenOdd(a))
            System.out.println(a+" is an even number");
        else System.out.println(a+" is an odd number");
    }

    private static boolean isEvenOdd(int a) {
        return a%2==0;
    }
}
