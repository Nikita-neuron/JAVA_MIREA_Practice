package practice_5;

import java.util.Scanner;

public class Number_13 {
    public static void main(String[] args) {
        recFunction();
    }

    public static void recFunction() {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        if (a == 0) return;

        System.out.println(a);

        int b = scanner.nextInt();
        if (b == 0) return;

        recFunction();
    }
}
