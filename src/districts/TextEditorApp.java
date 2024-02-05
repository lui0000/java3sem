package districts;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TextEditorApp {
    private final JTextArea textArea;

    public TextEditorApp() {
        JFrame frame = new JFrame("Text Editor");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);

        textArea = new JTextArea();
        frame.add(textArea);

        JMenuBar menuBar = new JMenuBar();

        JMenu colorMenu = new JMenu("Цвет");
        JMenuItem pinkItem = new JMenuItem("Розовый");
        JMenuItem redItem = new JMenuItem("Красный");
        JMenuItem blackItem = new JMenuItem("Черный");

        pinkItem.addActionListener(new ColorActionListener(Color.PINK));
        redItem.addActionListener(new ColorActionListener(Color.RED));
        blackItem.addActionListener(new ColorActionListener(Color.BLACK));

        colorMenu.add(pinkItem);
        colorMenu.add(redItem);
        colorMenu.add(blackItem);

        JMenu fontMenu = new JMenu("Шрифт");
        JMenuItem timesNewRomanItem = new JMenuItem("Times New Roman");
        JMenuItem msSansSerifItem = new JMenuItem("MS Sans Serif");
        JMenuItem courierNewItem = new JMenuItem("Courier New");

        timesNewRomanItem.addActionListener(new FontActionListener("Times New Roman"));
        msSansSerifItem.addActionListener(new FontActionListener("MS Sans Serif"));
        courierNewItem.addActionListener(new FontActionListener("Courier New"));

        fontMenu.add(timesNewRomanItem);
        fontMenu.add(msSansSerifItem);
        fontMenu.add(courierNewItem);

        menuBar.add(colorMenu);
        menuBar.add(fontMenu);

        frame.setJMenuBar(menuBar);
        frame.setVisible(true);
    }

    private class ColorActionListener implements ActionListener {
        private final Color color;

        public ColorActionListener(Color color) {
            this.color = color;
        }

        @Override
        public void actionPerformed(ActionEvent e) {

            textArea.setForeground(color);
        }
    }

    private class FontActionListener implements ActionListener {
        private final String fontName;

        public FontActionListener(String fontName) {

            this.fontName = fontName;
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            Font font = new Font(fontName, Font.BOLD, 14);
            textArea.setFont(font);
        }
    }

    public static void main(String[] args) {

        SwingUtilities.invokeLater(TextEditorApp::new);
    }
}
