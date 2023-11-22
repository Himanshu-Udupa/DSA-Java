//defines a method to check whether a given number is prime or not
import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the number");
        int n= in.nextInt();
        if(prime(n)) System.out.println(n+" is a prime number");
        else System.out.println(n+" is not a prime number");
    }

    static boolean prime(int n) {
        if(n<2) return false;
        for (int i = 2; i <= n / 2; i++) {
                if (n % i == 0)
                    return false;
            }
        return true;
    }
}
