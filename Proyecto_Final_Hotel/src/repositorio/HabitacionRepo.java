package repositorio;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import entidades.Habitacion;

public class HabitacionRepo {
    private Connection connection;
    private Habitacion habitacion;
    private Statement statement;

    public HabitacionRepo() {

    }

    public void persistirHabitaciones(Habitacion habitacion) {
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/Hotel_Fibonacci_Del_Mar", "root",
                    "root");
        } catch (SQLException e) {
            e.printStackTrace();
        }

        String insertQuery = "INSERT INTO Habitacion (id, num_Habitacion, disponible, limpieza, desinfeccion) "
                + "VALUES (?, ?, ?, ?, ?)";

        try (PreparedStatement preparedStatement = connection.prepareStatement(insertQuery)) {
            preparedStatement.setInt(1, habitacion.getId());
            preparedStatement.setInt(2, habitacion.getNumHabitacion());
            preparedStatement.setBoolean(3, habitacion.isDisponible());
            preparedStatement.setBoolean(4, habitacion.isLimpieza());
            preparedStatement.setBoolean(5, habitacion.isDesinfeccion());

            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void mostrarHabitaciones() {

        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/Hotel_Fibonacci_Del_Mar", "root",
                    "root");
            String sql = "SELECT * FROM Habitacion";

            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);

            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                int numHabitacion = resultSet.getInt("num_Habitacion");
                boolean disponible = resultSet.getBoolean("disponible");
                boolean limpieza = resultSet.getBoolean("limpieza");
                boolean desinfeccion = resultSet.getBoolean("desinfeccion");

                System.out.println("ID: " + id);
                System.out.println("NumHabitacion: " + numHabitacion);
                System.out.println("Disponible: " + disponible);
                System.out.println("Limpieza: " + limpieza);
                System.out.println("Desinfeccion: " + desinfeccion);

            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}