import java.util.*;

class sum_of_diagonals {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int mat[][] = new int[3][3];
        int sumrd = 0, sumld = 0;
        System.out.println("Enter elements in the matrix: ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                mat[i][j] = sc.nextInt();
            }
        }
        System.out.println("\n-------MATRIX--------\n");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(mat[i][j]+"  ");
            }
            System.out.println();
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (i == j) {
                    sumld += mat[i][j];
                }
                if ((i + j) == (3 - 1)) {
                    sumrd += mat[i][j];
                }
            }
        }
        System.out.println("\nSum of Left Diagonal: "+sumld);
        System.out.println("\nSum of Right Diagonal: "+sumrd);
    }
}