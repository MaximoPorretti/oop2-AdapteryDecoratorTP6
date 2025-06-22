package Concurso;

import java.time.LocalDate;


public class Main {
    public static void main(String[] args) {
        ConcursoComponent concurso = new ConcursoConEmail(
                new Concurso(
                        "Maratón de Programación",
                        LocalDate.of(2025, 4, 1),
                        LocalDate.of(2025, 3, 25),
                        new Registrador(),
                        new EnviarMails()
                ),
                new EnviarMails()
        );

        Participante p1 = new Participante("Juan Pérez", 12345678);
        Participante p2 = new Participante("María López", 87654321);

        concurso.inscribir(p1, LocalDate.of(2025, 3, 25));
        concurso.inscribir(p2, LocalDate.of(2025, 3, 27));

        concurso.participantesDelConcurso();
    }
}
