
package minipaint.modelo.herramientas;

import java.awt.Graphics2D;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.ListModel;
import javax.swing.event.ListDataListener;
import minipaint.modelo.figuras.Figura;

/**
 *
 * @author Lokitosi10
 */
public class PortaPapeles {
    
    private ArrayList<Figura> lista = new ArrayList<Figura>();
    private DefaultListModel<String> lm = new DefaultListModel<String>();

    /**
     * @return the lista
     */
    public ArrayList<Figura> getLista() {
        return lista;
    }

    /**
     * @param lista the lista to set
     */
    public void setLista(ArrayList<Figura> lista) {
        this.lista = lista;
    }
    
    public void borrarFigura(Figura f){
        this.lista.remove(f);
        this.lm.remove(this.lm.indexOf(f.toString()));
    }
    
    public void agregarFigura(Figura f){
        this.lista.add(f);
        this.lm.addElement(f.toString());
    }
    
    public void dibujarFiguras(Graphics2D g){
        for (Figura figura : lista) {
            figura.dibujarFigura(g);
        }
    }

    /**
     * @return the lm
     */
    public DefaultListModel<String> getLm() {
        return lm;
    }

    /**
     * @param lm the lm to set
     */
    public void setLm(DefaultListModel<String> lm) {
        this.lm = lm;
    }
    
    
    
}
