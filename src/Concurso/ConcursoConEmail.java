package Concurso;

import java.time.LocalDate;

public class ConcursoConEmail extends ConcursoDecorator {

    private final EmailsService emailService;

    public ConcursoConEmail(ConcursoComponent concurso, EmailsService emailService) {
        super(concurso);
        this.emailService = emailService;
    }

    @Override
    public void inscribir(Participante participante, LocalDate fecha) {
        super.inscribir(participante, fecha);

        String email = participante.toString().toLowerCase().replace(" ", ".") + "@mailtrap.io";
        String asunto = "Confirmación de inscripción en el concurso";
        String mensaje = "Hola " + participante.toString() + ",\n\n" +
                "Te confirmamos que te has inscrito exitosamente al concurso: " + getNombre() +
                ".\n\n¡Buena suerte!\n\n-- Organización del Concurso";

        emailService.enviarEmail(email, asunto, mensaje);
    }
}
