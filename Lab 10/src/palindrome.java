import java.util.*;

public class palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = sc.next();
        String newstr = "";
        StringBuffer sb = new StringBuffer(s);
        sb = sb.reverse();
        newstr = sb.toString();
        if (newstr.equals(s)) {
            System.out.println("Both String are Equal!");
        } else
            System.out.println("Strings are NOT Equal!");
    }
}
