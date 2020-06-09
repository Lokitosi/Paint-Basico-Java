
package minipaint.modelo.figuras;

import java.awt.BasicStroke;
import java.awt.Graphics2D;

/**
 *
 * @author Lokitosi10
 */
public class Cuadrilatero extends Figura {
    
    private int ancho, alto;

    public Cuadrilatero(int posx, int posy, int grosor, String color, int ancho, int alto) {
        super(posx, posy, grosor, color);
        this.ancho = ancho;
        this.alto = alto;
    }

    @Override
    public double calcularArea() {
        return ancho*alto;
    }

    @Override
    public double calcularPerimetro() {
        return 2*ancho+2*alto;
    }

    @Override
    public void dibujarFigura(Graphics2D g) {
        g.setStroke(new BasicStroke((float) this.grosor));
        g.drawRect(posx, posy,ancho, alto);    
     
    }
    
}
