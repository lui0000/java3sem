package MenuExampleTimeData;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MenuExample {
    public static void main(String[] args) {
        // Create a JFrame (window) for the application
        JFrame frame = getFrame();

        // Create a menu bar
        JMenuBar menuBar = new JMenuBar();

        // Create three menus: File, Edit, and Help
        JMenu file = new JMenu("File");
        JMenu edit = new JMenu("Edit");
        JMenu help = new JMenu("Help");

        // Create menu items for the File menu
        JMenuItem open = file.add(new JMenuItem("Open", 'O'));
        // Add an action listener to the "Open" menu item
        open.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Close the application when "Open" is clicked
                System.exit(0);
            }
        });
        // Set a keyboard shortcut (accelerator) for the "Open" menu item
        open.setAccelerator(KeyStroke.getKeyStroke("ctrl O"));
        // Add "Save" and a separator to the File menu
        file.add(new JMenuItem("Save", 'S'));
        file.addSeparator();
        // Create an "Exit" menu item and disable it
        JMenuItem exit = file.add(new JMenuItem("Exit", 'E'));
        exit.setEnabled(false);

        // Create a menu item "Australia" for the Edit menu and add an action to show a message dialog
        JMenuItem save = new JMenuItem("Australia");
        save.addActionListener(e -> JOptionPane.showMessageDialog(frame, "RPO Australia, also known as Recruitment Process Outsourcing Australia," +
                " refers to the practice of outsourcing various aspects of an organization's recruitment" +
                " and talent acquisition processes to a specialized service provider in Australia. This outsourcing model" +
                " is designed to streamline and improve the efficiency of the recruitment process while allowing companies" +
                " to focus on their core business functions.", "Alert", JOptionPane.INFORMATION_MESSAGE));
        edit.add(save);

        // Create a sub-menu "China" for the Edit menu
        JMenu opt = new JMenu("China");
        edit.add(opt);
        // Add items to the "China" sub-menu
        opt.add("England");
        opt.add("Exit");

        // Create a menu item "Russia" for the Edit menu and add an action to show a message dialog
        JMenuItem FF = new JMenuItem("Russia");
        FF.addActionListener(e -> JOptionPane.showMessageDialog(frame, "Russia, officially known as the " +
                "Russian Federation, is the largest country in the world by land area, spanning two continents, Europe and Asia. " +
                "Here is some brief information about Russia:", "Alert", JOptionPane.WARNING_MESSAGE));
        edit.add(FF);

        // Add menu items to the Help menu
        help.add(new JMenuItem("Open"));
        help.add(new JMenuItem("Save"));
        help.add(new JMenuItem("Exit"));

        // Add the File, Edit, and Help menus to the menu bar
        menuBar.add(file);
        menuBar.add(edit);
        menuBar.add(help);

        // Set the menu bar for the JFrame
        frame.setJMenuBar(menuBar);
        frame.revalidate();
    }

    // Helper method to create and configure the JFrame
    static JFrame getFrame() {
        JFrame frame = new JFrame("menu");
        frame.setVisible(true);
        frame.setBounds(750, 250, 500, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        return frame;
    }
}
