package repositorio;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import entidades.Recepcionista;

public class RecepcionistaRepo {
    private Connection connection;
    private Recepcionista recepcionista;
    private Statement statement;

    public RecepcionistaRepo() {

    }

    public void persistirRecepcionista(Recepcionista recepcionista) {

        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/Hotel_Fibonacci_Del_Mar", "root",
                    "root");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        String insertQuery = "INSERT INTO Recepcionista (id, nombre, dni, rol, clave_acceso) "
                + "VALUES (?, ?, ?, ?, ?)";

        try (PreparedStatement preparedStatement = connection.prepareStatement(insertQuery)) {
            preparedStatement.setInt(1, recepcionista.getId());
            preparedStatement.setString(2, recepcionista.getNombre());
            preparedStatement.setInt(3, recepcionista.getDni());
            preparedStatement.setString(4, recepcionista.getRol());
            preparedStatement.setString(5, recepcionista.getClaveAcceso());

            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void mostrarRecepcionistas() {

        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/Hotel_Fibonacci_Del_Mar", "root",
                    "root");
            String sql = "SELECT * FROM recepcionista";

            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);

            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String nombre = resultSet.getString("nombre");
                int dni = resultSet.getInt("dni");
                String rol = resultSet.getString("rol");
                String claveAcceso = resultSet.getString("clave_acceso");

                // Realiza las operaciones deseadas con los datos de cada recepcionista
                System.out.println("ID: " + id);
                System.out.println("Nombre: " + nombre);
                System.out.println("DNI: " + dni);
                System.out.println("Rol: " + rol);
                System.out.println("Clave de Acceso: " + claveAcceso);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
