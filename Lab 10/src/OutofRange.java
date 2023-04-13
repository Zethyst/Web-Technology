import java.util.*;

class Out_of_range extends Exception {
    private int detail;

    Out_of_range(int a) {
        detail = a;
    }

    public String toString() {
        return "Invalid Number Found => [" + detail + "]";
    }
}
public class OutofRange {
    void ProcessInput() {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter a number: ");
            int n = sc.nextInt();
            if (n < 10 || n > 50) {
                throw new Out_of_range(n);
            }
            System.out.println("Square of the number " + n * n);
        } catch (Exception e) {
            System.out.println("Error Occured: " + e);
        }
    }
    public static void main(String[] args) {
        OutofRange ob = new OutofRange();
        ob.ProcessInput();
    }
}