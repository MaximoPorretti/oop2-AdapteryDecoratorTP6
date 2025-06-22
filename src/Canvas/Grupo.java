package Canvas;

import java.util.ArrayList;
import java.util.List;

public class Grupo implements Figura {
    private final List<Figura> hijos = new ArrayList<>();

    public void add(Figura f) { hijos.add(f); }

    @Override
    public void paint(Panel panel) {
        for (Figura f : hijos) {
            f.paint(panel);
        }
    }
}