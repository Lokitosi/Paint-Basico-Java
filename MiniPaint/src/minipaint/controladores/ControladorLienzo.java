package minipaint.controladores;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.geom.Point2D;
import minipaint.MiniPaint;
import minipaint.modelo.figuras.Circulo;
import minipaint.modelo.figuras.Cuadrilatero;
import minipaint.modelo.figuras.Linea;
import minipaint.modelo.figuras.Triangulo;

/**
 *
 * @author Lokitosi10
 */
public class ControladorLienzo implements MouseMotionListener, MouseListener {

    private int[] xs = {0, 0, 0};
    private int[] ys = {0, 0, 0};
    private int punto = 0;
    private int distx;
    private int disty;

    @Override
    //vista previa de las figuras 
    public void mouseDragged(MouseEvent e) {
        int dist = (int) Point2D.distance(xs[0], ys[0], e.getX(), e.getY());
        
        if (e.getY()<ys[0]){
            disty = -1*((int) Point2D.distance(0, ys[0], 0, e.getY()));
        }else{
            disty = (int) Point2D.distance(0, ys[0], 0, e.getY());
        }
        if (e.getX()<xs[0]){
            distx = -1*((int) Point2D.distance(xs[0], 0, e.getX(),0));
        }else{
            distx = (int) Point2D.distance(xs[0],0, e.getX(),0);
        }

        switch (minipaint.MiniPaint.ca.getBotonClickeado()) {
            case 1:

                MiniPaint.v.getLienzo().getGraphics().drawOval(xs[0] - dist, ys[0] - dist, dist * 2, dist * 2);
                MiniPaint.v.getLienzo().repaint();
                break;
            case 2:
                
                MiniPaint.v.getLienzo().getGraphics().drawRect(xs[0], ys[0], distx, disty);
                MiniPaint.v.getLienzo().repaint();
                
                break;
            case 3:
                xs[1] = xs[0]+(distx/2);
                xs[2] = xs[0]+distx;
                
                ys[1] = ys[0]+disty;
                ys[2] = ys[0];
               
                MiniPaint.v.getLienzo().getGraphics().drawPolygon(xs, ys, 3);
                MiniPaint.v.getLienzo().repaint();
                break;
            case 4:
                MiniPaint.v.getLienzo().getGraphics().drawLine(xs[0], ys[0], e.getX(), e.getY());
                MiniPaint.v.getLienzo().repaint();
                break;
            default:
                break;
        }
    }

    @Override
    public void mouseMoved(MouseEvent e) {

    }

    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    // Puntos iniciales para las figuras 
    public void mousePressed(MouseEvent e) {
        switch (MiniPaint.ca.getBotonClickeado()) {
            case 1:
                if (punto == 0) {
                    xs[punto] = e.getX();
                    ys[punto++] = e.getY();
                }
                break;
            case 2:
                if (punto == 0) {
                    xs[punto] = e.getX();
                    ys[punto++] = e.getY();
                }
                break;
            case 3:
                if (punto == 0) {
                    xs[0] = e.getX();
                    ys[0] = e.getY();
                }
                break;
            case 4:
                if (punto == 0) {
                    xs[0] = e.getX();
                    ys[0] = e.getY();
                }
                break;
            default:
                break;
        }
    }

    @Override
    //Pintar figuras al soltar el mouse 
    public void mouseReleased(MouseEvent e) {

        if (e.getY()<ys[0]){
            disty = -1*((int) Point2D.distance(0, ys[0], 0, e.getY()));
        }else{
            disty = (int) Point2D.distance(0, ys[0], 0, e.getY());
        }
        if (e.getX()<xs[0]){
            distx = -1*((int) Point2D.distance(xs[0], 0, e.getX(),0));
        }else{
            distx = (int) Point2D.distance(xs[0],0, e.getX(),0);
        }
        
        switch (minipaint.MiniPaint.ca.getBotonClickeado()) {

            case 1:
                //circulo
                MiniPaint.p.agregarFigura(new Circulo(xs[0], ys[0], MiniPaint.ca.getGrosor(), "black", (int) Point2D.distance(xs[0], ys[0], e.getX(), e.getY())));
                punto = 0;
                break;
            case 2:
                //cuadrado
                MiniPaint.p.agregarFigura(new Cuadrilatero(xs[0], ys[0], MiniPaint.ca.getGrosor(), "black",distx,disty));
                punto = 0;
                break;
            case 3:
                //triangulo
                MiniPaint.p.agregarFigura(new Triangulo(xs[0], ys[0], MiniPaint.ca.getGrosor(), "black", distx, disty));
                punto = 0;
                break;
            case 4:
                //linea
                MiniPaint.p.agregarFigura(new Linea(xs[0], ys[0], MiniPaint.ca.getGrosor(), "black", e.getX(), e.getY()));
                punto = 0;
                break;
            default:
                break;
        }

        MiniPaint.v.getLienzo().repaint();
    }

    @Override
    public void mouseEntered(MouseEvent e
    ) {

    }

    @Override
    public void mouseExited(MouseEvent e
    ) {

    }

    /**
     * @return the xs
     */
    public int[] getXs() {
        return xs;
    }

    /**
     * @param xs the xs to set
     */
    public void setXs(int[] xs) {
        this.xs = xs;
    }

    /**
     * @return the ys
     */
    public int[] getYs() {
        return ys;
    }

    /**
     * @param ys the ys to set
     */
    public void setYs(int[] ys) {
        this.ys = ys;
    }

    /**
     * @return the punto
     */
    public int getPunto() {
        return punto;
    }

    /**
     * @param punto the punto to set
     */
    public void setPunto(int punto) {
        this.punto = punto;
    }

}
