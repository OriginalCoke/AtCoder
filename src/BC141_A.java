import java.util.Scanner;

public class BC141_A {
    //Weather Prediction
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        if (s.equals("Sunny")) System.out.println("Cloudy");
        else if (s.equals("Cloudy")) System.out.println("Rainy");
        else System.out.println("Sunny");
        sc.close();
    }
}
