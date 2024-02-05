package mvs.myPackage3;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class my {
    public static void main(String[] args) {
        JFrame frame = new JFrame("GridBagLayout Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 200);

        JPanel panel = new JPanel(new GridBagLayout());

        GridBagConstraints gbc = new GridBagConstraints();

        JLabel label = new JLabel("This is a label");
        gbc.gridx = 0;
        gbc.gridy = 0;
        panel.add(label, gbc);

        JButton button = new JButton("This is a button");
        gbc.gridx = 1;
        gbc.gridy = 0;
        gbc.gridwidth = 2; // Установите gridwidth в 2, чтобы кнопка занимала две ячейки по горизонтали
        panel.add(button, gbc);

        frame.add(panel);
        frame.setVisible(true);
    }
}
