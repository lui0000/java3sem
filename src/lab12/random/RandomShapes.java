package lab12.random;

import javax.swing.*;
import java.awt.*;
import java.awt.Rectangle;
import java.awt.Shape;
import java.util.Random;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;


public class RandomShapes extends JPanel {
    private static final int Num_shapes = 400;
    private final java.awt.Shape[] shapes;

    public RandomShapes() {
        shapes = new java.awt.Shape[Num_shapes];
        for (int i = 0; i < Num_shapes; i++) {
            shapes[i] = createNonOverlappingShape();
        }
    }

    private java.awt.Shape createNonOverlappingShape() {
        Random random = new Random();
        java.awt.Shape newShape;
        do {
            int x = random.nextInt(1000);
            int y = random.nextInt(870);
            Color color = new Color(random.nextInt(256), random.nextInt(256), random.nextInt(256));
            int height = random.nextInt(80) + 20; // Height in the range from 20 to 100
            int width = random.nextInt(80) + 20; // Width in the range from 20 to 100
            newShape = (random.nextBoolean()) ? new Circle(x, y, color, height, width) : new Rectangle(x, y, color, height, width);
        } while (checkOverlap(newShape));

        return newShape;
    }

    private boolean checkOverlap(java.awt.Shape currentShape) {
        for (java.awt.Shape shape : shapes) {
            if (shape != null && shape != currentShape) {
                if (currentShape.intersects(shape)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        for (Shape shape : shapes) {
            shape.draw(g);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Random Shapes");
            RandomShapes randomShapes = new RandomShapes();
            frame.add(randomShapes);
            frame.setSize(1000, 1000);
            frame.setLocationRelativeTo(null);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setVisible(true);

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
        });
    }
}