//keeps taking input and prints their sum when 0 is entered
import java.util.Scanner;

public class SumUntil0isEntered {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the numbers.\nEnter 0 to print their sum");
        int sum=0,n;
        while(true){
            n=in.nextInt();
            if(n==0) break;
            sum+=n;
        }
        System.out.println("The sum = "+sum);
    }
}
