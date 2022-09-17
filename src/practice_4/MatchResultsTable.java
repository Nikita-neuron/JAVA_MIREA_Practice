package practice_4;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MatchResultsTable extends JFrame {
    JPanel[] pnl = new JPanel[4];
    JPanel[] buttonPanel = new JPanel[2];

    private Label winnerLabel;
    private String winner;

    private JLabel resultLabel;
    private String result;

    private JLabel lastScoreLabel;
    private String lastScore;

    private JButton milanButton;
    private int milanScore = 0;
    private JButton madridButton;
    private int madridScore = 0;

    public MatchResultsTable() {
        setLayout(new GridLayout(4, 1));

        for (int i = 0; i < pnl.length; i++) {
            pnl[i] = new JPanel();
            add(pnl[i]);
        }

        winner = "Winner: DRAW";
        winnerLabel = new Label();
        winnerLabel.setText(winner);
        pnl[0].add(winnerLabel);

        result = "0 X 0";
        resultLabel = new JLabel();
        resultLabel.setText(result);
        pnl[1].add(resultLabel);

        lastScore = "Last Score: N/A";
        lastScoreLabel = new JLabel();
        lastScoreLabel.setText(lastScore);
        pnl[2].add(lastScoreLabel);

        pnl[3].setLayout(new GridLayout(1, 2));

        for (int i = 0; i < buttonPanel.length; i++) {
            buttonPanel[i] = new JPanel();
            pnl[3].add(buttonPanel[i]);
        }

        madridButton = new JButton();
        madridButton.setText("Real Madrid");
        buttonPanel[0].add(madridButton);
        madridButton.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                madridScore++;
                resultLabel.setText(milanScore + " X " + madridScore);

                lastScore = "Last Score: Real Madrid";
                lastScoreLabel.setText(lastScore);

                if (madridScore > milanScore) {
                    winner = "Real Madrid";
                }
                else if (madridScore < milanScore) {
                    winner = "AC Milan";
                }
                else {
                    winner = "DRAW";
                }
                winnerLabel.setText("Winner: " + winner);
            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {

            }

            @Override
            public void mouseExited(MouseEvent e) {

            }
        });

        milanButton = new JButton();
        milanButton.setText("AC Milan");
        buttonPanel[1].add(milanButton);
        milanButton.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                milanScore++;
                resultLabel.setText(milanScore + " X " + madridScore);

                lastScore = "Last Score: AC Milan";
                lastScoreLabel.setText(lastScore);

                if (madridScore > milanScore) {
                    winner = "Real Madrid";
                }
                else if (madridScore < milanScore) {
                    winner = "AC Milan";
                }
                else {
                    winner = "DRAW";
                }
                winnerLabel.setText("Winner: " + winner);
            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {

            }

            @Override
            public void mouseExited(MouseEvent e) {

            }
        });

        setSize(500, 300);

    }

    public static void main(String[] args) {
        new MatchResultsTable().setVisible(true);
    }
}
