//a method that returns the sum of N natural numbers
import java.util.Scanner;

public class SumOfNNaturalNumbers {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter a natural number");
        int n=in.nextInt();
        System.out.println("The sum of first "+n+" natural numbers are "+sum(n));
    }

    private static int sum(int n) {
        return (n*(n+1))/2;
    }
}
