import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter a number");
        int a=in.nextInt();
        table(a);
    }

    private static void table(int a) {
        for(int i=1;i<=10;i++)
            System.out.println(a+"*"+i+" = "+(i*a));
    }
}
