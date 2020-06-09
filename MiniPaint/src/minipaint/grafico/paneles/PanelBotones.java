
package minipaint.grafico.paneles;

import java.awt.Dimension;
import java.awt.GridLayout;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Lokitosi10
 */
public class PanelBotones extends JPanel {
    
    private JButton circulo;
    private JButton rectangulo;
    private JButton triangulo;
    private JButton linea;
    private JLabel text;

    public PanelBotones() {
        this.setBounds(810, 5, 250,300);
        this.setBorder(BorderFactory.createBevelBorder(1));
        this.setLayout(new GridLayout(5,1));
        text = new JLabel(" Funciones");
        circulo = new JButton("Circulo ");
        rectangulo = new JButton("Rectangulo");
        triangulo = new JButton("Triangulo");
        linea = new JButton("Linea");
        this.add(text);
        this.add(circulo);        
        this.add(rectangulo);
        this.add(triangulo);
        this.add(linea);
    }

    /**
     * @return the circulo
     */
    public JButton getCirculo() {
        return circulo;
    }

    /**
     * @param circulo the circulo to set
     */
    public void setCirculo(JButton circulo) {
        this.circulo = circulo;
    }

    /**
     * @return the rectangulo
     */
    public JButton getRectangulo() {
        return rectangulo;
    }

    /**
     * @param rectangulo the rectangulo to set
     */
    public void setRectangulo(JButton rectangulo) {
        this.rectangulo = rectangulo;
    }

    /**
     * @return the triangulo
     */
    public JButton getTriangulo() {
        return triangulo;
    }

    /**
     * @param triangulo the triangulo to set
     */
    public void setTriangulo(JButton triangulo) {
        this.triangulo = triangulo;
    }

    /**
     * @return the linea
     */
    public JButton getLinea() {
        return linea;
    }

    /**
     * @param linea the linea to set
     */
    public void setLinea(JButton linea) {
        this.linea = linea;
    }
    
    
    
}
