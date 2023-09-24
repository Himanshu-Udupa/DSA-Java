//This program displays the reverse of a given number
import java.util.Scanner;

public class ReverseNo {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter a number");
        int num= in.nextInt();
        System.out.println("The reverse of "+num+" is "+reverse(num));
    }

    private static int reverse(int num) {
        int sum=0,r;
        while(num!=0){
            r=num%10;
            sum=sum*10+r;
            num/=10;
        }
        return sum;
    }
}
