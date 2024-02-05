package GuessingGame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class GuessingGame extends JFrame implements ActionListener {
    private final JTextField inputField;
    private final JButton guessButton;
    private int attemptsRemaining;

    public GuessingGame() {
        setTitle("Guessing Game");
        setSize(534, 603);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        inputField = new JTextField();
        inputField.setBounds(150, 100, 200, 30);
        add(inputField);

        guessButton = new JButton("Guess");
        guessButton.setBounds(200, 150, 100, 30);
        guessButton.addActionListener(this);
        add(guessButton);

        attemptsRemaining = 3;
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == guessButton) {
            String inputStr = inputField.getText();
            int guessNumber = Integer.parseInt(inputStr);
            int x = getRandomNumber();
            attemptsRemaining--;

            if (guessNumber == x) {
                JOptionPane.showMessageDialog(this, "You guessed the number!");
            } else if (guessNumber < x)
            {
                String message = "Wrong guess, the hidden number is less! The number was " + x;
                if (attemptsRemaining > 0) {
                    message += "\nAttempts remaining: " + attemptsRemaining;
                } else {
                    message += "\nOut of attempts. Game over!";
                    guessButton.setEnabled(false); // Disable the button after all attempts are used
                }
                JOptionPane.showMessageDialog(this, message);
            }
            else if (guessNumber > x)
            {
                String message = "Wrong guess, the hidden number is greater! The number was " + x;
                if (attemptsRemaining > 0) {
                    message += "\nAttempts remaining: " + attemptsRemaining;
                } else {
                    message += "\nOut of attempts. Game over!";
                    guessButton.setEnabled(false); // Disable the button after all attempts are used
                }
                JOptionPane.showMessageDialog(this, message);
            }
        }
    }

    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                GuessingGame game = new GuessingGame();
                game.setLocationRelativeTo(null);
                game.setVisible(true);
            }
        });
    }

    private int getRandomNumber() {
        Random random = new Random();
        return random.nextInt(20);
    }
}