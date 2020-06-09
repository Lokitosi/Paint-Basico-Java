
package minipaint.modelo.figuras;

import java.awt.Graphics2D;


/**
 *
 * @author Lokitosi10
 */
public abstract class Figura {
    
    protected int posx,posy,grosor;
    protected String color;

    public Figura(int posx, int posy, int grosor, String color) {
        this.posx = posx;
        this.posy = posy;
        this.grosor = grosor;
        this.color = color;
    }
    
    public abstract double calcularArea();
    
    public abstract double calcularPerimetro();
    
    public abstract void dibujarFigura(Graphics2D g);

    @Override
    public String toString() {
        return this.getClass().getSimpleName()+this.hashCode(); 
    }
    
    
}
