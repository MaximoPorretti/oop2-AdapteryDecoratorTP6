package Reporte;

import java.io.*;

public class BasicReport implements ReportComponent {
    private final String contenido;

    public BasicReport(String contenido) {
        this.contenido = contenido;
    }

    @Override
    public void export(File file) {
        if (file == null) {
            throw new IllegalArgumentException("File es NULL; no se puede exportar el reporte");
        }
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(file))) {
            bw.write(contenido);
        } catch (IOException e) {
            throw new RuntimeException("Error exportando el reporte", e);
        }
    }
}
