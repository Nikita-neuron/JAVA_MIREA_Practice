package practice_7;

import java.util.Scanner;
import java.util.Stack;

public class DrunkardStack {
    private static Stack<Integer> player1;
    private static Stack<Integer> player2;

    private static int steps;

    public static void main(String[] args) {
        player1 = new Stack<>();
        player2 = new Stack<>();

        Scanner scanner = new Scanner(System.in);

        String[] patrs1 = scanner.nextLine().split(" ");
        String[] patrs2 = scanner.nextLine().split(" ");

        for (int i = patrs1.length - 1; i >= 0; i--) player1.push(Integer.parseInt(patrs1[i]));

        for (int i = patrs2.length - 1; i >= 0; i--) player2.push(Integer.parseInt(patrs2[i]));

        game();

        if (steps > 106) System.out.println("botva");
        else if (player1.empty()) System.out.println("first " + steps);
        else if (player2.empty()) System.out.println("second " + steps);
    }

    public static void game() {
        int card1 = player1.pop();
        int card2 = player2.pop();

        if (!(card1 == 9 && card2 == 0) && (card1 > card2 || (card1 == 0 && card2 == 9))) {
            player2.insertElementAt(card1, 0);
            player2.insertElementAt(card2, 0);
        }
        else {
            player1.insertElementAt(card1, 0);
            player1.insertElementAt(card2, 0);
        }
        steps++;
        if (steps <= 106 && !player1.empty() && !player2.empty()) {
            game();
        }
    }
}
