import java.util.Scanner;

public class BC148_C {
    //Snack
    //求最小公倍数, 我也不知道怎么写, 试试辗转相除法求最小公约数?
    //又是 atcoder 最喜欢玩的整型溢出? 不知道怎么优雅的处理较大数
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        System.out.println(helper(a, b));
        sc.close();
    }

    static long helper(long a, long b) {
        long v = a, u = b, y;
        while (b > 0) {
            y = a % b;
            a = b;
            b = y;
        }
        return v * u / a;
    }
}
