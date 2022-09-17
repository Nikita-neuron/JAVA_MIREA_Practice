package practice_5;

import java.util.Scanner;

public class Number_14 {
    private static int a;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        a = scanner.nextInt();
        recFunction();
    }

    public static void recFunction() {
        if (a > 0) {
            int b = a % 10;
            a /= 10;
            recFunction();
            System.out.println(b);
        }
    }
}
