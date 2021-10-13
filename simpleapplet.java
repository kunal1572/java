import java.awt.*;
import javax.swing.JFrame;

public class simpleapplet extends Canvas {
    int w, h;
    public void paint(Graphics g) {

        Toolkit t = Toolkit.getDefaultToolkit();
        Image i = t.getImage("E:\\New folder (2)\\Screenshot_20210706-212359_WhatsApp.jpg");
        w=getWidth();
        h=getHeight();
        g.drawImage(i, 0, 0,w, h, this);

    }

    public static void main(String[] args) {
        simpleapplet m = new simpleapplet();
        JFrame f = new JFrame();
        f.add(m);
        f.setSize(400, 600);
        f.setVisible(true);
    }

}