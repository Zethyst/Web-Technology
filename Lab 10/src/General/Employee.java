package General;

import java.util.*;

public class Employee {

    private String ename;
    protected int empid;
    protected double total;

    public void earnings() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Employee Name: ");
        sc.skip("\\R?");
        ename = sc.nextLine();
        System.out.print("Enter Employee ID: ");
        empid = sc.nextInt();
        System.out.print("Enter basic amount: ");
        int basic = sc.nextInt();
        double DA = basic * 0.8;
        double HRA = basic * 0.15;
        total = basic + DA + HRA;
        System.out.println("Total Earnings: " + String.format("%.2f", total));
    }
}
