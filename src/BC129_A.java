import java.util.Arrays;
import java.util.Scanner;

public class BC129_A {
    //Airplane
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] A = new int[3];
        for (int i = 0; i < 3; i++) A[i] = sc.nextInt();
        Arrays.sort(A);
        sc.close();
        System.out.println(A[0] + A[1]);
    }
}
