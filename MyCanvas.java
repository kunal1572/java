import java.awt.*;
import javax.swing.JFrame;

public class MyCanvas extends Canvas {
    int w, h;
    public void paint(Graphics g) {

        Toolkit t = Toolkit.getDefaultToolkit();
        Image i = t.getImage("E:\\koushik\\pics\\me.png");
        w=getWidth();
        h=getHeight();
        g.drawImage(i, 0, 0,w, h, this);

    }

    public static void main(String[] args) {
        MyCanvas m = new MyCanvas();
        JFrame f = new JFrame();
        f.add(m);
        f.setSize(400,800);
        f.setVisible(true);
    }

}