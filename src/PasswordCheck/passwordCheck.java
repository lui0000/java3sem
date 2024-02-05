package PasswordCheck;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class passwordCheck implements ActionListener {
    static JFrame frame;
    JLabel password;
    JLabel userName;
    JLabel Service;
    JPanel panel;
    JTextField userNameText;
    JTextField passwordText;
    JTextField ServiceText;
    JButton button;
    JLabel success;

    public passwordCheck() {
        frame = new JFrame();
        panel = new JPanel();
        frame.add(panel);

        frame.setSize(350, 200);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        panel.setLayout(null);

        userName = new JLabel("User");
        userName.setBounds(10, 20, 80, 25);
        panel.add(userName);

        userNameText = new JTextField();
        userNameText.setBounds(100, 20, 165, 25);
        panel.add(userNameText);

        password = new JLabel("Password");
        password.setBounds(10, 50, 80, 25);
        panel.add(password);

        passwordText = new JTextField();
        passwordText.setBounds(100, 50, 165, 25);
        panel.add(passwordText);

        Service = new JLabel("Service");
        Service.setBounds(10, 80, 80, 25);
        panel.add(Service);

        ServiceText = new JTextField();
        ServiceText.setBounds(100, 80, 165, 25);
        panel.add(ServiceText);

        button = new JButton("press me");
        button.setBounds(10, 120, 180, 25);
        button.addActionListener(this);
        panel.add(button);

        success = new JLabel("");
        success.setBounds(10, 150, 300, 25);
        panel.add(success);
    }

    public static void main(String[] args) {
        new passwordCheck();
        // Создаем Action для закрытия окна
        Action closeAction = new AbstractAction("Close") {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.dispose(); // Закрываем окно
            }
        };

        // Создаем KeyStroke для Ctrl+O
        KeyStroke ctrlOKeyStroke = KeyStroke.getKeyStroke(KeyEvent.VK_O, KeyEvent.CTRL_DOWN_MASK);

        // Получаем InputMap и ActionMap для окна
        JRootPane rootPane = frame.getRootPane();
        InputMap inputMap = rootPane.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
        ActionMap actionMap = rootPane.getActionMap();

        // Связываем KeyStroke с Action
        inputMap.put(ctrlOKeyStroke, "closeAction");
        actionMap.put("closeAction", closeAction);
    }
//F032_Password7
    @Override
    public void actionPerformed(ActionEvent e) {
        String password = passwordText.getText();
        Pattern patternPassword = Pattern.compile("^(?=.*[A-Z])(?=.*[a-z])(?=.*\\d)(?=.*[_!\\?])[A-Za-z\\d_!\\?]{8,}$");
        Matcher matcherPassword = patternPassword.matcher(password);
        if (matcherPassword.matches()) {
            success.setText("Пароль соответствует требованиям.");
        } else {
            success.setText("Пароль не соответствует требованиям.");
        }
    }
}
