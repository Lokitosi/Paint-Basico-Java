
package minipaint.modelo.figuras;

import java.awt.BasicStroke;
import java.awt.Graphics2D;

public class Linea extends Figura {
    
    private int x2,y2;
    
    public Linea(int x, int y, int grosor, String color,int x2, int y2) {
        super(x, y, grosor, color);
        this.x2 = x2;
        this.y2 = y2;
    }

    @Override
    public double calcularArea() {
        return 0;
    }

    @Override
    public double calcularPerimetro() {
        return 0;
    }

    @Override
    public void dibujarFigura(Graphics2D g) {
        g.setStroke(new BasicStroke((float) this.grosor));
        g.drawLine(posx, posy, x2, y2);
    }
    
}
