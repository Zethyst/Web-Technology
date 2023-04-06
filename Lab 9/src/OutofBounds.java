import java.util.*;

public class OutofBounds {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n=sc.nextInt();
        int arr[]=new int[n];
        try
        {
            System.out.println("Enter the elements in the array: ");
            for (int i = 0; i <= n; i++) {
                arr[i]=sc.nextInt();
            }
        }
        catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Error Occured => "+e);
            System.out.print("Elements in the array => ");
            for (int i = 0; i <n; i++) {
                System.out.print(arr[i] +" ");
            }
        }
    }
}
