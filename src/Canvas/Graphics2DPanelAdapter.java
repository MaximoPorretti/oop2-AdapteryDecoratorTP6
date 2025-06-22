package Canvas;


import java.awt.*;

public class Graphics2DPanelAdapter implements Panel {
    private final Graphics2D g;

    public Graphics2DPanelAdapter(Graphics2D g) {
        this.g = g;
        g.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
                           RenderingHints.VALUE_ANTIALIAS_ON);
    }

    @Override
    public void drawCircle(int x, int y, int radius, Color fill, Color stroke) {
        if (fill != null) {
            g.setColor(fill);
            g.fillOval(x - radius, y - radius, radius * 2, radius * 2);
        }
        if (stroke != null) {
            g.setColor(stroke);
            g.drawOval(x - radius, y - radius, radius * 2, radius * 2);
        }
    }

    @Override
    public void drawLine(int x1, int y1, int x2, int y2, Color color) {
        g.setColor(color);
        g.drawLine(x1, y1, x2, y2);
    }

    @Override
    public void drawText(String text, int x, int y, Font font, Color color) {
        g.setFont(font);
        g.setColor(color);
        g.drawString(text, x, y);
    }
}