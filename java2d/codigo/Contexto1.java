import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;

public class Contexto1 extends JFrame {

  public Contexto1() {
    super ("Prueba de Ventana");
    this.setSize(250,250);
    this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    this.setVisible(true);
  }

  public static void main (String [] args) {
    Contexto1 v = new Contexto1();
  }

  public void paint (Graphics g) {
    Graphics2D g2 = (Graphics2D)g;
    Rectangle2D r2 = new Rectangle2D.Float(75,50,100,25);
    Stroke pincel = new BasicStroke(10.0f);
    g2.setStroke(pincel);
    g2.draw(r2);
  }
}
