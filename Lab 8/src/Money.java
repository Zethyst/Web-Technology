import java.util.Scanner;

interface Calculate {
    void earnings(int basic);

    void deductions(int basic);

    void bonus(int basic);
}

class Manager implements Calculate {
    public void earnings(int basic) {
        double DA=basic*0.8;
        double HRA=basic*0.15;
        System.out.println("Total Earnings => "+String.format("%.2f",(basic+DA+HRA)));
    }

    public void deductions(int basic) {
        System.out.println("Total Deductions => "+(int)(basic*0.12));

    }
    public void bonus(int basic) {

    }
}

class Substaff extends Manager {
    public void bonus(int basic) {
        System.out.println("Bonus => "+(int)(basic*0.5));
    }
}

class Money {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Basic Pay: ");
        int basic = sc.nextInt();
        Substaff ob = new Substaff();
        ob.earnings(basic);
        ob.deductions(basic);
        ob.bonus(basic);
    }
}