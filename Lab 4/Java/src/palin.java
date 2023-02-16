import java.util.*;

class palin {
    public static void main(String args[]) {
        Scanner Sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = Sc.nextInt();
        int rem, rev = 0;
        for (int i = num; i > 0; i = i / 10) {
            rem = i % 10;
            rev = rev * 10 + rem;
        }
        if (num == rev)
            System.out.println("\nPalindrome successfully detected");
        else
            System.out.println("\nThe input number is not a palindrome");
    }
}
