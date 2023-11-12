//prints all the armstrong numbers in a given interval
import java.util.Scanner;

public class ArmstrongNumbersInInterval {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter two numbers");
        int a=in.nextInt();
        int b=in.nextInt();
        Armstrong(a,b);
    }

    private static void Armstrong(int a, int b) {
        for(int i=a;i<=b;i++){
            int x=i, n=0, sum=0;
            while(x!=0){
                x/=10;
                n++;
            }
            x=i;
            while(x!=0){
                int r=x%10;
                x/=10;
                sum+=Math.pow(r,n);
            }
            if(sum==i) System.out.print(i+" ");
        }
    }
}
