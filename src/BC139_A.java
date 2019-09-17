import java.util.Scanner;

public class BC139_A {
    //Tenki
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next(), t = sc.next();
        int res = 0;
        for (int i = 0; i < 3; i++) {
            if (s.charAt(i) == t.charAt(i)) res++;
        }
        System.out.println(res);
        sc.close();
    }
}
