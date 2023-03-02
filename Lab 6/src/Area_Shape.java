import java.util.*;

class Area_Shape{
    final static double pi = 3.14;

   static  void area(int r) {
        System.out.println("Area of circle is " + pi * r * r);
    }

    static void  area(double s) {
        System.out.println("Area of square is " + (int) s * s);
    }

   static  void  area(int base, int height) {
        System.out.println("Area of triangle is " + 0.5 * base * height);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("\nEnter radius of circle: ");
        int r = sc.nextInt();
        System.out.println("Enter side of square: ");
        int s = sc.nextInt();
        System.out.println("Enter the base of triangle: ");
        int b = sc.nextInt();
        System.out.println("Enter the height of triangle: ");
        int h = sc.nextInt();
        area(r);
        area((double)  s);
        area(b,  h);

    }
}