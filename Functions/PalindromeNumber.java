//a method is defined to check if a number is palindrome or not
import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the number");
        int n= in.nextInt();
        if(palindrome(n)) System.out.println(n+" is a palindrome");
        else System.out.println(n+" is not a palindrome");
    }

    static boolean palindrome(int n) {
        int sum=0;
        while(n>0){
            int r=n%10;
            sum=(sum*10)+r;
            n/=10;
        }
        return sum==n;
    }
}
