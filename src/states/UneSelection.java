package states;

import java.awt.*;
import java.util.ArrayList;

import shapes.Draw;
import shapes.FormGeo;

public class UneSelection implements EtatSelection{

    @Override
    public void dessiner(Panel panel, ArrayList<FormGeo> formsGeo, Graphics2D graphics2D) {
        for (FormGeo formGeo : formsGeo){
            panel.lightSquares(graphics2D, formGeo);
            panel.repaint();
        }
    }
}
