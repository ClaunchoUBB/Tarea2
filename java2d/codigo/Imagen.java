import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;

public class Imagen extends JFrame {

  public Imagen() {
    super ("Prueba de Ventana");
    this.setSize(250, 250);
    this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    this.setVisible(true);
  }

  public static void main (String [] args) {
    Imagen v = new Imagen();
  }

  public void paint(Graphics g) {
    Graphics2D g2 = (Graphics2D)g;
    Image im = Toolkit.getDefaultToolkit().getImage("tren.jpg");
    g2.drawImage(im, 0, 20, this);
  }

}
