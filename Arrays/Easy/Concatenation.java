//Leetcode-1929. Concatenation of Array
import java.util.Scanner;

public class Concatenation {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n=in.nextInt();
        int[] a=new int[n];
        System.out.println("Enter the array elements");
        for(int i=0;i<n;i++)
            a[i]=in.nextInt();
        int[] num=new int[2*n];
        concatenate(a,num);
        System.out.println("The concatenated array:");
        for(int i=0;i<num.length;i++)
            System.out.print(num[i]+" ");
    }

    static void concatenate(int[] a, int[] num) {
        for(int i=0;i<num.length;i++){
            if(i<a.length)
                num[i]=a[i];
            else num[i]=a[i-a.length];
        }
    }
}
