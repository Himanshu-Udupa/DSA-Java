//This program prints first N Fibonacci number
import java.util.Scanner;

public class FibonacciNo {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter a number");
        int n=in.nextInt();
        System.out.println("The first "+n+" fibonacci numbers are:");
        fibo(n);
    }

    private static void fibo(int n) {
        if(n==0) return;
        if(n==1){
            System.out.println(0);
            return;
        }
        int n1=0,n2=1,n3;
        System.out.print(n1+" "+n2+" ");
        for(int i=2;i<n;i++){
            n3=n1+n2;
            System.out.print(n3+" ");
            n1=n2;
            n2=n3;
        }
    }
}
