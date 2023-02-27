import java.util.*;

class frequency {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size = sc.nextInt();
        System.out.println("Enter Elements in the ");
        int arr[] = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("\nElement\t:  Number of Occurences\t");
        for (int i = 0; i < arr.length; i++) {
            int count = 1;
            if (arr[i] != 0) {
                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[i] == arr[j]) {
                        count++;
                        arr[j] = 0;
                    }
                }
                System.out.println(arr[i] + "\t:\t" + count);
            }
        }
    }
}