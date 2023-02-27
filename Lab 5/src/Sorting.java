import java.util.*;

class Sorting {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 5 numbers: ");
        int arr[] = new int[5];
        int temp;
        for (int i = 0; i < 5; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Original: ");
        for (int i = 0; i < 5; i++) {
            System.out.print(arr[i] + "  ");
        }
        for (int i = 0; i < 5; i++) {
            for (int j = i + 1; j < 5; j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.print("\nSorted: ");
        for (int i = 0; i < 5; i++) {
            System.out.print(arr[i] + "  ");
        }

    }
}