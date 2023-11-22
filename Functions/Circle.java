//Radius of circle is given as input and area and circumference of circle are calculated
import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the radius");
        int radius=in.nextInt();
        System.out.println("The circumference of the circle ="+circumference(radius));
        System.out.println("The area of the circle ="+area(radius));
    }

    static float area(int radius) {
        return (float)(3.14*radius*radius);
    }

    static float circumference(int radius) {
        return (float)(2*3.14*radius);
    }
}
