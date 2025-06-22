package Canvas;


import java.awt.Color;
import java.awt.Font;

public class Texto implements Figura {
    private final String texto;
    private final int x, y;
    private final Font font;
    private final Color color;

    public Texto(String texto, int x, int y, Font font, Color color) {
        this.texto = texto;
        this.x = x; this.y = y;
        this.font = font;
        this.color = color;
    }

    @Override
    public void paint(Panel panel) {
        panel.drawText(texto, x, y, font, color);
    }
}