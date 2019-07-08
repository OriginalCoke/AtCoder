import java.util.Scanner;

public class BC133_A {
    //T or T
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), a = sc.nextInt(), b = sc.nextInt();
        System.out.println(Math.min(a * n, b));
    }
}