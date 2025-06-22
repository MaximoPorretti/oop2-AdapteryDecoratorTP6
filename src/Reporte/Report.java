package Reporte;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Report {
    private final String reporte;

    public Report(String reporte) {
        this.reporte = reporte;
    }

    public void export(File file) {
        if (file == null) {
            throw new IllegalArgumentException("File es NULL; no puedo exportar…");
        }
        if (file.exists()) {
            throw new IllegalArgumentException("El archivo ya existe…");
        }
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(file))) {
            bw.write(reporte);
        } catch (IOException e) {
            throw new RuntimeException("Error exportando el reporte", e);
        }
    }
}
