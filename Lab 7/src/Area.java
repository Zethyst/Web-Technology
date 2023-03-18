import java.util.Scanner;

abstract class Shape {
    abstract void showArea();

    double area;
}

class Rectangle extends Shape {
    void showArea() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of the rectangle: ");
        int l = sc.nextInt();
        System.out.print("Enter the breadth of the rectangle: ");
        int b = sc.nextInt();
        area = l * b;
        System.out.println("Area of Rectanlge => " + area);
    }
}

class Circle extends Shape {
    void showArea() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the radius of the circle: ");
        int r = sc.nextInt();
        area = 3.14 * r * r;
        System.out.println("Area of Circle => " + String.format("%.2f", area));
    }
}

class Area {
    public static void main(String args[]) {
        Shape obj;
        obj = new Circle();
        obj.showArea();
        obj = new Rectangle();
        obj.showArea();
    }
}