import java.util.Scanner;

class calc {
    int length, breadth;
    int a, p;

    void area() {
        a = length * breadth;
        System.out.println("Area of Rectanlge is " + a);
    }

    void perimeter() {
        p = (2 * (length + breadth));
        System.out.println("Area of Rectanlge is " + p);
    }
}

class rectangle {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        calc ob = new calc();
        System.out.print("Enter the length of rectangle: ");
        ob.length = sc.nextInt();
        System.out.print("Enter the breadth of rectangle: ");
        ob.breadth = sc.nextInt();
        System.out.print("Area of rectangle is ");
        ob.area();
        System.out.print("Area of rectangle is ");
        ob.perimeter();
    }
}
