package states;
import shapes.FormGeo;
import java.awt.*;
import java.util.ArrayList;

public class AucuneSelection implements EtatSelection {


    public void dessiner(Panel panel, ArrayList<FormGeo> formsGeo, Graphics2D graphics2D) {

            panel.repaint();
    }
}
