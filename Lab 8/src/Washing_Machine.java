interface Motor {
    int capacity = 10;

    public void run();

    public void consume();
}

public class Washing_Machine implements Motor {
    public void run() {
        System.out.println("Running!");
    }

    public void consume() {
        System.out.println("Comsuming!");
    }

    public static void main(String[] args) {
        Motor ob = new Washing_Machine();
        ob.run();
        ob.consume();
        System.out.println(ob.capacity);
    }
}
