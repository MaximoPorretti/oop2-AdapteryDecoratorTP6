package Concurso;

import java.util.ArrayList;
import java.util.List;

public class Participante {
    private String nombre;
    private int dni;
    private int puntos;
    private List<ConcursoComponent> concursosInscriptos;

    public Participante(String nombre, int dni) {
        this.nombre = nombre;
        this.dni = dni;
        this.puntos = 0;
        this.concursosInscriptos = new ArrayList<>();
    }

    public void inscribio(ConcursoComponent concurso) {
        this.concursosInscriptos.add(concurso);
    }

    public void sumaPuntos(int puntos) {
        this.puntos += puntos;
    }

    public boolean tienePuntos(int puntosEsperados) {
        return this.puntos == puntosEsperados;
    }

    public int getDni() {
        return dni;
    }

    @Override
    public String toString() {
        return nombre + " (DNI: " + dni + ")";
    }

    public int getPuntos() {
        return puntos;
    }
}
