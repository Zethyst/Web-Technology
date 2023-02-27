import java.util.*;

public class integer_check {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three numbers: ");
        char arr[] = new char[3];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.next().charAt(0);
        }
        int flag = 0;
        for (int i = 0; i < arr.length; i++) {
            if ((Character.isDigit(arr[i])) == false) {
                flag = 1;
                break;
            }
        }
        if (flag == 1) {
            System.out.println("Enter valid integer inputs!!");
            System.exit(0);
        } else {
            System.out.println("All numbers are integers");
            int max = (int)(arr[0]);
            for (int i = 0; i < arr.length; i++) {
                if (max < (int)(arr[i]))
                    max = (int)(arr[i]);
            }
            System.out.println("Largest Number among the integers is " + (char) max);
        }
    }
}
