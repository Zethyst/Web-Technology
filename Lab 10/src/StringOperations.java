import java.util.*;

public class StringOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = sc.next();
        StringBuffer sb = new StringBuffer(s);
        System.out.println("[ Original String ]\n" + sb);
        s = s.toUpperCase();
        System.out.println("[ After Changing to Upper Case ]\n" + s);
        sb.reverse();
        System.out.println("[ After Reversing the String ]\n" + sb);
        System.out.print("Enter another string: ");
        String s2 = sc.next();
        s = s.toLowerCase();
        if (s.compareTo(s2) > 0) {
            System.out.println(s + " is greater!\n");
        } else {
            System.out.println(s2 + " is greater!\n");
        }
        sb.reverse();
        sb.insert(2, s2);
        System.out.println("[ After Inserting the Other String ]\n" + sb);
    }
}
