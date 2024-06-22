import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;

public class Grafica2 extends JFrame {

  public Grafica2() {
    super ("Prueba de Ventana");
    //Container c = getContentPane();
    //c.setLayout(new FlowLayout());
    this.setSize(250,250);
    this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    this.setVisible(true);
  }

  public static void main (String [] args) {
    Grafica2 v = new Grafica2();
  }

  public void paint (Graphics g) {

    //Rectangle2D r2 = new Rectangle2D.Float(75, 50, 100, 25);
    Graphics2D g2 = (Graphics2D)g;
    //g2.draw(r2);
/*
    g2.setColor(Color.pink);
    g2.setStroke(new BasicStroke(3.0f));
    Line2D l = new Line2D.Float(50.0f, 50.0f, 200.0f, 200.0f);
*/
g2.setColor(Color.red);
g2.setStroke(new BasicStroke(3.0f));
Arc2D l = new Arc2D.Float(100.0f, 75.0f, 50.0f, 100.0f, 0.0f, 135.0f, Arc2D.PIE);


    g2.draw(l);
  }
}
