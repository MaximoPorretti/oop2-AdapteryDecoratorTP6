package Concurso;


import java.time.LocalDate;

public interface ConcursoComponent {
    void inscribir(Participante p, LocalDate fecha);
    boolean estaInscripto(Participante p);
    void participantesDelConcurso();
    String getNombre();
}
