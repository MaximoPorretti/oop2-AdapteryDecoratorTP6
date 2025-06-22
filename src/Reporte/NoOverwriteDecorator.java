package Reporte;

import java.io.File;

public class NoOverwriteDecorator extends ReportDecorator {

    public NoOverwriteDecorator(ReportComponent delegate) {
        super(delegate);
    }

    @Override
    public void export(File file) {
        if (file == null) {
            throw new IllegalArgumentException("File es NULL; no puedo exportar…");
        }
        if (file.exists()) {
            throw new IllegalArgumentException("El archivo ya existe…");
        }
        super.export(file);   // delega al componente base
    }
}
