import java.util.*;

class Details {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String name[] = new String[3];
        int roll[] = new int[3];
        String sec[] = new String[3];
        String Br[] = new String[3];
        for (int i = 0; i < 3; i++) {
            System.out.println("\nUser " + (i + 1) + ":");
            System.out.println("Enter your details below: ");
            System.out.print("Name: ");
            sc.skip("\\R?");
            name[i] = sc.nextLine();
            // sc.nextLine();
            System.out.print("Roll No.: ");
            roll[i] = sc.nextInt();
            System.out.print("Section: ");
            sec[i] = sc.next();
            System.out.print("Branch: ");
            Br[i] = sc.next();
        }
        System.out.println("\n Name \t Roll No \t Section \t Branch");
        for (int i = 0; i < 3; i++) {
            System.out.println(name[i] + "\t" + roll[i] + "\t" + sec[i] + "\t" + Br[i]);
        }
    }
}