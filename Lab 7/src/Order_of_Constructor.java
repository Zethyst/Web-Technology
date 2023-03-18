import java.util.*;

class Plate {
    Plate(int length, int width) {
        System.out.println("\n\nConstructor called for Plate!");
        System.out.println("Plate's length: " + length);
        System.out.println("Plate's width: " + width);
    }
}

class Box extends Plate {
    Box(int length, int width, int height) {
        super(length, width);
        System.out.println("\n\nConstructor called for Box!");
        System.out.println("Box's length: " + length);
        System.out.println("Box's width: " + width);
        System.out.println("Box's height: " + height);
    }
}

class Wood_Box extends Box {
    Wood_Box(int length, int width, int height, int thick) {
        super(length, width, height);
        System.out.println("\n\nConstructor called for Wood_Box!");
        System.out.println("Wood Box's length: " + length);
        System.out.println("Wood Box's width: " + width);
        System.out.println("Wood Box's height: " + height);
        System.out.println("Wood Box's thick: " + thick);
    }
}

class Order_of_Constructor {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length: ");
        int l = sc.nextInt();
        System.out.println("Enter width: ");
        int w = sc.nextInt();
        System.out.println("Enter height: ");
        int h = sc.nextInt();
        System.out.println("Enter thick: ");
        int t = sc.nextInt();
        Wood_Box ob = new Wood_Box(l, w, h, t);
    }
}