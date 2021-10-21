package states;
import shapes.FormGeo;

import java.awt.*;
import java.util.ArrayList;

public interface EtatSelection{

    void dessiner(Panel panel, ArrayList<FormGeo> formsGeo, Graphics2D graphics2D);

}
