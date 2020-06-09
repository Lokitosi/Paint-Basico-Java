package minipaint.modelo.figuras;

import java.awt.BasicStroke;
import java.awt.Graphics2D;

/**
 *
 * @author Lokitosi10
 */
public class Triangulo extends Figura {

    private int[] x = {0, 0, 0};
    private int[] y = {0, 0, 0};

    public Triangulo(int x1, int y1, int gros, String color, int xf, int yf) {
        super(x1, y1, gros, color);

        x[0] = x1;
        x[1] = x1 + (xf / 2);
        x[2] = x1 + xf;

        y[0] = y1;
        y[1] = (y1 + yf);
        y[2] = y1;

    }

    @Override
    public double calcularArea() {
        return 0;
    }

    @Override
    public double calcularPerimetro() {
        System.out.println(":)");
        return 0.0;
    }

    @Override
    public void dibujarFigura(Graphics2D g) {
        g.setStroke(new BasicStroke((float) this.grosor));
        g.drawPolygon(x, y, 3);

    }

}
