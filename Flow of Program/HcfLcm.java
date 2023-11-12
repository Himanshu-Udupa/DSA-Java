import java.util.Scanner;
//Euclidean algorithm to find the gcd of two numbers. LCM is quotient when product of two numbers is divided by their gcd.
public class HcfLcm {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter two numbers");
        int a=in.nextInt();
        int b=in.nextInt();
        int gcd=hcf(a,b);
        System.out.println("The HCF of "+a+" and "+b+" is "+gcd+"\nThe LCM of "+a+" and "+b+" is "+(a*b)/(gcd));
    }

    private static int hcf(int a, int b) {
        while(b!=0){
            int r=a%b;
            a=b;
            b=r;
        }
        return a;
    }
}
