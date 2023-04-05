import java.util.*;

abstract class student {
    int roll_no, reg_no;

    abstract void course(String str);

    abstract void branch(String str);
}

class Generic extends student {
    void course(String str) {
        System.out.println("Subject: " + str);
        Scanner sc = new Scanner(System.in);

    }

    void branch(String str) {
        System.out.println("Your branch is " + str);
        // Scanner sc = new Scanner(System.in);
        // System.out.println("1. Computer Science");
        // System.out.println("2. Electrical Engineering");
        // System.out.println("3. Mechanical Engineering");
        // System.out.println("4. Chemical Engineering");
        // System.out.println("5. Civil Engineering");
        // System.out.println("Enter your branch: ");
        // int ch = sc.nextInt();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Generic ob = new Generic();
        System.out.println("Enter your Roll No: ");
        ob.roll_no = sc.nextInt();
        System.out.println("Enter your Registration No: ");
        ob.reg_no = sc.nextInt();
        System.out.println("Enter your branch: ");
        sc.skip("\\R?");
        String br = sc.nextLine();
        ob.branch(br);

        String sub[] = new String[10];
        int i = 0;
        System.out.println("Enter the subjects: ");
        while (true) {
            System.out.println("Subject " + (i + 1) + ": ");
            sc.skip("\\R?");
            sub[i] = sc.nextLine();
            ob.course(sub[i]);
            i++;
            System.out.println("Do you want to add another subject?\n(1/0): ");
            int ch = sc.nextInt();
            if (ch == 0) {
                break;
            }
            
        }
    }
}