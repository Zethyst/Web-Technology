package Marketing;

import General.*;

public class Sales extends Employee {
    public void tallowance() {
        double toll = total + (total * 0.5);
        System.out.println("\n[ Adding Travelling Allowance ]\n");
        System.out.println("Total Earnings: " + String.format("%.2f", toll));
    }

    public static void main(String[] args) {
        Sales ob = new Sales();
        ob.earnings();
        ob.tallowance();
    }
}
