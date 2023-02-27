import java.util.*;

public class even_odd_frequencies {
    static String check(char temp)
    {
        if (temp%2==0) {
            return "Even";
        }
        else
        {
            return "Odd";
        }
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        char arr[] = new char[10];
        System.out.println("Enter 10 numbers: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.next().charAt(0);
            if ((Character.isDigit(arr[i])) == false) {
                System.out.println("Enter valid integer inputs!!");
                System.exit(0);
            }
        }
        System.out.println("\nNumber\t:  Frequency\t:  (Even/Odd)");
        for (int i = 0; i < arr.length; i++) {
            int count = 1;
            if (arr[i] != 0) {
                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[i] == arr[j]) {
                        count++;
                        arr[j] = 0;
                    }
                }
                System.out.println(arr[i] + "\t:\t" + count + "\t:\t" + check(arr[i]));
            }
        }
    }
}
