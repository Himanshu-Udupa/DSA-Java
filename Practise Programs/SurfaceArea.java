//Calculates CSA of Cylinder and TSA of Cube
import java.util.Scanner;

public class SurfaceArea {
    static Scanner in=new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Menu:\n1.Curved Surface Area of Cylinder\n2.Total Surface Area of Cube");
        System.out.println("Enter a choice to calculate the surface area of the given figure");
        int ch= in.nextInt();
        switch (ch) {
            case 1 -> csaCylinder();
            case 2 -> tsaCube();
            default -> System.out.println("Invalid choice");
        }
    }
    private static void tsaCube() {
        System.out.println("Enter the side of a square of the cube");
        int s= in.nextInt();
        int a=6*s*s;
        System.out.println("The TSA of the cube ="+a);
    }
    private static void csaCylinder() {
        System.out.println("Enter the radius and height of the cylinder");
        int r= in.nextInt();
        int h= in.nextInt();
        float a=(float)(2*3.14*r*h);
        System.out.println("The CSA of the cylinder ="+a);
    }
}
