package TimeDataTime;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator extends JFrame{
    private JPanel Calculator;
    private JTextField txtDisplay;
    private JButton a0Button;
    private JButton a2Button;
    private JButton a6Button;
    private JButton divisionButton;
    private JButton multiButton;
    private JButton subButton;
    private JButton a3Button;
    private JButton addButton;
    private JButton a9Button;
    private JButton a8Button;
    private JButton a5Button;
    private JButton a4Button;
    private JButton a7Button;
    private JButton a1Button;
    private JButton dotButton;
    private JButton equalsButton;
    Double operand1, operand2, result;
    String operator;
    public Calculator()
    {
        a7Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtDisplay.setText(txtDisplay.getText() + a7Button.getText());
            }
        });
        a8Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtDisplay.setText(txtDisplay.getText() + a8Button.getText());
            }
        });
        a9Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtDisplay.setText(txtDisplay.getText() + a9Button.getText());
            }
        });
        a4Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtDisplay.setText(txtDisplay.getText() + a4Button.getText());
            }
        });
        a5Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtDisplay.setText(txtDisplay.getText() + a5Button.getText());
            }
        });
        a6Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtDisplay.setText(txtDisplay.getText() + a6Button.getText());
            }
        });
        a1Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtDisplay.setText(txtDisplay.getText() + a1Button.getText());
            }
        });
        a2Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtDisplay.setText(txtDisplay.getText() + a2Button.getText());
            }
        });
        a3Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtDisplay.setText(txtDisplay.getText() + a3Button.getText());
            }
        });
        a0Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtDisplay.setText(txtDisplay.getText() + a0Button.getText());
            }
        });
        divisionButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Check if txtDisplay is empty before setting operator
                if (txtDisplay.getText().isEmpty()) {
                    txtDisplay.setText("Error");
                } else {
                    operand1 = Double.parseDouble(txtDisplay.getText());
                    operator = "/";
                    txtDisplay.setText("");
                }
            }
        });
        multiButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Check if txtDisplay is empty before setting operator
                if (txtDisplay.getText().isEmpty()) {
                    txtDisplay.setText("Error");
                } else {
                    operand1 = Double.parseDouble(txtDisplay.getText());
                    operator = "*";
                    txtDisplay.setText("");
                }
            }
        });
        subButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Check if txtDisplay is empty before setting operator
                if (txtDisplay.getText().isEmpty()) {
                    txtDisplay.setText("Error");
                } else {
                    operand1 = Double.parseDouble(txtDisplay.getText());
                    operator = "-";
                    txtDisplay.setText("");
                }
            }
        });
        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Check if txtDisplay is empty before setting operator
                if (txtDisplay.getText().isEmpty()) {
                    txtDisplay.setText("Error");
                } else {
                    operand1 = Double.parseDouble(txtDisplay.getText());
                    operator = "+";
                    txtDisplay.setText("");
                }
            }
        });
        equalsButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Check if operand1 is not null and txtDisplay is not empty
                if (operand1 != null && !txtDisplay.getText().isEmpty()) {
                    operand2 = Double.parseDouble(txtDisplay.getText());
                    switch (operator) {
                        case "+" -> {
                            result = operand1 + operand2;
                            txtDisplay.setText(String.valueOf(result));
                        }
                        case "-" -> {
                            result = operand1 - operand2;
                            txtDisplay.setText(String.valueOf(result));
                        }
                        case "/" -> {
                            result = operand1 / operand2;
                            txtDisplay.setText(String.valueOf(result));
                        }
                        case "*" -> {
                            result = operand1 * operand2;
                            txtDisplay.setText(String.valueOf(result));
                        }
                    }
                } else if (operand1 != null) {
                    // If operand1 is not null, but txtDisplay is empty, show operand1
                    txtDisplay.setText(String.valueOf(operand1));
                }

            }
        });
        dotButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(!txtDisplay.getText().contains("."))
                {
                    txtDisplay.setText(txtDisplay.getText() + dotButton.getText());
                }
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Calculator");
        frame.setContentPane(new Calculator().Calculator);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}