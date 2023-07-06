package servicios;

import java.util.ArrayList;
import java.util.Scanner;

import entidades.Pasajero;

public class RegistroImplementa implements Registro {
    Scanner leer = new Scanner(System.in);
    Pasajero pasajero = null;
    private ArrayList<Pasajero> listaPasajeros;
    HabitacionServicio habitacionServicio = new HabitacionServicio();

    public RegistroImplementa(ArrayList<Pasajero> listaPasajeros) {
        this.listaPasajeros = new ArrayList<Pasajero>();
    }

    @Override
    public void checkIn() {
        System.out.println("Ingrese el nombre del pasajero que hará el CHECKIN");
        pasajero = new Pasajero();
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
        System.out.println("¿Qué habitación desea ocupar?");
        habitacionServicio.reservarHabitacion();

        listaPasajeros.add(pasajero);

    }

    @Override
    public void checkOut() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'checkOut'");
    }

    @Override
    public void tomarReserva() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'tomarReserva'");
    }

    @Override
    public void listarHabitaciones() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'listarHabitaciones'");

    }
}
