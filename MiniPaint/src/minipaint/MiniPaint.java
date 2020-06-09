
package minipaint;

import java.awt.Graphics2D;
import minipaint.controladores.ControladorAcciones;
import minipaint.controladores.ControladorLienzo;
import minipaint.grafico.Ventana;
import minipaint.modelo.figuras.*;
import minipaint.modelo.herramientas.PortaPapeles;

/**
 *
 * @author Lokitosi10
 */
public class MiniPaint {

    
    public static PortaPapeles p = new PortaPapeles();
    
    public static ControladorAcciones ca = new ControladorAcciones();
    
    public static ControladorLienzo cl = new ControladorLienzo();
    
    public static Ventana v;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        p.agregarFigura(new Cuadrilatero(20, 25, 1, "rojo", 150, 30));
        p.agregarFigura(new Cuadrilatero(20, 55, 1, "rojo", 30, 30));*/
        
        v = new Ventana("Prueba Dibujo");
        ca.agregarEscucha();
        
    }
    
    public static void dibujarC(Graphics2D g){
        p.dibujarFiguras(g);
    }
    
}
