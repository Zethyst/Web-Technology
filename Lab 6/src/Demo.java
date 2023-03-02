import java.util.*;

class Box {

    int length, width, height;

    int volume() {
        return length * width * height;
    }
}

class Demo {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Box b = new Box();
        System.out.println("Enter the dimensions of the box: ");
        System.out.println("Length: ");
        b.length = sc.nextInt();
        System.out.println("Width: ");
        b.width = sc.nextInt();
        System.out.println("Height: ");
        b.height = sc.nextInt();
        System.out.println("Volume of the box is " + b.volume());

    }
}