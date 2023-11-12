import java.util.Scanner;

public class SumOfNumbers {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the numbers.\n(Enter 'X' to print their sum)");
        int sum=0;
        while(true){
            String n=in.next();
            if(n.equals("x")||n.equals("X"))
                break;
            else sum+=Integer.parseInt(n);
        }
        System.out.println("Sum = "+sum);
    }
}
