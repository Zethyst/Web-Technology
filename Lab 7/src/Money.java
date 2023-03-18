import java.util.*;

class Interest {
    int p,r,t;

    void display() {
        Scanner sc = new Scanner(System.in);
        System.out.println("------Interest Calculation------");
        System.out.print("Enter Principal Amount: ");
        p = sc.nextInt();
        System.out.print("Enter Rate of Interest: ");
        r = sc.nextInt();
        System.out.print("Enter Years: ");
        t = sc.nextInt();
    }
}

class SI extends Interest {
    void display() {
        super.display();
        double i = (p * r * t) / 100.0;
        System.out.println("Simple Interest: " + i);
    }
}

class CI extends Interest {
    void display() {
        super.display();
        double i = Math.pow(p * (1 + r / 100.0), t) - p;
        System.out.println("Compound Interest: " + String.format("%.2f",i));
    }
}

class Money {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Interest ob;
        System.out.println("1. Simple Interest");
        System.out.println("2. Compound Interest");
        System.out.println("Enter your choice: ");
        int ch = sc.nextInt();
        switch (ch) {
            case 1:
                ob = new SI();
                ob.display();
                break;

            case 2:
                ob = new CI();
                ob.display();
                break;

            default:
                System.out.println("Wrong Choice!");
                break;
        }
    }
}
