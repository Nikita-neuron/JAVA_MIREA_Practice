package practice_5;

import java.util.Scanner;

public class Number_16 {
    public static void main(String[] args) {
        int[] result = recFunction();
        System.out.println(result.length);
    }

    public static int[] recFunction() {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        if (a == 0) return new int[] {a};

        int[] funArray = recFunction();
        int[] newArray;

        if (a > funArray[0]) newArray = new int[] {a};
        else if (a == funArray[0]) {
            newArray = new int[funArray.length + 1];
            System.arraycopy(funArray, 0, newArray, 0, funArray.length);
            newArray[funArray.length] = a;
        }
        else newArray = funArray.clone();

        return newArray;
    }
}
