//This program checks whether a given number is a prime number or not 
import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the number");
        int num=in.nextInt();
        if(prime(num))
            System.out.println(num+" is a prime number");
        else System.out.println(num+" is not a prime number");
    }

    private static boolean prime(int num) {
        if(num==1) return false;
        //if(num==2) return true;
        for(int i=2;i<=Math.sqrt(num);i++){
            if(num%i==0)
                return false;
        }
        return true;
    }
}
