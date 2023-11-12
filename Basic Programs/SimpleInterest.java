//calculates simple interest for given Prinicple amount, rate and time
import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter Principle amount, Rate and Time");
        int p=in.nextInt();
        int r=in.nextInt();
        int t=in.nextInt();
        System.out.println("The simple interest is "+si(p,t,r));
    }

    private static float si(int p, int t, int r) {
        return (float)(p*t*r)/100;
    }
}
