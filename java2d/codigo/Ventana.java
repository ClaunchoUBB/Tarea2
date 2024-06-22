import javax.swing.*;

public class Ventana extends JFrame {

  public Ventana() {
    super ("Prueba de Ventana");
    this.setSize(250,250);
    this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    this.setVisible(true);
  }

  public static void main (String [] args) {
    Ventana v = new Ventana();
  }

}
