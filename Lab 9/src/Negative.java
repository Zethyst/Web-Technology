import java.util.*;

class NegativeNumberException extends Exception {
    private int detail;

    NegativeNumberException(int a) {
        detail = a;
    }

    public String toString() {
        return "Negative Number Found => [" + detail + "]";
    }
}

public class Negative {
    void ProcessInput() {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter a number: ");
            int n = sc.nextInt();
            if (n < 0) {
                throw new NegativeNumberException(n);
            }
            System.out.println("Number is " + (double) n);
        } catch (Exception e) {
            System.out.println("Error Occured: " + e);
        }
    }

    public static void main(String[] args) {
        Negative ob = new Negative();
        ob.ProcessInput();
    }
}