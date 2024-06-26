import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;

public class Relleno1 extends JFrame {

  public Relleno1() {
    super ("Prueba de Ventana");
    this.setSize(250,250);
    this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    this.setVisible(true);
  }

  public static void main (String [] args) {
    Relleno1 v = new Relleno1();
  }

  public void paint (Graphics g) {
    super.paint(g);
    Graphics2D g2 = (Graphics2D)g;
    GradientPaint gp1 =
         new GradientPaint(50.0f,25.0f,Color.blue, 50.0f, 225.0f, Color.black);
    g2.setPaint(gp1);
    Rectangle2D r1 = new Rectangle2D.Float(25, 25, 200, 200);
    g2.fill(r1);
    GradientPaint gp2 =
         new GradientPaint(250.0f,25.0f,Color.blue, 450.0f, 225.0f, Color.black);
    g2.setPaint(gp2);
    Rectangle2D r2 = new Rectangle2D.Float(250, 25, 200, 200);
    g2.fill(r2);  
  }

}
