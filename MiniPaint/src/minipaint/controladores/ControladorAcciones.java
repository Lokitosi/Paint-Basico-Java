package minipaint.controladores;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JOptionPane;
import minipaint.MiniPaint;
import minipaint.modelo.figuras.Figura;

/**
 *
 * @author Lokitosi10
 */
public class ControladorAcciones implements ActionListener, MouseListener {

    
    private int grosor;
    private int botonClickeado;   
 
    
    /**
     * @return the botonClickeado
     */
    
    public int getBotonClickeado() {
        return botonClickeado;
    }

    /**
     * @param botonClickeado the botonClickeado to set
     */
    public void setBotonClickeado(int botonClickeado) {
        this.botonClickeado = botonClickeado;
    }

    
    @Override
    //seleccionar opcion para dibujar
    
    public void actionPerformed(ActionEvent e) {
        grosor = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el grosor de la figura"));
        if (e.getSource().equals(MiniPaint.v.getBotones().getCirculo())) {
            setBotonClickeado(1);
        }
        if (e.getSource().equals(MiniPaint.v.getBotones().getRectangulo())) {
            setBotonClickeado(2);
        }
        if (e.getSource().equals(MiniPaint.v.getBotones().getTriangulo())) {
            setBotonClickeado(3);
        }
        if (e.getSource().equals(MiniPaint.v.getBotones().getLinea())) {
            setBotonClickeado(4);
        }
        //MiniPaint.v.getLienzo().repaint();
    }

    public void agregarEscucha() {
        MiniPaint.v.getBotones().getCirculo().addActionListener(minipaint.MiniPaint.ca);
        MiniPaint.v.getBotones().getRectangulo().addActionListener(minipaint.MiniPaint.ca);
        MiniPaint.v.getBotones().getTriangulo().addActionListener(minipaint.MiniPaint.ca);
        MiniPaint.v.getBotones().getLinea().addActionListener(minipaint.MiniPaint.ca);
        MiniPaint.v.getPortapapeles().getFiguras().addMouseListener(minipaint.MiniPaint.ca);
        MiniPaint.v.getLienzo().addMouseListener(MiniPaint.cl);
        MiniPaint.v.getLienzo().addMouseMotionListener(MiniPaint.cl);
    }

    @Override
    //borrar 
    public void mouseClicked(MouseEvent e) {
        if (e.getButton() == 3) {
            int posABorrar = MiniPaint.v.getPortapapeles().getFiguras().getSelectedIndex();
            Figura fABorrar = MiniPaint.p.getLista().get(posABorrar);
            minipaint.MiniPaint.p.borrarFigura(fABorrar);
        }
        MiniPaint.v.getLienzo().repaint();
    }

    @Override
    public void mousePressed(MouseEvent e) {
        
    }

    @Override
    public void mouseReleased(MouseEvent e) {
     
    }

    @Override
    public void mouseEntered(MouseEvent e) {
    }

    @Override
    public void mouseExited(MouseEvent e) {
    }

    /**
     * @return the grosor
     */
    public int getGrosor() {
        return grosor;
    }

    /**
     * @param grosor the grosor to set
     */
    public void setGrosor(int grosor) {
        this.grosor = grosor;
    }

}
