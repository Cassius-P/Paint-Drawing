package states;

import shapes.FormGeo;

import java.awt.*;

public interface Panel {
    void lightSquares(Graphics2D g2, FormGeo f);
    void repaint();
}
