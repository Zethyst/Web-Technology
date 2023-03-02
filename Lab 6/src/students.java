import java.util.Scanner;

class details {
    String name;
    long roll;
    double cgpa;

    String get_name() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Name: ");
        name = sc.nextLine();
        return name;
    }

    long get_roll() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Roll No: ");
        roll = sc.nextLong();
        return roll;
    }

    double get_cgpa() {
        Scanner sc = new Scanner(System.in);
        System.out.print("CGPA: ");
        cgpa = sc.nextDouble();
        return cgpa;
    }
}

class students {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        details ob = new details();
        System.out.print("Enter the number of students: ");
        int n = sc.nextInt();
        String name[] = new String[n];
        long roll[] = new long[n];
        double cgpa[] = new double[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter the student " + (i + 1) + " details => ");
            name[i] = ob.get_name();
            roll[i] = ob.get_roll();
            cgpa[i] = ob.get_cgpa();
        }
        System.out.println("\nStudent Details => \n");
        System.out.println("Name\t\tRoll No\t\tCGPA");
        double min = cgpa[0];
        String str = "";
        for (int i = 0; i < n; i++) {
            System.out.print(name[i] + "\t" + roll[i] + "\t" + cgpa[i]);
            System.out.println();
            if (min > cgpa[i]) {
                min = cgpa[i];
                str = name[i];
            }
        }
        System.out.println("\n\n(Student with the lowest CGPA is " + str + " with CGPA " + min + ")");

    }
}
