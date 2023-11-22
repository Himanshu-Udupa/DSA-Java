// A method is defined that displays grade of a student based on their marks.
//   The grades are as follows:
//   Marks        Grade 
//   91-100         AA 
//   81-90          AB 
//   71-80          BB 
//   61-70          BC 
//   51-60          CD 
//   41-50          DD 
//   <=40          Fail 

import java.util.Scanner;

public class Grade {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the marks out of 100");
        int marks= in.nextInt();
        System.out.println("Result: "+grade(marks));
    }

    static String grade(int marks) {
        String ans;
        if(marks>90&&marks<=100) ans="AA grade";
        else if(marks>80&&marks<=90) ans="AB grade";
        else if(marks>70&&marks<=80) ans="BB grade";
        else if(marks>60&&marks<=70) ans="BC grade";
        else if(marks>50&&marks<=60) ans="CD grade";
        else if(marks>40&&marks<=50) ans="DD grade";
        else ans="The student is failed";
        return ans;
    }
}
