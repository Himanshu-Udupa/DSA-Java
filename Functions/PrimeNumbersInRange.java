//a method is defined that returns all the prime numbers in the given range
import java.util.ArrayList;
import java.util.Scanner;

public class PrimeNumbersInRange {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the lower limit");
        int a=in.nextInt();
        System.out.println("Enter the upper limit");
        int b= in.nextInt();
        if(a<0||b<0)
            System.out.println("enter valid numbers");
        else System.out.println("the prime numbers in the given range = "+prime(a,b));
    }

    private static ArrayList prime(int a, int b) {
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=a;i<=b;i++){
            if(isPrime(i))
                list.add(i);
        }
        return list;
    }
    private static boolean isPrime(int n){
        if(n<=1)
            return false;
        int i=2;
        while(i*i<=n){
            if(n%i==0)
                return false;
            i++;
        }
        return i * i > n;
    }
}
