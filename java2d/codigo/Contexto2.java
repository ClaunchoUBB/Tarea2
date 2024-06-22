import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;

public class Contexto2 extends JFrame {

  public Contexto2() {
    super ("Prueba de Ventana");
    this.setSize(250,250);
    this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    this.setVisible(true);
  }

  public static void main (String [] args) {
    Contexto2 v = new Contexto2();
  }

  public void paint (Graphics g) {
    Graphics2D g2 = (Graphics2D)g;
    Rectangle2D r2 = new Rectangle2D.Float(50,50,100,25);
    float punteo1[] = {10.0f, 4.0f};
    BasicStroke pincel1 = new BasicStroke( 4.0f,BasicStroke.CAP_ROUND, BasicStroke.JOIN_MITER, 3.0f, punteo1, 10.0f);
    g2.setStroke(pincel1);
    g2.draw(r2);
    Rectangle2D r3 = new Rectangle2D.Float(50,100,100,100);
    float punteo2[] = {10.0f, 3.0f, 10.0f, 4.0f, 2.0f, 8.0f};
    BasicStroke pincel2 = new BasicStroke( 4.0f,BasicStroke.CAP_ROUND, BasicStroke.JOIN_MITER, 3.0f, punteo2, 10.0f);
    g2.setStroke(pincel2);
    g2.draw(r3);
  }
}
