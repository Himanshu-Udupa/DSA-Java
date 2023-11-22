//defines a method which tells whether a person is eligible to vote or not based on their age given as input
import java.util.Scanner;

public class VoteEligible {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the voter's age");
        int age= in.nextInt();
        if(vote(age)) System.out.println("The voter can vote in the election");
        else System.out.println("The voter can't vote in the election");
    }

    static boolean vote(int age) {
        return age>=18;
    }
}
