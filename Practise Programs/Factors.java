//Prints the factors of a number
import java.util.Scanner;

public class Factors {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the number");
        int n= in.nextInt();
        System.out.println("The factors of the number are:");
        for(int i=1;i<=n;i++){
            if(n%i==0)
                System.out.print(i+" ");
        }
    }
}
