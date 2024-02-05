package lab12.ImageAnimation;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class ImageAnimationJpanel extends JPanel implements ActionListener {
    final int PANEL_WIDTH = 500;
    final int PANEL_HEIGHT = 500;
    Image enemy;
    Image backgroundImage;
    Timer timer;
    int xVelocity = 1;
    int yVelocity = 1;
    int x = 0;
    int y = 0;
    ImageAnimationJpanel(){
        this.setPreferredSize(new Dimension(PANEL_WIDTH, PANEL_HEIGHT));
        this.setBackground(Color.black);
        enemy = new ImageIcon("D:\\fur carpet\\java\\projects\\LabExample12\\src\\ImageAnimation\\Kanevsky20_BSD.jpeg").getImage();
        backgroundImage = new ImageIcon("D:\\fur carpet\\java\\projects\\LabExample12\\src\\ImageAnimation\\Directed by ROBERT B_WEIDE .jpeg").getImage();
        timer = new Timer(5, this);
        timer.start();
    }

    public void paint(Graphics g) {
        super.paint(g); // paint background
        Graphics2D g2D = (Graphics2D) g;
        g2D.drawImage(backgroundImage, 0, 0, null);
        g2D.drawImage(enemy, x, y, null);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(x >= PANEL_WIDTH - enemy.getWidth(null) || x<0){
            xVelocity = xVelocity * -1;
        }
        x = x+ xVelocity;
        if(y >= PANEL_HEIGHT - enemy.getHeight(null) || y<0){
            yVelocity = yVelocity * -1;
        }
        y = y+ xVelocity;
        repaint();
    }
}
