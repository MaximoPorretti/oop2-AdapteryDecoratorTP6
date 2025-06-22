package Canvas;


import java.awt.Color;

public class Linea implements Figura {
    private final int x1, y1, x2, y2;
    private final Color color;

    public Linea(int x1, int y1, int x2, int y2, Color color) {
        this.x1 = x1; this.y1 = y1;
        this.x2 = x2; this.y2 = y2;
        this.color = color;
    }

    @Override
    public void paint(Panel panel) {
        panel.drawLine(x1, y1, x2, y2, color);
    }
}