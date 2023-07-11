package repositorio;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import entidades.Limpieza;

public class LimpiezaRepo {
    private Connection connection;
    private Limpieza limpieza;

    public LimpiezaRepo() {

    }

    public void persistirLimpieza(Limpieza limpieza) {

        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/Hotel_Fibonacci_Del_Mar", "root",
                    "root");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        String insertQuery = "INSERT INTO Limpieza (id, nombre, dni, rol, clave_acceso) "
                + "VALUES (?, ?, ?, ?, ?)";

        try (PreparedStatement preparedStatement = connection.prepareStatement(insertQuery)) {
            preparedStatement.setInt(1, limpieza.getId());
            preparedStatement.setString(2, limpieza.getNombre());
            preparedStatement.setInt(3, limpieza.getDni());
            preparedStatement.setString(4, limpieza.getRol());
            preparedStatement.setString(5, limpieza.getClaveAcceso());

            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}