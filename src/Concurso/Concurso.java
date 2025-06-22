package Concurso;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Concurso implements ConcursoComponent {
    private String nombre;
    private LocalDate fechaLimite;
    private LocalDate fechaInicio;
    private List<Participante> participantes;
    private Registrar registro;
    private EmailsService emailService;

    public Concurso(String nombre, LocalDate fechaLimite, LocalDate fechaInicio,
                    Registrar registro, EmailsService emailService) {
        this.nombre = nombre;
        this.fechaLimite = fechaLimite;
        this.fechaInicio = fechaInicio;
        this.participantes = new ArrayList<>();
        this.registro = registro;
        this.emailService = emailService;
    }

    @Override
    public void inscribir(Participante participante, LocalDate fecha) {
        if (fecha.isBefore(fechaInicio) || fecha.isAfter(fechaLimite)) {
            throw new RuntimeException("Inscripción fuera del rango permitido");
        }

        if (fecha.equals(fechaInicio)) {
            participante.sumaPuntos(10);
        }

        participantes.add(participante);
        participante.inscribio(this);

        String datos = fecha + "||" + participante.getDni() + "||" + nombre;
        registro.registrarTXT(datos);
        registro.registrarJDBC(datos);
    }

    @Override
    public boolean estaInscripto(Participante participante) {
        return participantes.contains(participante);
    }

    @Override
    public void participantesDelConcurso() {
        if (participantes.isEmpty()) {
            System.out.println("No hay participantes inscritos.");
        } else {
            System.out.println("Participantes en " + nombre + ":");
            participantes.forEach(System.out::println);
        }
    }

    @Override
    public String getNombre() {
        return nombre;
    }
}
