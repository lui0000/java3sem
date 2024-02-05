import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Stack;

public class RPNcalculator extends JDialog {
    private JPanel RPNCalculator;
    private JTextField textField1;
    private JButton a0Button;
    private JButton a1Button;
    private JButton a2Button;
    private JButton a3Button;
    private JButton a4Button;
    private JButton a5Button;
    private JButton a6Button;
    private JButton a7Button;
    private JButton a8Button;
    private JButton a9Button;
    private JButton dotButton;
    private JButton dditionButton;
    private JButton subtractionButton;
    private JButton multiplicationButton;
    private JButton divisionButton;
    private JButton equalButton;

    private final Stack<String> stack = new Stack<>();

    public RPNcalculator() {
        a0Button.addActionListener(e -> stack.push(a0Button.getText()));
        a1Button.addActionListener(e -> stack.push(a1Button.getText()));
        a2Button.addActionListener(e -> stack.push(a2Button.getText()));
        a3Button.addActionListener(e -> stack.push(a3Button.getText()));
        a4Button.addActionListener(e -> stack.push(a4Button.getText()));
        a5Button.addActionListener(e -> stack.push(a5Button.getText()));
        a6Button.addActionListener(e -> stack.push(a6Button.getText()));
        a7Button.addActionListener(e -> stack.push(a7Button.getText()));
        a8Button.addActionListener(e -> stack.push(a8Button.getText()));
        a9Button.addActionListener(e -> stack.push(a9Button.getText()));
        dotButton.addActionListener(e -> stack.push(dotButton.getText()));

        dditionButton.addActionListener(e -> {
            if (stack.size() >= 2) {
                String operand2 = stack.pop();
                String operand1 = stack.pop();
                Double result = Double.parseDouble(operand1) + Double.parseDouble(operand2);
                stack.push(String.valueOf(result));
                textField1.setText(String.valueOf(result));
            } else {
                textField1.setText("Error: Insufficient operands");
            }
        });

        subtractionButton.addActionListener(e -> {
            if (stack.size() >= 2) {
                String operand2 = stack.pop();
                String operand1 = stack.pop();
                Double result = Double.parseDouble(operand1) - Double.parseDouble(operand2);
                stack.push(String.valueOf(result));
                textField1.setText(String.valueOf(result));
            } else {
                textField1.setText("Error: Insufficient operands");
            }
        });

        multiplicationButton.addActionListener(e -> {
            if (stack.size() >= 2) {
                String operand2 = stack.pop();
                String operand1 = stack.pop();
                Double result = Double.parseDouble(operand1) * Double.parseDouble(operand2);
                stack.push(String.valueOf(result));
                textField1.setText(String.valueOf(result));
            } else {
                textField1.setText("Error: Insufficient operands");
            }
        });

        divisionButton.addActionListener(e -> {
            if (stack.size() >= 2) {
                String operand2 = stack.pop();
                String operand1 = stack.pop();
                if (Double.parseDouble(operand2) == 0) {
                    textField1.setText("Error: Division by zero");
                } else {
                    Double result = Double.parseDouble(operand1) / Double.parseDouble(operand2);
                    stack.push(String.valueOf(result));
                    textField1.setText(String.valueOf(result));
                }
            } else {
                textField1.setText("Error: Insufficient operands");
            }
        });

        equalButton.addActionListener(e -> {
            if (stack.size() == 1) {
                textField1.setText(stack.peek());
            } else {
                textField1.setText("Error: Invalid expression");
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("RPN Calculator");
        frame.setContentPane(new RPNcalculator().RPNCalculator);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
