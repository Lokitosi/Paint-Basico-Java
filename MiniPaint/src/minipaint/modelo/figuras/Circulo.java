
package minipaint.modelo.figuras;

import java.awt.BasicStroke;
import java.awt.Graphics2D;

/**
 *
 * @author Lokitosi10
 */
public class Circulo extends Figura{
    
    private int radio;

    public Circulo(int posx, int posy, int grosor, String color, int radio) {
        super(posx, posy, grosor, color);
        this.radio = radio;
    }  
    
    public Circulo(int ancho){
        super(((int)(Math.random()*ancho)),((int)(Math.random()*ancho)),((int)(Math.random()*10)),"black");
        this.radio = ((int)(Math.random()*ancho));
    }
    
    

    @Override
    public double calcularArea() {
        return Math.PI*Math.pow(radio+0.0, 2.0);
    }

    @Override
    public double calcularPerimetro() {
        return 2*Math.PI*radio;
    }

    @Override
    public void dibujarFigura(Graphics2D g) {
        g.setStroke(new BasicStroke((float) this.grosor));
        g.drawOval(posx-radio, posy-radio, 2*radio, 2*radio);
    }
    
}
