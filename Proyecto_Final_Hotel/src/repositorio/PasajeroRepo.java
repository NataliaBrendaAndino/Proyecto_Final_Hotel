package repositorio;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

import entidades.Pasajero;

public class PasajeroRepo {
    private Connection connection;
    private Statement statement;
    private Pasajero pasajero;

    public PasajeroRepo() {

    }

    public void persistirPasajero(Pasajero pasajero) {

        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/Hotel_Fibonacci_Del_Mar", "root",
                    "root");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        String insertQuery = "INSERT INTO pasajero (id, nombre, dni, rol, clave_acceso, nacionalidad, domicilio_origen) "
                + "VALUES (?, ?, ?, ?, ?, ?, ?)";

        try (PreparedStatement preparedStatement = connection.prepareStatement(insertQuery)) {
            preparedStatement.setInt(1, pasajero.getId());
            preparedStatement.setString(2, pasajero.getNombre());
            preparedStatement.setInt(3, pasajero.getDni());
            preparedStatement.setString(4, pasajero.getRol());
            preparedStatement.setString(5, pasajero.getClaveAcceso());
            preparedStatement.setString(6, pasajero.getNacionalidad());
            preparedStatement.setString(7, pasajero.getDomicilioOrigen());

            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
