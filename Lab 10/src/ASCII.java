import java.util.*;

public class ASCII {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string with 4 characters: ");
        String s = sc.next();
        String newstr = "";
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            newstr += (int) ch + " ";
        }
        System.out.println("New String (with corresponding ASCII values) => " + newstr);
    }
}
