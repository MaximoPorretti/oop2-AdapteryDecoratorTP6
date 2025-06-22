package Concurso;

import java.time.LocalDate;

public abstract class ConcursoDecorator implements ConcursoComponent {
    protected final ConcursoComponent concurso;

    public ConcursoDecorator(ConcursoComponent concurso) {
        this.concurso = concurso;
    }

    @Override
    public void inscribir(Participante p, LocalDate fecha) {
        concurso.inscribir(p, fecha);
    }

    @Override
    public boolean estaInscripto(Participante p) {
        return concurso.estaInscripto(p);
    }

    @Override
    public void participantesDelConcurso() {
        concurso.participantesDelConcurso();
    }

    @Override
    public String getNombre() {
        return concurso.getNombre();
    }
}
