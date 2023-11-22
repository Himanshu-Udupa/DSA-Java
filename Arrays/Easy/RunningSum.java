//Leetcode -1480. Running Sum of 1d Array
import java.util.Scanner;

public class RunningSum {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n=in.nextInt();
        int[] num=new int[n];
        System.out.println("Enter the array elements");
        for(int i=0;i<n;i++)
            num[i]=in.nextInt();
        int[] runningSum=new int[n];
        runSum(num,runningSum);
        System.out.println("The running sum array is:");
        for(int i=0;i<n;i++)
            System.out.print(runningSum[i]+" ");
    }

    static void runSum(int[] num, int[] runningSum) {
        int sum=0;
        for(int i=0;i<num.length;i++) {
            for (int j = 0; j <= i; j++) {
                runningSum[i] = sum + num[j];
            }
            sum=runningSum[i];
        }
    }
}
