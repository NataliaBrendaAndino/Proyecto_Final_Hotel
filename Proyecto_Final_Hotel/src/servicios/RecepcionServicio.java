package servicios;

import java.util.Scanner;

import entidades.Persona;
import servicios.HabitacionServicio;
import servicios.RegistroImplementa;

public class RecepcionServicio {

    Scanner leer = new Scanner(System.in);

    HabitacionServicio habiServi = new HabitacionServicio();
    RegistroImplementa regiImple = new RegistroImplementa();

    public void menuRecepcion(Persona persona) {

        habiServi.crearHabitaciones();

        boolean volverAlMenu = true;
        System.out.println("");
        System.out.println("* * *");
        System.out.println("RECEPCION");
        System.out.println("Bienvenido, " + persona.getNombre());
        System.out.println("¿Qué haremos hoy?");

        while (volverAlMenu) {

            System.out.println("");
            System.out.println("1 | Check In pasajero");
            System.out.println("2 | Check Out pasajero");
            System.out.println("3 | Check In habitacion");
            System.out.println("4 | Check Out habitacion");
            System.out.println("5 | Reservar habitacion");
            System.out.println("6 | Limpieza y Desinfección");
            System.out.println("7.| Listar habitaciones disponibles");
            System.out.println("0 | Salir");
            int opcion = leer.nextInt();

            try {
                leer.nextLine();
                System.out.println("");

                switch (opcion) {
                    case 1:
                        regiImple.checkIn();
                        break;

                    case 2:
                        regiImple.checkOut();
                        break;

                    case 3:
                        habiServi.checkInHabitacion();
                        break;

                    case 4:
                        habiServi.checkOutHabitacion();
                        break;

                    case 5:
                        habiServi.reservarHabitacion();
                        break;

                    case 6:
                        habiServi.consultarLimpiezaYDesinfeccion();
                        break;
                    case 7:
                        habiServi.listarHabitacionesDisponibes();
                        break;

                    case 0:
                        System.out.println("0 | Saliendo...\n Adiós!");
                        System.out.println("_____ HOTEL _____");
                        volverAlMenu = false;
                        break;

                    default:
                        throw new IndexOutOfBoundsException("Opción inválida.");
                }
            } catch (IndexOutOfBoundsException e) {
                System.out.println(e.getMessage());
            }

        }
    }

}
