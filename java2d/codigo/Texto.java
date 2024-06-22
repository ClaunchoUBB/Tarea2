import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;

public class Texto extends JFrame {

  public Texto() {
    super ("Prueba de Ventana");
    this.setSize(250, 250);
    this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    this.setVisible(true);
  }

  public static void main (String [] args) {
    Texto v = new Texto();
  }

public void paint (Graphics g) {
  super.paint(g);
  Graphics2D g2 = (Graphics2D)g;
  g2.setColor(Color.blue);
  g2.setFont(new Font("Arial", Font.ITALIC, 24));
  g2.drawString("Hola Mundo", 20, 60);
}

}
