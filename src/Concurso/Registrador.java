package Concurso;



import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Registrador implements Registrar {

    @Override
    public void registrarTXT(String datos) {
        String rutaArchivo = "inscripciones.txt";

        try (FileWriter fw = new FileWriter(rutaArchivo, true);
             PrintWriter pw = new PrintWriter(fw)) {

            pw.println(datos);
            System.out.println("Inscripción registrada correctamente en el archivo.");

        } catch (IOException e) {
            System.err.println("Error al registrar la inscripción: " + e.getMessage());
        }
    }

    @Override
    public void registrarJDBC(String datos) {
        String sql = "INSERT INTO inscripciones (dni, fecha, concurso) VALUES (?, ?, ?)";

        try (Connection conn = DriverManager.getConnection("jdbc:sqlite:concurso.db");
             PreparedStatement pstmt = conn.prepareStatement(sql)) {

            String[] datosSplit = datos.split("\\|\\|");
            pstmt.setInt(1, Integer.parseInt(datosSplit[1]));
            pstmt.setString(2, datosSplit[0]);
            pstmt.setString(3, datosSplit[2]);

            pstmt.executeUpdate();
            System.out.println("Inscripción registrada en SQLite.");

        } catch (SQLException e) {
            System.err.println("Error al registrar inscripción: " + e.getMessage());
        }
    }

}


