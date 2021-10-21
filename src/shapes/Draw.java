package shapes;

import javax.swing.*;
import java.awt.*;

public class Draw extends JPanel {

    public void lightSquares(Graphics2D g2D, FormGeo f) {
        double x = f.getX();
        double y = f.getY();
        double w = f.getWidth();
        double h = f.getHeight();
        g2D.setColor(Color.BLACK);

        g2D.fill(new Rectangle.Double(x + w * 0.5 - 3.0, y - 3.0, 6.0, 6.0));

        g2D.fill(new Rectangle.Double(x - 3.0, y + h * 0.5 - 3.0, 6.0, 6.0));
        g2D.fill(new Rectangle.Double(x + w - 3.0, y + h * 0.5 - 3.0, 6.0, 6.0));

        g2D.fill(new Rectangle.Double(x + w * 0.5 - 3.0, y + h - 3.0, 6.0, 6.0));

    }


}
