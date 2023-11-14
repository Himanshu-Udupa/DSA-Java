import java.util.Scanner;

public class SubtractProductSum {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the number");
        int n= in.nextInt();
        int r, p=1, s=0;
        while(n>0){
            r=n%10;
            p=p*r;
            s=s+r;
            n=n/10;
        }
        System.out.println("The difference = "+(p-s));
    }
}
