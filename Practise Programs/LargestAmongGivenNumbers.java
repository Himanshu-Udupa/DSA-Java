//takes numbers as input and prints the largest among them when 0 is entered
import java.util.Scanner;

public class LargestAmongGivenNumbers {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the numbers.\nEnter 0 to print largest among them");
        int max=0,n;
        while(true){
            n=in.nextInt();
            if(n==0) break;
            if(n>max) max=n;
        }
        System.out.println("The largest number is "+max);
    }
}

