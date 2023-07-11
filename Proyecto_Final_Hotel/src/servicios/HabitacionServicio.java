package servicios;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;
import entidades.Habitacion;
import entidades.Pasajero;
import entidades.Persona;
import entidades.Reserva;
import repositorio.HabitacionRepo;

public class HabitacionServicio {
    private ArrayList<Habitacion> habitaciones = new ArrayList<>();
    Scanner leer = new Scanner(System.in);

    HabitacionRepo habitacionRepo = new HabitacionRepo();

    public HabitacionServicio() {
    }

    public void crearHabitaciones() {
        int contador100 = 101;

        for (int i = 0; i < 4; i++) {
            Habitacion habitacion = new Habitacion();
            habitacion.setNumHabitacion(contador100++);
            habitacion.setDisponible(true);
            habitacion.setLimpieza(true);
            habitacion.setDesinfeccion(true);
            habitaciones.add(habitacion);
            // habitacionRepo.persistirHabitaciones(habitacion);
        }

        int contador200 = 201;
        for (int i = 0; i < 4; i++) {
            Habitacion habitacion = new Habitacion();
            habitacion.setNumHabitacion(contador200++);
            habitacion.setDisponible(true);
            habitacion.setLimpieza(true);
            habitacion.setDesinfeccion(true);
            habitaciones.add(habitacion);
            // habitacionRepo.persistirHabitaciones(habitacion);

        }

        int contador300 = 301;
        for (int i = 0; i < 4; i++) {
            Habitacion habitacion = new Habitacion();
            habitacion.setNumHabitacion(contador300++);
            habitacion.setDisponible(true);
            habitacion.setLimpieza(true);
            habitacion.setDesinfeccion(true);
            habitaciones.add(habitacion);
            // habitacionRepo.persistirHabitaciones(habitacion);

        }

        int contador400 = 401;
        for (int i = 0; i < 4; i++) {
            Habitacion habitacion = new Habitacion();
            habitacion.setNumHabitacion(contador400++);
            habitacion.setDisponible(true);
            habitacion.setLimpieza(true);
            habitacion.setDesinfeccion(true);
            habitaciones.add(habitacion);
            // habitacionRepo.persistirHabitaciones(habitacion);

        }
    }

    public void listarHabitacionesDisponibes() {
        System.out.println("");
        System.out.println("Estas son las habitaciones disponibles: ");
        for (Habitacion habitacion : habitaciones) {
            if (habitacion.isDisponible()) {
                System.out.print(" {" + habitacion.getNumHabitacion() + "} ");
            }
        }
        System.out.println("");
    }

    public void checkInHabitacion() {
        System.out.println("CHECKIN Habitación");
        listarHabitacionesDisponibes();
        System.out.println("Ingrese el número de habitación que desee ocupar");
        int numHabitacion = leer.nextInt();

        for (Habitacion habitacion : habitaciones) {
            if (habitacion.getNumHabitacion() == numHabitacion) {
                habitacion.setDisponible(false);
                Reserva reserva = new Reserva();
                reserva.setReserva(true);
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
                System.out.println("Ingrese su pago: ");
                System.out.println("Realizando pago...");
                reserva.setSaldo(0);
                habitacion.setReserva(reserva);

                System.out.println("El checkIn se completó con éxito");
            }
        }
    }

    public void checkOutHabitacion() {
        System.out.println("");
        System.out.println("CHECKOUT Habitación");

        System.out.println("Ingrese el número de la habitación que debe ser limpado y desinfectado:");
        int numHabitacion = leer.nextInt();
        for (Habitacion habitacion : habitaciones) {
            if (habitacion.getNumHabitacion() == numHabitacion) {
                habitacion.setLimpieza(false);
                habitacion.setDesinfeccion(false);
            }
        }
        System.out.println("CheckOut completado con éxito");
    }

    public void reservarHabitacion() {
        System.out.println("RESERVA Habitación");
        listarHabitacionesDisponibes();
        System.out.println("¿Qué habitación desea reservar?");
        int numHabitacion = leer.nextInt();

        for (Habitacion habitacion : habitaciones) {
            if (habitacion.getNumHabitacion() == numHabitacion) {
                habitacion.setDisponible(false);
                Reserva reserva = new Reserva();
                reserva.setReserva(true);
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
                System.out.println("Realizar el pago de la habitación");
                System.out.println("Efectuando su pago...");
                reserva.setSaldo(0);

                System.out.println("La habitación ha sido reservada exitosamente");
            }
        }
    }

    public void consultarLimpiezaYDesinfeccion() {
        System.out.println("");
        System.out.println("Limpieza y desinfección");
        System.out.println("¿De qué habitación desea conocer la limpieza?");
        int numHabitacion = leer.nextInt();
        for (Habitacion habitacion : habitaciones) {
            if (habitacion.getNumHabitacion() == numHabitacion) {
                System.out.println("Limpieza: " + habitacion.isLimpieza());
                System.out.println("Desinfeccion: " + habitacion.isDesinfeccion());
            }
        }
    }
}