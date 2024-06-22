import javax.swing.JFrame;
import java.awt.*;

public class Ventana2 extends JFrame { 
   //---------------------------------------------
   public Ventana2() {
     // resolucion de 800x600 a 16 bits, 60 hertz
     DisplayMode displayMode = new DisplayMode(800, 600, 16, 60);

     // obtener el tipo de dispositivo grafico (GraphicsDevice)
     GraphicsEnvironment environment = GraphicsEnvironment.getLocalGraphicsEnvironment();
     GraphicsDevice device = environment.getDefaultScreenDevice();

     // usar el JFrame como una ventana a pantalla
     device.setFullScreenWindow(this);

     // cambiar el modo de despliegue
     device.setDisplayMode(displayMode);
           
   }
   
   //---------------------------------------------
   public static void main(String[] arg) {
      new Ventana2();
      System.out.println("He creado la ventana");
   }
}
