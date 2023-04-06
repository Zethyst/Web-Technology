import java.util.*;

class HrsException extends Exception {
    private int detail;

    HrsException(int a) {
        detail = a;
    }

    public String toString() {
        return "Invalid Hour Value => [" + detail + "]";
    }
}

class MinException extends Exception {
    private int detail;

    MinException(int a) {
        detail = a;
    }

    public String toString() {
        return "Invalid Minute Value => [" + detail + "]";
    }
}

class SecException extends Exception {
    private int detail;

    SecException(int a) {
        detail = a;
    }

    public String toString() {
        return "Invalid Second Value=> [" + detail + "]";
    }
}

public class Time {
    int hours, minutes, seconds;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Time ob = new Time();
        System.out.println("\nHello, May I know the current time? \n");
        System.out.print("Enter Hour: ");
        ob.hours = sc.nextInt();
        try {
            if (ob.hours > 24 || ob.hours < 0)
                throw new HrsException(ob.hours);
            System.out.print("Enter Minute: ");
            ob.minutes = sc.nextInt();
            if (ob.minutes > 60 || ob.minutes < 0)
                throw new MinException(ob.minutes);
            System.out.print("Enter Second: ");
            ob.seconds = sc.nextInt();
            if (ob.seconds > 60 || ob.seconds < 0)
                throw new SecException(ob.seconds);
            System.out.println("\nThank You!");
        } catch (HrsException e) {
            System.out.println("Error Occured => [" + e + "]");
        } catch (MinException e) {
            System.out.println("Error Occured => [" + e + "]");
        } catch (SecException e) {
            System.out.println("Error Occured => [" + e + "]");
        }
        System.out.println("After Catch Statement");
    }
}
