package servicios;

import java.util.Scanner;

import entidades.Persona;
import servicios.HabitacionServicio;
import servicios.RegistroImplementa;

public class LimpiezaServicio {

    Scanner leer = new Scanner(System.in);

    HabitacionServicio habiServi = new HabitacionServicio();

    public void menuLimpieza(Persona persona) {

        habiServi.crearHabitaciones();

        boolean volverAlMenu = true;
        System.out.println("");
        System.out.println("* * *");
        System.out.println("LIMPIEZA");
        System.out.println("Bienvenido, " + persona.getNombre());
        System.out.println("¿Qué haremos hoy?");

        while (volverAlMenu) {

            System.out.println("");
            System.out.println("1 | Limpieza y Desinfección");
            System.out.println("2 | Stock");
            System.out.println("0 | Salir");
            int opcion = leer.nextInt();

            try {
                leer.nextLine();
                System.out.println("");

                switch (opcion) {
                    case 1:
                        habiServi.consultarLimpiezaYDesinfeccion();
                        break;

                    case 2:
                        System.out.println("");
                        System.out.println("Listado y gestión de stock disponible...próximamente.");
                        System.out.println("");
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
