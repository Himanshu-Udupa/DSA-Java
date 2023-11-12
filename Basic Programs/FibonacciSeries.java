//prints first n fibonacci numbers
import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter a number");
        fibonacciSeries(in.nextInt());
    }

    private static void fibonacciSeries(int nextInt) {
        if(nextInt==1){
            System.out.println(0);
            return;
        }else if(nextInt==2){
            System.out.println(0+" "+1);
            return;
        }
        int n1=0, n2=1, n3;
        System.out.print(n1+" "+n2);
        for(int i=2;i<nextInt;i++) {
            n3 = n1 + n2;
            n1 = n2;
            n2 = n3;
            System.out.print(" " + n3);
        }
    }
}
