//a method is defined to check if given three numbers are pythagorean triplets or not
import java.util.Scanner;

public class PythagoreanTriplet {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter three numbers");
        int a= in.nextInt();
        int b= in.nextInt();
        int c= in.nextInt();
        if(pythagoras(a,b,c)) System.out.println(a+", "+b+" and "+c+" are pythagorean triplets");
        else System.out.println(a+", "+b+" and "+c+" are not pythagorean triplets");
    }

    static boolean pythagoras(int a, int b, int c) {
        return (a*a)+(b*b)==(c*c);
    }
}
