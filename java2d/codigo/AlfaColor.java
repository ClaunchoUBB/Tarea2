import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;

public class AlfaColor extends JFrame {

  public AlfaColor() {
    super ("Prueba de Ventana");
    this.setSize(250, 250);
    this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    this.setVisible(true);
  }

  public static void main (String [] args) {
    AlfaColor v = new AlfaColor();
  }

public void paint (Graphics g) {
  Graphics2D g2 = (Graphics2D)g;
  g2.setColor(Color.white);
  Rectangle2D r0 = new Rectangle2D.Float(0,0,250,250);
  g2.fill(r0);
  /*g2.setColor(Color.red);
  Rectangle2D r1 = new Rectangle2D.Float(160,40,60,60);
  g2.fill(r1);*/
  AlphaComposite ac = AlphaComposite.getInstance(AlphaComposite.SRC_OVER, 0.5f);
  /*g2.setColor(Color.green);
  g2.setComposite(ac);
  Rectangle2D r2 = new Rectangle2D.Float(120,80,60,60);
  g2.fill(r2);*/
  //ac = AlphaComposite.getInstance(AlphaComposite.SRC_OVER, 1.0f);
  g2.setColor(Color.magenta);
  g2.setComposite(ac);
  Rectangle2D r3 = new Rectangle2D.Float(80,120,60,60);
  g2.fill(r3);
  ac = AlphaComposite.getInstance(AlphaComposite.SRC_OVER, 0.8f);
  g2.setColor(Color.yellow);
  g2.setComposite(ac);
  Rectangle2D r4 = new Rectangle2D.Float(40,160,60,60);
  g2.fill(r4);
}

}
