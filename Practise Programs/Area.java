//Calculates area of a particular figure whose choice is entered
import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Menu:\n1.Circle\n2.Triangle\n3.Square\n4.Rectangle\n5.Isosceles Triangle\n6.Parallelogram\n7.Rhombus\n8.Equilateral Triangle");
        System.out.println("Enter a choice to calculate the area of the figure");
        int ch = in.nextInt();
        switch (ch) {
            case 1 -> areaCircle();
            case 2 -> areaTriangle();
            case 3 -> areaSquare();
            case 4 -> areaRectangle();
            case 5 -> areaIsoscelesTriangle();
            case 6 -> areaParallelogram();
            case 7 -> areaRhombus();
            case 8 -> areaEquilateralTriangle();
            default -> System.out.println("Enter a valid choice");
        }
    }

    private static void areaSquare() {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter side of the square");
        int s=in.nextInt();
        System.out.println("The area ="+(s*s));
    }

    static void areaEquilateralTriangle() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the side of the equilateral triangle");
        int s = in.nextInt();
        float a = (float) (Math.sqrt(3) * s / 4);
        System.out.println("The area =" + a);
    }
    static void areaRhombus() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the diagonals of the rhombus");
        int d1 = in.nextInt();
        int d2 = in.nextInt();
        float a = (float) (d1 * d2 / 2);
        System.out.println("The area =" + a);
    }
    static void areaParallelogram() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the base and height of the parallelogram");
        int b = in.nextInt();
        int h = in.nextInt();
        int a = b * h;
        System.out.println("The area =" + a);
    }
    static void areaIsoscelesTriangle() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the base and the common side of the isosceles triangle");
        int b = in.nextInt();
        int c = in.nextInt();
        float a = (float) ((b / 2) * Math.sqrt((c * c) - ((float)b * b / 4)));
        System.out.println("The area =" + a);
    }
    static void areaTriangle() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the base and height of the triangle");
        int b = in.nextInt();
        int h = in.nextInt();
        float a = (float) (b * h / 2);
        System.out.println("The area =" + a);
    }
    static void areaRectangle() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the length and breadth of the rectangle");
        int b = in.nextInt();
        int d = in.nextInt();
        int a = b * d;
        System.out.println("The area =" + a);
    }
    static void areaCircle() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the radius of the circle");
        int r = in.nextInt();
        float a = (float) 3.14 * r * r;
        System.out.println("The area =" + a);
    }

}
