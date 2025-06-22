package Reporte;

import java.io.File;

public abstract class ReportDecorator implements ReportComponent {
    protected final ReportComponent delegate;

    protected ReportDecorator(ReportComponent delegate) {
        this.delegate = delegate;
    }

    @Override
    public void export(File file) {
        delegate.export(file);   // comportamiento por defecto
    }
}
