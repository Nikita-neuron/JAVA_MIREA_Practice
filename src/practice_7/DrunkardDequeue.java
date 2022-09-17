package practice_7;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class DrunkardDequeue {
    private static Deque<Integer> player1;
    private static Deque<Integer> player2;

    private static int steps;

    public static void main(String[] args) {
        player1 = new ArrayDeque<>();
        player2 = new ArrayDeque<>();

        Scanner scanner = new Scanner(System.in);

        String[] patrs1 = scanner.nextLine().split(" ");
        String[] patrs2 = scanner.nextLine().split(" ");

        for (String s : patrs1) player1.addLast(Integer.parseInt(s));

        for (String s : patrs2) player2.addLast(Integer.parseInt(s));

        game();

        if (steps > 106) System.out.println("botva");
        else if (player1.size() == 0) System.out.println("first " + steps);
        else if (player2.size() == 0) System.out.println("second " + steps);
    }

    public static void game() {
        int card1 = player1.pop();
        int card2 = player2.pop();

        if (!(card1 == 9 && card2 == 0) && (card1 > card2 || (card1 == 0 && card2 == 9))) {
            player2.add(card1);
            player2.add(card2);
        }
        else {
            player1.add(card1);
            player1.add(card2);
        }
        steps++;
        if (steps <= 106 && player1.size() != 0 && player2.size() != 0) {
            game();
        }
    }
}
