import java.util.*;

class menu_area {
    final static double pi = 3.14;

    static void area(int r) {
        System.out.println("Area of circle is " + pi * r * r);
    }

    static void area(double s) {
        System.out.println("Area of square is " + (int) s * s);
    }

    static void area(int base, int height) {
        System.out.println("Area of triangle is " + (int) (0.5 * base * height));
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("\n---------MENU-------");
            System.out.println("1. Find Circle's Area");
            System.out.println("2. Find Square's Area");
            System.out.println("3. Find Triangle's Area");
            System.out.println("4. Exit");
            System.out.print("Enter your choice");
            int ch = sc.nextInt();
            switch (ch) {
                case 1:
                    System.out.println("\nEnter radius of circle: ");
                    int r = sc.nextInt();
                    area(r);
                    break;
                case 2:
                    System.out.println("\nEnter side of square: ");
                    int s = sc.nextInt();
                    area((double) s);
                    break;
                case 3:
                    System.out.println("\nEnter the base of triangle: ");
                    int b = sc.nextInt();
                    System.out.println("Enter the height of triangle: ");
                    int h = sc.nextInt();
                    area(b, h);
                    break;
                case 4:
                    System.exit(0);
                default:
                    System.out.println("\nWrong Choice!!\nNow tell me..\nWhat is the price of your blind eye?");
            }
        }
    }
}