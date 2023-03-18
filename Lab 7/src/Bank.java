class Account {
    double balance;
    int acc_no;

    Account(double b, int a) {
        balance = b;
        acc_no = a;
    }
    void disp()
    {
        System.out.println("________________________");
        System.out.println(" ACCOUNT DETAILS");
        System.out.println("------------------------");
    }
}

class Person extends Account {
    String name;
    long aadhar_no;

    Person(String n, long aa, int a, double b) {
        super(b, a);
        name = n;
        aadhar_no = aa;
    }

    void disp() {
        super.disp();
        System.out.println("Name : " + name);
        System.out.println("Aadhar No: " + aadhar_no);
        System.out.println("Account No : " + acc_no);
        System.out.println("Balance : " + balance);
        System.out.println("------------------------");
    }
}

class Bank {
    public static void main(String args[]) {
        Person ob1 = new Person("Akshat", 23952534, 14235, 70000);
        Person ob2 = new Person("Harshita", 65963254, 92635, 80000);
        Person ob3 = new Person("Nishant", 78913254, 12685, 40000);
        Person ob4 = new Person("Jatin", 1466854, 52645, 50000);
        Person ob5 = new Person("Saheeb", 45367321, 47334, 60000);
        ob1.disp();
        ob2.disp();
        ob3.disp();
        ob4.disp();
        ob5.disp();
    }
}