import java.util.*;

class Stack_is_Full extends Exception {

    public String toString() {
        return "\n[Stack Overflow!]";
    }
}

class Stack_is_Empty extends Exception {

    public String toString() {
        return "\n[Stack Underflow!]";
    }
}

public class Stack {
    public static int TOP = -1;
    public static int STACK[] = new int[5];

    static void push(int number) {
        try {
            if (TOP < 4) {
                TOP++;
                STACK[TOP] = number;
            } else {
                throw new Stack_is_Full();
            }
        } catch (Stack_is_Full e) {
            System.out.println(e);
        }
    }

    static void pop() {
        try {
            if (TOP == -1) {
                throw new Stack_is_Empty();
            } else {
                System.out.println("  \n[Popped Element: " + STACK[TOP] + "]");
                TOP--;
            }
        } catch (Stack_is_Empty e) {
            System.out.println(e);
        }
    }

    static void display() {
        if (TOP == -1)
            System.out.println(" \n[STACK IS EMPTY]");
        else {
            for (int i = TOP; i >= 0; i--) {
                System.out.println("[ " + STACK[i] + " ]");
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack ob = new Stack();
        int ch, number;
        while (true) {
            System.out.println("\n-------------MENU------------");
            System.out.println("1. Push Data into the STACK");
            System.out.println("2. Pop Data from the STACK");
            System.out.println("3. Display the contents of the STACK");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");
            ch = sc.nextInt();
            if (ch == 1) {
                System.out.print("Enter an element to push into the STACK: ");
                number = sc.nextInt();
                ob.push(number);
            }
            if (ch == 2) {
                ob.pop();
            }
            if (ch == 3) {
                ob.display();
            }
            if (ch == 4) {
                System.exit(0);
            }
        }

    }
}
