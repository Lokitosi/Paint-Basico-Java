
package minipaint.grafico.paneles;

import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.ListModel;
import minipaint.modelo.figuras.Figura;

/**
 *
 * @author Lokitosi10
 */
public class PanelFiguras extends JPanel{
    
    private JList<String> figuras ;

    public PanelFiguras() {
        this.setBounds(810,310,250,340);
        this.setBorder(BorderFactory.createBevelBorder(1));

        figuras = new JList<String>(minipaint.MiniPaint.p.getLm());
        this.add(figuras);
        this.setBackground(Color.DARK_GRAY);
    }

    /**
     * @return the figuras
     */
    public JList<String> getFiguras() {
        return figuras;
    }

    /**
     * @param figuras the figuras to set
     */
    public void setFiguras(JList<String> figuras) {
        this.figuras = figuras;
    }
    
}
