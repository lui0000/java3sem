//package PathToImage;
//
//import javax.swing.*;
//import java.awt.*;
//import java.util.Scanner;
//
//public class PathToImage extends JPanel {
//    JFrame frame;
//    Container container;
//    JPanel picturePanel;
//    JLabel pictureLabel;
//    ImageIcon image;
//
//    public static void main(String[] args) {
//        new PathToImage();
//    }
//
//    public PathToImage() {
//        frame = new JFrame("Path to image");
//        frame.setSize(534, 603);
//        frame.setLocationRelativeTo(null);
//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
////        frame.getContentPane().setBackground(Color.magenta);
//        frame.setLayout(null);
//
//        container = frame.getContentPane();
//
//        picturePanel = new JPanel();
//        picturePanel.setBounds(0, 0, 534, 603);
////        picturePanel.setBackground(Color.PINK);
//        container.add(picturePanel);
////
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter the path to the image:");
//        String pathToImage = scanner.nextLine();
//
//        pictureLabel = new JLabel();
////D:\fur carpet\java\projects\LabExample12\src\PathToImage\picture.jpg
//        image = new ImageIcon(pathToImage);
//
//        pictureLabel.setIcon(image);
//        picturePanel.add(pictureLabel);
//
//        frame.setVisible(true);
//    }
//}
package lab12.PathToImage;

import javax.swing.*;
import java.awt.*;

public class PathToImage extends JPanel {
    JFrame frame;
    Container container;
    JPanel picturePanel;
    JLabel pictureLabel;
    ImageIcon image;
    public static void main(String[] args) {
        if (args.length > 0) {
            System.out.println(args[0]);
            new PathToImage(args[0]);
        } else {
            System.out.println("Please provide the path to the image as a command line argument.");
        }
    }

    public PathToImage(String pathToImage) {
        frame = new JFrame("Path to image");
        frame.setSize(534, 603);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        container = frame.getContentPane();

        picturePanel = new JPanel();
        picturePanel.setBounds(0, 0, 534, 603);
//        picturePanel.setBackground(Color.PINK);
        container.add(picturePanel);

        pictureLabel = new JLabel();

        image = new ImageIcon(pathToImage);

        pictureLabel.setIcon(image);
        picturePanel.add(pictureLabel);

        frame.setVisible(true);

    }
}
