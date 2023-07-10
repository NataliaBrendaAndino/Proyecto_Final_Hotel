package servicios;

import java.util.ArrayList;
import java.util.Scanner;
import entidades.Historial;
import entidades.Pasajero;

public class RegistroImplementa implements Registro {

    private ArrayList<Pasajero> listaPasajeros = new ArrayList<>();

    public RegistroImplementa() {

    }

    public RegistroImplementa(ArrayList<Pasajero> listaPasajeros) {
        this.listaPasajeros = new ArrayList<Pasajero>();
    }

    // declaraciones globales
    Scanner leer = new Scanner(System.in);

    @Override
    public void checkIn() {

        System.out.println("");
        System.out.println("Realizar CHECKIN");
        System.out.println("Datos del pasajero:");

        System.out.println("¿El pasajero tiene reserva previa? S/N");
        String menu = leer.nextLine();
        if (menu.equalsIgnoreCase("S")) {
            System.out.println("Ingrese el dni del pasajero");
            int dni = leer.nextInt();
            for (Pasajero pasajero : listaPasajeros) {
                if (pasajero.getDni() == dni) {
                    System.out.println("Ingrese la nacionalidad del pasajero");
                    String nacionalidad = leer.next();
                    pasajero.setNacionalidad(nacionalidad);
                    System.out.println("Ingrese el domicilio de origen");
                    String domicilioOrigen = leer.next();
                    pasajero.setDomicilioOrigen(domicilioOrigen);
                    listaPasajeros.add(pasajero);
                    System.out.println("Datos del Pasajero guardados exitosamente. Completar habitación.");
                }
            }
        } else {
            System.out.println("Ingrese el nombre y apellido del pasajero");
            Pasajero pasajero = new Pasajero();
            String nombre = leer.next();
            pasajero.setNombre(nombre);
            pasajero.setRol("pasajero");
            System.out.println("Ingrese el DNI del pasajero");
            int dni = leer.nextInt();
            pasajero.setDni(dni);
            System.out.println("Ingrese la nacionalidad del pasajero");
            String nacionalidad = leer.next();
            pasajero.setNacionalidad(nacionalidad);
            System.out.println("Ingrese el domicilio de origen");
            String domicilioOrigen = leer.next();
            pasajero.setDomicilioOrigen(domicilioOrigen);
            listaPasajeros.add(pasajero);
            System.out.println("Datos del Pasajero guardados exitosamente. Completar habitación.");
        }
    }

    @Override
    public void checkOut() {
        System.out.println("");
        System.out.println("Realizar CHECKOUT");
        System.out.println("Datos del pasajero");

        System.out.println("¿Ya se había hospedado antes en el hotel? S/N");
        String menu = leer.next();
        if (menu.equalsIgnoreCase("s")) {
            System.out.println("Ingrese el DNI del pasajero: ");
            int dni = leer.nextInt();
            for (Pasajero pasajero : listaPasajeros) {
                if (pasajero.getDni() == dni) {
                    ArrayList<Historial> historiales = new ArrayList<>();
                    historiales = pasajero.getHistorial();
                    Historial historial = new Historial();
                    System.out.println("Completar su historial:");
                    System.out.println("Indique desde cuándo hasta cuándo se hospedó:");
                    String fechaEstadia = leer.next();
                    historial.setFechaEstadia(fechaEstadia);
                    System.out.println("¿Qué habitación ocupó?");
                    int numHabitacion = leer.nextInt();
                    historial.setHabitacionOcupada(numHabitacion);
                    System.out.println("¿Observaciones? (coloque [-] en caso de ninguna)");
                    String observaciones = leer.next();
                    historial.setObservaciones(observaciones);
                    historiales.add(historial);
                    pasajero.setHistorial(historiales);
                    System.out.println("CheckOut realizado con éxito. Completar habitación.");
                }
            }
        } else {
            System.out.println("Ingrese el DNI del pasajero hará el CHECKOUT");
            int dni = leer.nextInt();
            for (Pasajero pasajero : listaPasajeros) {
                Historial historial = new Historial();
                ArrayList<Historial> historiales = new ArrayList<>();

                if (pasajero.getDni() == dni) {
                    System.out.println("Indique el periodo de tiempo que estuvo el pasajero para llenar su Historial.");
                    System.out.println("Emplee el siguiente formato:");
                    System.out.println("Desde DD-MM-YYYY hasta DD-MM-YYYY");
                    String fechaEstadia = leer.next();
                    historial.setFechaEstadia(fechaEstadia);
                    System.out.println("¿Qué habitación ocupó?");
                    int numHabitacion = leer.nextInt();
                    historial.setHabitacionOcupada(numHabitacion);
                    System.out.println("¿Observaciones? (coloque [-] en caso de ninguna)");
                    String observaciones = leer.next();
                    historial.setObservaciones(observaciones);
                    historiales.add(historial);
                    pasajero.setHistorial(historiales);
                    System.out.println("CheckOut realizado con éxito. Completar habitación.");
                }
            }
        }

    }

    @Override
    // domicilio y nacionalidad quedan nulas para que se completen en el checkin
    public void tomarReserva() {
        System.out.println("ingresando a...");
        System.out.println("* * *");
        System.out.println("RESERVAS");
        System.out.println("");
        System.out.println("Necesito pedirte algunos datos.");
        System.out.println("");

        System.out.println("Te habías hospedado antes en el hotel? S/N");
        String menu = leer.nextLine();
        if (menu.equalsIgnoreCase("s")) {
            System.out.println("Que bueno verte otra vez por aquí!");
            System.out.println("Ingresá tu dni:");
            int dni = leer.nextInt();
            for (Pasajero pasajero : listaPasajeros) {
                if (pasajero.getDni() == dni) {
                    System.out.println("Gracias por volver a confiar en nosotros, " + pasajero.getNombre().toString());
                    // System.out.println("Completar reserva habitación.");
                }
            }
        } else {
            Pasajero pasajero = new Pasajero();
            System.out.println("Ingresá tu nombre (o del pasajero a quien está realizando la reserva): ");
            String nombrePasajero = leer.next();
            pasajero.setNombre(nombrePasajero);
            System.out.println("Indique su DNI");
            int dniPasajero = leer.nextInt();
            pasajero.setDni(dniPasajero);
            pasajero.setRol("pasajero");
            listaPasajeros.add(pasajero);
            System.out.println("Registro exitoso! Que tengas una excelente estadía!");
            // System.out.println("Completar reserva habitación");
        }
    }
}
