//Program to check if the given number is a palindrome or not 
import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        System.out.println("Enter a number");
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int temp=n;
        int rev=0;
        while(n>0){
            int a=n%10;
            rev=(rev*10)+a;
            n/=10;
        }
        if(rev==temp)
            System.out.println("The given number is a palindrome");
        else
            System.out.println("Not a palindrome");
    }
}
