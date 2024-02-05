package lab12.ImageAnimation;
import javax.swing.*;

public class ImageAnimationFrame extends JFrame {
    ImageAnimationJpanel panel;
    public static void main(String[] args) {
        new ImageAnimationFrame();
    }
    ImageAnimationFrame() {


        panel = new ImageAnimationJpanel();
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.add(panel);
        this.pack();
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }

}
