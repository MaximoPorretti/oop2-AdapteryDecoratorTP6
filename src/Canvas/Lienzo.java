package Canvas;

import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Color;
import java.awt.Font;

public class Lienzo extends JPanel {
    private final Figura escena;

    public Lienzo() {
        this.escena = crearEscena();
    }

    private Figura crearEscena() {
        Grupo root = new Grupo();
        root.add(new Circulo(150, 150, 50, Color.ORANGE, Color.BLACK));
        root.add(new Linea(100, 100, 200, 200, Color.RED));
        root.add(new Texto("¡Hola Mundo estoy usando adapter!", 110, 240,
                new Font("SansSerif", Font.BOLD, 18), Color.BLUE));
        return root;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;
        Panel panel = new Graphics2DPanelAdapter(g2d);
        escena.paint(panel);
    }
}