package Concurso;


public interface EmailsService {
    String enviarEmail(String destinatario, String asunto, String mensaje);
}
