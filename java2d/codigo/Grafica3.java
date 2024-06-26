import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;

public class AlfaColor extends JFrame {

  public AlfaColor() {
    super ("Prueba de Ventana");
    this.setSize(250,250);
    this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    this.setVisible(true);
  }

  public static void main (String [] args) {
    AlfaColor v = new AlfaColor();
  }

public void paint (Graphics g) {
  Graphics2D g2 = (Graphics2D)g;
  g2.setColor(Color.red);
  Rectangle2D r1 = new Rectangle2D.Float(250.0f,50.0f,100.0f,100.0f);
  g2.fill(r1);
  AlphaComposite ac = AlphaComposite.getInstance(AlphaComposite.SRC_OVER, 0.5f);
  g2.setColor(Color.green);
  g2.setComposite(ac);
  Rectangle2D r2 = new Rectangle2D.Float(200.0f,100.0f,100.0f,100.0f);
  g2.fill(r2);
  ac = AlphaComposite.getInstance(AlphaComposite.SRC_OVER, 1.0f);
  g2.setColor(Color.magenta);
  g2.setComposite(ac);
  Rectangle2D r3 = new Rectangle2D.Float(150.0f,150.0f,100.0f,100.0f);
  g2.fill(r3);
  ac = AlphaComposite.getInstance(AlphaComposite.SRC_OVER, 0.8f);
  g2.setColor(Color.yellow);
  g2.setComposite(ac);
  Rectangle2D r4 = new Rectangle2D.Float(100.0f,200.0f,100.0f,100.0f);
  g2.fill(r4);
}

}
