import java.util.Scanner;

public class BC148_B {
    //Strings with the Same Length
    //这样的题能 AC 了意义大吗?
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();
        String t = sc.next();
        System.out.println(helper(s, t, n));
        sc.close();
    }

    static String helper(String s, String t, int n) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            sb.append(s.charAt(i));
            sb.append(t.charAt(i));
        }
        return sb.toString();
    }
}
