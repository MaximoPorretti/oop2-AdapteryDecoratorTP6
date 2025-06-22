package Canvas;

import java.awt.Color;

public class Circulo implements Figura {
    private final int x, y, radius;
    private final Color fill, stroke;

    public Circulo(int x, int y, int radius, Color fill, Color stroke) {
        this.x = x;
        this.y = y;
        this.radius = radius;
        this.fill = fill;
        this.stroke = stroke;
    }

    @Override
    public void paint(Panel panel) {
        panel.drawCircle(x, y, radius, fill, stroke);
    }
}