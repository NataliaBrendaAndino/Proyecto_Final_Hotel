package servicios;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

import entidades.Habitacion;
import entidades.Reserva;

public class HabitacionServicio {
    private ArrayList<Habitacion> habitaciones;
    Scanner leer = new Scanner(System.in);

    public HabitacionServicio(){}

    public HabitacionServicio(ArrayList<Habitacion> listarHabitaciones) {
        this.habitaciones = new ArrayList<Habitacion>();
        ;
    }

    public void listarHabitacionesDisponibes() {
        for (Habitacion habitacion : habitaciones) {
            if (habitacion.isDisponible()) {
                System.out.println(habitacion.getNumHabitacion());
            }
        }
    }

    public void reservarHabitacion() {
        System.out.println("Estas son las habitaciones disponibles:");
        listarHabitacionesDisponibes();
        System.out.println("¿Qué número de habitación desea reservar?");
        int numHabitacion = leer.nextInt();
        Habitacion habitacion = new Habitacion();
        habitacion.setNumHabitacion(numHabitacion); // mmmmmm dudoso, deberíamos usar un enum y mejorarlo
        habitacion.setDisponible(false);
        Reserva reserva = new Reserva();
        reserva.setReserva(true);
        System.out.println("Ingrese el saldo pendiente (indique 0 si abonó toda la reserva): ");
        int saldo = leer.nextInt();
        reserva.setSaldo(saldo);
        System.out.println("Datos de la reserva: ¿Desde qué día se hospedará el pasajero?");
        int diaIngreso = leer.nextInt();
        System.out.println("¿Mes?");
        int mesIngreso = leer.nextInt();
        System.out.println("¿Año?");
        int anioIngreso = leer.nextInt();
        reserva.setFechaReservaIngreso(new Date(anioIngreso, mesIngreso, diaIngreso));
        System.out.println("¿Hasta qué día se quedará?");
        int diaSalida = leer.nextInt();
        System.out.println("¿Mes?");
        int mesSalida = leer.nextInt();
        System.out.println("¿Año?");
        int anioSalida = leer.nextInt();
        reserva.setFechaReservaSalida(new Date(anioSalida, mesSalida, diaSalida));
        habitacion.setReserva(reserva);
        habitaciones.add(habitacion);
        System.out.println("La habitación ha sido reservada");
    }

    /*
     * private int id;
     * private int numHabitacion;
     * private boolean disponible;
     * private boolean limpieza;
     * private boolean desinfeccion;
     * private Reserva reserva;
     */

    public void consultarLimpiezaYDesinfeccion() {
        System.out.println("¿De qué habitación desea conocer la limpieza");

        // INCOMPLETO
        //
        //
        //
    }
}
