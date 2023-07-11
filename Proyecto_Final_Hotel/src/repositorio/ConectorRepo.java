package repositorio;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class ConectorRepo {

    private Connection connection;
    private Statement statement;

    public ConectorRepo() {
    }

    public ConectorRepo(Connection connection, Statement statement) {
        this.connection = null;
        this.statement = null;
    }

    public void crearBaseDatos() {

        try {
            // Establecer la conexión con MySQL
            String url = "jdbc:mysql://localhost:3306/";
            String username = "root";
            String password = "root";
            connection = DriverManager.getConnection(url, username, password);

            // Crear la base de datos si no existe
            statement = connection.createStatement();
            String sql = "CREATE DATABASE IF NOT EXISTS Hotel_Fibonacci_Del_Mar";
            statement.executeUpdate(sql);

            System.out.println("Base de datos creada exitosamente.");
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                // Cerrar el statement y la conexión
                if (statement != null) {
                    statement.close();
                }
                if (connection != null) {
                    connection.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    public void crearTablaPersona() {
        try {
            // Establecer la conexión con MySQL
            String url = "jdbc:mysql://localhost:3306/";
            String username = "root";
            String password = "root";
            connection = DriverManager.getConnection(url, username, password);

            // Seleccionar la base de datos
            statement = connection.createStatement();
            String useDatabase = "USE Hotel_Fibonacci_Del_Mar;";
            statement.executeUpdate(useDatabase);

            // Crear la tabla "persona"
            statement = connection.createStatement();
            String sql = "CREATE TABLE IF NOT EXISTS Persona ("
                    + "id INT AUTO_INCREMENT PRIMARY KEY,"
                    + "nombre VARCHAR(100) NOT NULL,"
                    + "dni INT NOT NULL,"
                    + "rol VARCHAR(50),"
                    + "clave_acceso VARCHAR(50)"
                    + ")";
            statement.executeUpdate(sql);

            System.out.println("Tabla 'Persona' creada exitosamente.");
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                // Cerrar el statement y la conexión
                if (statement != null) {
                    statement.close();
                }
                if (connection != null) {
                    connection.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    public void crearTablaPasajero() {
        try {
            // Establecer la conexión con MySQL
            String url = "jdbc:mysql://localhost:3306/";
            String username = "root";
            String password = "root";
            connection = DriverManager.getConnection(url, username, password);

            // Seleccionar la base de datos
            statement = connection.createStatement();
            String useDatabase = "USE Hotel_Fibonacci_Del_Mar;";
            statement.executeUpdate(useDatabase);

            // Crear la tabla "persona"
            statement = connection.createStatement();
            String crearTablePasajero = "CREATE TABLE IF NOT EXISTS Pasajero ("
                    + "id INT AUTO_INCREMENT PRIMARY KEY,"
                    + "nombre VARCHAR(100) NOT NULL,"
                    + "dni INT NOT NULL,"
                    + "rol VARCHAR(50),"
                    + "clave_acceso VARCHAR(50),"
                    + "nacionalidad VARCHAR(100),"
                    + "domicilio_origen VARCHAR(100)"
                    + ")";
            statement.executeUpdate(crearTablePasajero);

            System.out.println("Tabla 'Pasajero' creada exitosamente.");
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                // Cerrar el statement y la conexión
                if (statement != null) {
                    statement.close();
                }
                if (connection != null) {
                    connection.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    public void crearTablaAdministrador() {
        try {
            // Establecer la conexión con MySQL
            String url = "jdbc:mysql://localhost:3306/";
            String username = "root";
            String password = "root";
            connection = DriverManager.getConnection(url, username, password);

            // Seleccionar la base de datos
            statement = connection.createStatement();
            String useDatabase = "USE Hotel_Fibonacci_Del_Mar;";
            statement.executeUpdate(useDatabase);

            statement = connection.createStatement();
            String crearTablaAdmin = "CREATE TABLE IF NOT EXISTS Administrador ("
                    + "id INT AUTO_INCREMENT PRIMARY KEY,"
                    + "nombre VARCHAR(100) NOT NULL,"
                    + "dni INT NOT NULL,"
                    + "rol VARCHAR(50),"
                    + "clave_acceso VARCHAR(50)"
                    + ")";
            statement.executeUpdate(crearTablaAdmin);

            System.out.println("Tabla 'Administrador' creada exitosamente.");
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                // Cerrar el statement y la conexión
                if (statement != null) {
                    statement.close();
                }
                if (connection != null) {
                    connection.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    public void crearTablaLimpieza() {
        try {
            // Establecer la conexión con MySQL
            String url = "jdbc:mysql://localhost:3306/";
            String username = "root";
            String password = "root";
            connection = DriverManager.getConnection(url, username, password);

            // Seleccionar la base de datos
            statement = connection.createStatement();
            String useDatabase = "USE Hotel_Fibonacci_Del_Mar;";
            statement.executeUpdate(useDatabase);

            statement = connection.createStatement();
            String crearTablaLimpieza = "CREATE TABLE IF NOT EXISTS Limpieza ("
                    + "id INT AUTO_INCREMENT PRIMARY KEY,"
                    + "nombre VARCHAR(100) NOT NULL,"
                    + "dni INT NOT NULL,"
                    + "rol VARCHAR(50),"
                    + "clave_acceso VARCHAR(50)"
                    + ")";
            statement.executeUpdate(crearTablaLimpieza);

            System.out.println("Tabla 'Limpieza' creada exitosamente.");
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                // Cerrar el statement y la conexión
                if (statement != null) {
                    statement.close();
                }
                if (connection != null) {
                    connection.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    public void crearTablaRecepcionista() {
        try {
            // Establecer la conexión con MySQL
            String url = "jdbc:mysql://localhost:3306/";
            String username = "root";
            String password = "root";
            connection = DriverManager.getConnection(url, username, password);

            // Seleccionar la base de datos
            statement = connection.createStatement();
            String useDatabase = "USE Hotel_Fibonacci_Del_Mar;";
            statement.executeUpdate(useDatabase);

            statement = connection.createStatement();
            String crearTablaRecepcionista = "CREATE TABLE IF NOT EXISTS Recepcionista ("
                    + "id INT AUTO_INCREMENT PRIMARY KEY,"
                    + "nombre VARCHAR(100) NOT NULL,"
                    + "dni INT NOT NULL,"
                    + "rol VARCHAR(50),"
                    + "clave_acceso VARCHAR(50)"
                    + ")";
            statement.executeUpdate(crearTablaRecepcionista);

            System.out.println("Tabla 'Recepcionista' creada exitosamente.");
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                // Cerrar el statement y la conexión
                if (statement != null) {
                    statement.close();
                }
                if (connection != null) {
                    connection.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    public void crearTablaHistorial() {
        try {
            // Establecer la conexión con MySQL
            String url = "jdbc:mysql://localhost:3306/";
            String username = "root";
            String password = "root";
            connection = DriverManager.getConnection(url, username, password);

            // Seleccionar la base de datos
            statement = connection.createStatement();
            String useDatabase = "USE Hotel_Fibonacci_Del_Mar;";
            statement.executeUpdate(useDatabase);

            statement = connection.createStatement();
            String crearTablaHistorial = "CREATE TABLE IF NOT EXISTS Historial ("
                    + "id INT AUTO_INCREMENT PRIMARY KEY,"
                    + "fecha_estadia VARCHAR(50) NOT NULL,"
                    + "habitacion_ocupada INT,"
                    + "observaciones VARCHAR(100),"
                    + "pasajero_id INT,"
                    + "FOREIGN KEY (pasajero_id) REFERENCES pasajero(id)"
                    + ")";
            statement.executeUpdate(crearTablaHistorial);

            System.out.println("Tabla 'Historial' creada exitosamente.");
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                // Cerrar el statement y la conexión
                if (statement != null) {
                    statement.close();
                }
                if (connection != null) {
                    connection.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    public void crearTablaHabitacion() {
        try {
            // Establecer la conexión con MySQL
            String url = "jdbc:mysql://localhost:3306/";
            String username = "root";
            String password = "root";
            connection = DriverManager.getConnection(url, username, password);

            // Seleccionar la base de datos
            statement = connection.createStatement();
            String useDatabase = "USE Hotel_Fibonacci_Del_Mar;";
            statement.executeUpdate(useDatabase);

            statement = connection.createStatement();
            String crearTablaHabitacion = "CREATE TABLE IF NOT EXISTS Habitacion ("
                    + "id INT AUTO_INCREMENT PRIMARY KEY,"
                    + "num_habitacion INT,"
                    + "disponible BOOLEAN,"
                    + "limpieza BOOLEAN,"
                    + "desinfeccion BOOLEAN,"
                    + "reserva_id INT,"
                    + "FOREIGN KEY (reserva_id) REFERENCES reserva(id)"
                    + ")";
            statement.executeUpdate(crearTablaHabitacion);

            System.out.println("Tabla 'Habitacion' creada exitosamente.");
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                // Cerrar el statement y la conexión
                if (statement != null) {
                    statement.close();
                }
                if (connection != null) {
                    connection.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    public void crearTablaReserva() {
        try {
            // Establecer la conexión con MySQL
            String url = "jdbc:mysql://localhost:3306/";
            String username = "root";
            String password = "root";
            connection = DriverManager.getConnection(url, username, password);

            // Seleccionar la base de datos
            statement = connection.createStatement();
            String useDatabase = "USE Hotel_Fibonacci_Del_Mar;";
            statement.executeUpdate(useDatabase);

            statement = connection.createStatement();
            String crearTablaReserva = "CREATE TABLE IF NOT EXISTS Reserva ("
                    + "id INT AUTO_INCREMENT PRIMARY KEY,"
                    + "reserva BOOLEAN,"
                    + "saldo INT,"
                    + "fecha_reserva_ingreso DATE,"
                    + "fecha_reserva_salida DATE"
                    + ")";
            statement.executeUpdate(crearTablaReserva);

            System.out.println("Tabla 'Reserva' creada exitosamente.");
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                // Cerrar el statement y la conexión
                if (statement != null) {
                    statement.close();
                }
                if (connection != null) {
                    connection.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

}
