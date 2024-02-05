package mvs.myPackage2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ClientView {
    JFrame frame;
    private final JTextField nameTextField;
    private final JTextField egeTextField;
    private final JTextField directionTextField;
    private final JTextField materialTextField;

    public ClientView() {
        frame = new JFrame("Client Information");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 200);
        frame.setLocationRelativeTo(null);

        JPanel panel = new JPanel(new GridLayout(5, 2));

        JLabel nameLabel = new JLabel("Name: ");
        nameTextField = new JTextField(20);
        JLabel egeLabel = new JLabel("Age: ");
        egeTextField = new JTextField(20);
        JLabel directionLabel = new JLabel("Directions in Painting: ");
        directionTextField = new JTextField(20);
        JLabel materialLabel = new JLabel("Favorite Material: ");
        materialTextField = new JTextField(20);

        panel.add(nameLabel);
        panel.add(nameTextField);
        panel.add(egeLabel);
        panel.add(egeTextField);
        panel.add(directionLabel);
        panel.add(directionTextField);
        panel.add(materialLabel);
        panel.add(materialTextField);

        final JButton saveButton = getjButton();
        GridBagConstraints gbc = new GridBagConstraints();
//        gbc.gridwidth = 2; // Установите gridwidth в 2, чтобы кнопка занимала две ячейки по горизонтали
//        gbc.gridx = 0; // Установите начальную позицию кнопки в первой колонке
//        panel.add(saveButton, gbc);
//        gbc.gridx = 1;
//        gbc.gridy = 0;
//        gbc.gridwidth = 2; // Установите gridwidth в 2, чтобы кнопка занимала две ячейки по горизонтали
//        panel.add( saveButton, gbc);




        panel.add(saveButton);

        frame.add(panel);
        frame.setVisible(true);
    }

    private JButton getjButton() {
        JButton saveButton = new JButton("Save");
        saveButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Retrieve data from the view and update the model (Client)
                Сlient client = new Сlient();
                client.setName(nameTextField.getText());
                client.setEge(Integer.parseInt(egeTextField.getText()));
                client.setDirectionsInPainting(directionTextField.getText());
                client.setFavoriteMaterial(materialTextField.getText());
                // You can do something with the client object here
                // For example, send it to a controller for further processing

                // For now, just print the client data
                System.out.println("Client Information: " + client.getName() + ", " + client.getEge() + ", " + client.getDirectionsInPainting() + ", " + client.getFavoriteMaterial());
            }
        });
        return saveButton;
    }
}