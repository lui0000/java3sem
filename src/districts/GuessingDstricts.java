//package districts;
//
//import javax.swing.*;
//import java.awt.*;
//import java.awt.event.MouseEvent;
//import java.awt.event.MouseListener;
//
//public class GuessingDstricts extends JFrame implements MouseListener {
//
//    JLabel labelCenter;
//    JLabel labelWest;
//    JLabel labelSouth;
//    JLabel labelNorth;
//    JLabel labelEast;
//
//    public void myFrame() {
//        setTitle("Guessing Game");
//        setSize(534, 603);
//        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        setLayout(null);
//
////        labelCenter = new JLabel();
////        labelCenter.setBounds(500, 400, 400, 200);
////        labelCenter.addMouseListener(this);
////        labelCenter.setBackground(Color.darkGray);
////        labelCenter.setOpaque(true);
////        add(labelCenter);
//
////        labelSouth = new JLabel();
////        labelSouth.setBounds(0, 0, 200, 200);
////        labelSouth.addMouseListener(this);
////        labelSouth.setBackground(Color.pink);
////        labelSouth.setOpaque(true);
////        add(labelSouth);
//
//        labelWest = new JLabel();
//        labelWest.setBounds(0, 100, 100, 100);
//        labelWest.addMouseListener(this);
//        labelWest.setBackground(Color.ORANGE);
//        labelWest.setOpaque(true);
//        add(labelWest);
//
//        labelNorth = new JLabel();
//        labelNorth.setBounds(0, 0, 100, 100);
//        labelNorth.addMouseListener(this);
//        labelNorth.setBackground(Color.MAGENTA);
//        labelNorth.setOpaque(true);
//        add(labelNorth);
//
//        labelEast = new JLabel();
//        labelEast.setBounds(0, 0, 100, 100);
//        labelEast.addMouseListener(this);
//        labelEast.setBackground(Color.BLACK);
//        labelEast.setOpaque(true);
//        add(labelEast);
//
//        setVisible(true);
//    }
//
//    @Override
//    public void mouseClicked(MouseEvent e) {
//
//    }
//
//    @Override
//    public void mousePressed(MouseEvent e) {
//
//    }
//
//    @Override
//    public void mouseReleased(MouseEvent e) {
//
//    }
//
//    @Override
//    public void mouseEntered(MouseEvent e) {
//
//    }
//
//    @Override
//    public void mouseExited(MouseEvent e) {
//
//    }
//
//    public static void main(String[] args) {
//        GuessingDstricts game = new GuessingDstricts();
//        game.myFrame();
//    }
//}