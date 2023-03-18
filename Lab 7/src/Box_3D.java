import java.util.*;

class sheet_2D {
    int length, breadth;

    void calc() {
        System.out.println("\nPrice of creating the sheet amounts to => " + length * breadth * 40 + " Rs");
    }
}

class Box_3D extends sheet_2D {
    int height;

    void calc() {
        super.calc();
        System.out.println("\nPrice of creating the box amounts to => " + length * breadth * height * 60 + " Rs");
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Box_3D ob = new Box_3D();
        System.out.println("Enter the dimensions of the sheet => ");
        System.out.print("Length: ");
        ob.length = sc.nextInt();
        System.out.print("Breadth: ");
        ob.breadth = sc.nextInt();
        System.out.println("Enter the height of the box => ");
        ob.height = sc.nextInt();
        ob.calc();
    }
}
