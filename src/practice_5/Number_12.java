package practice_5;

import java.util.Scanner;

public class Number_12 {
    public static void main(String[] args) {
        recFunction();
    }

    public static void recFunction() {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        if (a == 0) return;

        if (a % 2 != 0) System.out.println(a);

        recFunction();
    }
}
