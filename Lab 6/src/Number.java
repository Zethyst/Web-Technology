import java.util.*;

class Number {
    Scanner sc = new Scanner(System.in);
    int n;
    int num[] = new int[100];

    void read() {
        System.out.print("Enter the size of array: ");
        n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.print("Enter the value of number " + (i + 1) + ": ");
            num[i] = sc.nextInt();
        }
    }

    void display() {
        for (int i = 0; i < n; i++) {
            System.out.print(num[i] + "  ");
        }
    }

    public void swap() {
        int max = num[0];
        int min = num[0];
        int max_ind = 0, min_ind = 0;
        for (int i = 0; i < n; i++) {
            if (max < num[i]) {
                max = num[i];
                max_ind = i;
            }
            if (min > num[i]) {
                min = num[i];
                min_ind = i;
            }
        }
        int temp = 0;
        temp = num[max_ind];
        num[max_ind] = num[min_ind];
        num[min_ind] = temp;
    }

    public static void main(String args[]) {
        Number ob = new Number();
        ob.read();
        System.out.println("\nArray Elements => ");
        ob.display();
        ob.swap();
        System.out.println("\nArray Elements (After Swapping)=> ");
        ob.display();

    }
}
