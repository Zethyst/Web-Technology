import java.util.*;

class Marks_Chemistry {
    public static void main(String args[]) {
        int chem;
        Scanner Sc = new Scanner(System.in);
        System.out.print("Enter your marks in Chemistry: ");
        chem = Sc.nextInt();
        if (chem >= 90 && chem <= 100) {
            System.out.println("\nA - Excellent");
        } else if (chem >= 80 && chem < 90) {
            System.out.println("\nB - Very Good");
        } else if (chem >= 70 && chem < 80) {
            System.out.println("\nC - Good");
        } else if (chem >= 60 && chem < 70) {
            System.out.println("\nD - Satisfactory");
        } else if (chem >= 50 && chem < 60) {
            System.out.println("\nE - Work Hard");
        } else if (chem >= 40 && chem < 50) {
            System.out.println("\nF - Just Passed");
        } else {
            System.out.println("\nFailed");
        }
    }
}