//checks whether a given string is palindrome or not
import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter a word");
        String str=in.next();
        if(isPalindrome(str))
            System.out.println(str+" is a palindrome");
        else System.out.println(str+" is not a palindrome");
    }

    private static boolean isPalindrome(String str) {
        str=str.toLowerCase();
        int i=0, j=str.length()-1;
        while(i<j){
            if(str.charAt(i)!=str.charAt(j))
                return false;
            i++; j--;
        }
        return true;
    }
}
