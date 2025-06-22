package Canvas;

import java.awt.Color;
import java.awt.Font;

public interface Panel {
    void drawCircle(int x, int y, int radius, Color fill, Color stroke);
    void drawLine(int x1, int y1, int x2, int y2, Color color);
    void drawText(String text, int x, int y, Font font, Color color);
}