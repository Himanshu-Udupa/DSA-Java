import java.util.Scanner;

public class Volume {
    static Scanner in=new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Menu:\n1.Cone\n2.Prism\n3.Cylinder\n4.Sphere\n5.Pyramid");
        System.out.println("Enter a choice to calculate the volume of the given figure");
        int ch=in.nextInt();
        switch (ch) {
            case 1 -> volumeCone();
            case 2 -> volumePrism();
            case 3 -> volumeCylinder();
            case 4 -> volumeSphere();
            case 5 -> volumePyramid();
            default -> System.out.println("Enter a valid choice");
        }
    }

    private static void volumePyramid() {
        System.out.println("Enter the length, breadth of the base and height of the pyramid");
        int l=in.nextInt();
        int b=in.nextInt();
        int h=in.nextInt();
        float v=(float)(l*b*h/3);
        System.out.println("The volume ="+v);
    }

    private static void volumeSphere() {
        System.out.println("Enter the radius of the sphere");
        int r=in.nextInt();
        float v=(float)(4*r*r*r*3.14/3);
        System.out.println("The volume ="+v);
    }

    private static void volumeCylinder() {
        System.out.println("Enter the radius of the base and the height of the cylinder");
        int r=in.nextInt();
        int h=in.nextInt();
        float v=(float)(3.14*r*r*h);
        System.out.println("The volume="+v);
    }

    private static void volumePrism() {
        System.out.println("Enter the height and base of the triangle and the height of the prism");
        int b=in.nextInt();
        int h=in.nextInt();
        int l=in.nextInt();
        float v=(float)(b*h*l/2);
        System.out.println("The volume ="+v);
    }

    private static void volumeCone() {
        System.out.println("Enter the radius of the base and height of the cone");
        int r=in.nextInt();
        int h=in.nextInt();
        float v=(float)(3.14*r*r*h/3);
        System.out.println("The volume ="+v);
    }
}
