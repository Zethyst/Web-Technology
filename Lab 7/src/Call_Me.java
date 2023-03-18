abstract class A {
    abstract void callMe();
}

class B extends A {
    void callMe() {
        System.out.println("In class \"B\"");
    }
}

class C extends A {
    void callMe() {
        System.out.println("In class \"C\"");
    }
}

class Call_Me {
    public static void main(String ars[]) {
        A obj;
        obj = new B();
        obj.callMe();
        obj = new C();
        obj.callMe();
    }
}