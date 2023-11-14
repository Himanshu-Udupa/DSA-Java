//Calculates the perimeter of a figure whose choice is entered
import java.util.Scanner;

public class Perimeter {
    static Scanner in=new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Menu:\n1.Circle\n2.Equilateral Triangle\n3.Parallelogram\n4.Rectangle\n5.Square\n6.Rhombus");
        System.out.println("Enter a choice to calculate the perimeter of the given figure");
        int ch=in.nextInt();
        switch (ch) {
            case 1 -> perimeterCircle();
            case 2 -> perimeterEquilateralTriangle();
            case 3 -> perimeterParallelogram();
            case 4 -> perimeterRectangle();
            case 5 -> perimeterSquare();
            case 6 -> perimeterRhombus();
            default -> System.out.println("Enter a valid choice");
        }
    }

    private static void perimeterRhombus() {
        System.out.println("Enter the side of the rhombus");
        int a=in.nextInt();
        int p=4*(a);
        System.out.println("The perimeter ="+p);
    }

    private static void perimeterSquare() {
        System.out.println("Enter the side of the square");
        int a=in.nextInt();
        int p=4*(a);
        System.out.println("The perimeter ="+p);
    }

    private static void perimeterRectangle() {
        System.out.println("Enter the length and breadth of the rectangle");
        int a=in.nextInt();
        int b=in.nextInt();
        int p=2*(a+b);
        System.out.println("The perimeter ="+p);
    }

    private static void perimeterParallelogram() {
        System.out.println("Enter the measures of the parallel sides of the parallelogram");
        int a=in.nextInt();
        int b=in.nextInt();
        int p=2*(a+b);
        System.out.println("The perimeter ="+p);
    }

    private static void perimeterEquilateralTriangle() {
        System.out.println("Enter the side of the equilateral triangle");
        int a=in.nextInt();
        int p=3*a;
        System.out.println("The perimeter ="+p);
    }

    private static void perimeterCircle() {
        System.out.println("Enter the radius of the circle");
        int r=in.nextInt();
        float p=(float)(2*3.14*r);
        System.out.println("The perimeter ="+p);
    }
}
