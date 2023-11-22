//Leetcode -1920. Build Array from Permutation
import java.util.Scanner;

public class ArrayPermutation {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n=in.nextInt();
        int[] num=new int[n];
        System.out.println("Enter the array elements");
        for(int i=0;i<n;i++)
            num[i]=in.nextInt();
        int[] a=new int[n];
        permutation(num,a);
        System.out.println("The array of permutation");
        for(int i=0;i<n;i++)
            System.out.print(a[i]+" ");
    }

    static void permutation(int[] num, int[] a) {
        for(int i=0;i<=num.length-1;i++)
            a[i]=num[num[i]];
    }
}
