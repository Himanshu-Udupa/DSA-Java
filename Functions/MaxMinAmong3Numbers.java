//two methods are defined wherein one method returns maximum among 3 numbers and other returns minimum among them
import java.util.Scanner;

public class MaxMinAmong3Numbers {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter three numbers");
        int a= in.nextInt();
        int b= in.nextInt();
        int c= in.nextInt();
        System.out.println("The largest number among "+a+", "+b+" and "+c+" is "+maximum(a,b,c));
        System.out.println("The smallest number among "+a+", "+b+" and "+c+" is "+minimum(a,b,c));
    }

    static int maximum(int a, int b, int c) {
        int max=a;
        if(max<b)
            max=b;
        if(max<c)
            max=c;
        return max;
    }

    static int minimum(int a, int b, int c) {
        int min=a;
        if(min>b)
            min=b;
        if(min>c)
            min=c;
        return min;
    }
}
