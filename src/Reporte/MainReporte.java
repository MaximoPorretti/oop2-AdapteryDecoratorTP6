package Reporte;

import java.io.File;

public class MainReporte {
    public static void main(String[] args) {

        // 1) Reporte que sobrescribe libremente
        File libreFile = new File("reportee.txt");
        ReportComponent libre = new BasicReport("Contenido libre");
        libre.export(libreFile);

        // 2) Reporte protegido (otro archivo)
        File protegidoFile = new File("reporte-protegidoooo.txt");
        ReportComponent seguro =
                new NoOverwriteDecorator(new BasicReport("Contenido protegido"));

        try {
            seguro.export(protegidoFile);  // Sólo crea si no existe
            System.out.println("Reporte protegido exportado OK.");
        } catch (IllegalArgumentException e) {
            System.out.println("No se pudo exportar: " + e.getMessage());
        }
    }
}
