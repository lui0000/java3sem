package PowerOfNesting;/*
 * Copyright (c) 2023. @fl_3650
 */

import javax.swing.*;


public class Calc extends JFrame{
    private JButton a7Button;
    private JButton a4Button;
    private JButton a1Button;
    private JButton a0Button;
    private JButton a9Button;
    private JButton a6Button;
    private JButton a3Button;
    private JButton aEqualsButton;
    private JButton aDivideButton;
    private JButton aMultiplyButton;
    private JButton aMinusButton;
    private JButton aPlusButton;
    private JButton aPointButton;
    private JButton a8Button;
    private JButton a5Button;
    private JButton a2Button;
    private JPanel MainPanel;

    // important
    private String operand1 = "";
    private String operand2 = "";
    private char operator = ' ';
    Boolean isOperandSwitched = false;

    Calc() {
        super("Calc");
        setContentPane(MainPanel);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 200);
        setLocationRelativeTo(null);
        setVisible(true);

        System.out.println(isOperandSwitched);

        aDivideButton.addActionListener(e -> {
            operator = '/';
            isOperandSwitched = true; // Set to true only when switching to operand2
        });

        aMultiplyButton.addActionListener(e -> {
            operator = '*';
            isOperandSwitched = true; // Set to true only when switching to operand2
        });

        aMinusButton.addActionListener(e -> {
            operator = '-';
            isOperandSwitched = true; // Set to true only when switching to operand2
        });

        aPlusButton.addActionListener(e -> {
            operator = '+';
            isOperandSwitched = true; // Set to true only when switching to operand2
        });

        if (!isOperandSwitched) { // if we're working w/ 1st operand
            a7Button.addActionListener(e -> {
                operand1 += "7";
            });

            a4Button.addActionListener(e -> {
                operand1 += "4";
            });

            a1Button.addActionListener(e -> {
                operand1 += "1";
            });

            a0Button.addActionListener(e -> {
                operand1 += "0";
            });

            a8Button.addActionListener(e -> {
                operand1 += "8";
            });

            a5Button.addActionListener(e -> {
                operand1 += "5";
            });

            a2Button.addActionListener(e -> {
                operand1 += "2";
            });

            aPointButton.addActionListener(e -> {
                operand1 += ".";
            });

            a9Button.addActionListener(e -> {
                operand1 += "9";
            });

            a6Button.addActionListener(e -> {
                operand1 += "6";
            });

            a3Button.addActionListener(e -> {
                operand1 += "3";
            });
        } else {
            a7Button.addActionListener(e -> {
                operand2 += "7";
            });

            a4Button.addActionListener(e -> {
                operand2 += "4";
            });

            a1Button.addActionListener(e -> {
                operand2 += "1";
            });

            a0Button.addActionListener(e -> {
                operand2 += "0";
            });

            a8Button.addActionListener(e -> {
                operand2 += "8";
            });

            a5Button.addActionListener(e -> {
                operand2 += "5";
            });

            a2Button.addActionListener(e -> {
                operand2 += "2";
            });

            aPointButton.addActionListener(e -> {
                operand2 += ".";
            });

            a9Button.addActionListener(e -> {
                operand2 += "9";
            });

            a6Button.addActionListener(e -> {
                operand2 += "6";
            });

            a3Button.addActionListener(e -> {
                operand2 += "3";
            });
        }

        aEqualsButton.addActionListener(e -> {
            System.out.println("op.1 " + operand1);
            System.out.println("operator: " + operator);
            System.out.println("op.2 " + operand2);
            double numericOperand1 = Double.parseDouble(operand1);
            double numericOperand2 = Double.parseDouble(operand2);
            if (operator == '/') {
                System.out.println(numericOperand1 / numericOperand2);
                operand1 = "";
                operand2 = "";
                operator = ' ';
            } else if (operator == '*') {
                System.out.println(numericOperand1 * numericOperand2);
                operand1 = "";
                operand2 = "";
                operator = ' ';
            } else if (operator == '+') {
                System.out.println(numericOperand1 + numericOperand2);
                operand1 = "";
                operand2 = "";
                operator = ' ';
            } else if (operator == '-') {
                System.out.println(numericOperand1 - numericOperand2);
                operand1 = "";
                operand2 = "";
                operator = ' ';
            } else {
                System.out.println("unknown operand");
                operand1 = "";
                operand2 = "";
                operator = ' ';
            }
        });
    }

    public static void main(String[] args) {
        new Calc();
    }
}

