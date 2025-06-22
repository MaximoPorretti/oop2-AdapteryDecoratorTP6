package Canvas;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame ventana = new JFrame("Canvas con Adapter y Composite");
            ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            ventana.setSize(400, 400);
            ventana.setLocationRelativeTo(null);
            ventana.add(new Lienzo());
            ventana.setVisible(true);
        });
    }
}