import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;

public class Grafica1 extends JFrame {

  public Grafica1() {
    super ("Prueba de Ventana");
    //Container c = getContentPane();
    //c.setLayout(new FlowLayout());
    this.setSize(250,250);
    this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    this.setVisible(true);
  }

  public static void main (String [] args) {
    Grafica1 v = new Grafica1();
  }

  public void paint (Graphics g) {
    Rectangle2D r2 = new Rectangle2D.Float(75, 50, 100, 25);
    Graphics2D g2 = (Graphics2D)g;
    g2.draw(r2);
  }
}
