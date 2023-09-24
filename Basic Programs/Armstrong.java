//Program to check whether a given number is armstrong number or not
import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=in.nextInt();
        int m=n,sum=0,r;
        while(n>0){
            r=n%10;
            sum=sum+(r*r*r);
            n=n/10;
        }
        if(sum==m)
            System.out.println("The number is a armstrong number");
        else
            System.out.println("The number is not a armstrong number");
    }
}
