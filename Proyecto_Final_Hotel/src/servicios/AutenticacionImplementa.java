package servicios;

import entidades.Administrador;
import entidades.Limpieza;
import entidades.Pasajero;
import entidades.Persona;
import entidades.Recepcionista;

import java.util.ArrayList;
import java.util.Scanner;

public class AutenticacionImplementa implements Autenticacion {

    Scanner leer = new Scanner(System.in);
    AdminServicio servi = new AdminServicio();

    @Override
    public boolean autenticar(Persona persona, int id, String claveAcceso) {

        return persona.getId() == id && persona.getClaveAcceso().equals(claveAcceso);
    }

    public void ingresoUsuario() {

        System.out.println("_____ Bienvenidos al Hotel _____ ");
        System.out.println("");
        System.out.print("Ingresar como (Pasajero / Staff): ");
        String tipoUsuario = leer.next();
        if (tipoUsuario.equalsIgnoreCase("Staff")) {

            System.out.println("");
            System.out.println("STAFF");
            System.out.print("Ingrese su puesto: ");
            String rol = leer.next();
            System.out.print("Ingrese su Id: ");
            int idIngresado = leer.nextInt();
            System.out.print("Ingrese su clave de acceso: ");
            String claveIngresada = leer.next();
            leer.nextLine();

            Persona persona = null;

            if (rol.equalsIgnoreCase("Administrador")) {

                Administrador admin1 = new Administrador(1, "Lionel Scaloni", 12345, "Administrador", "contrasenia");

                if (autenticar(admin1, idIngresado, claveIngresada)) {

                    servi.menuAdmin(admin1);

                } else {
                    System.out.println("Contraseña incorrecta.");
                }

            } else if (rol.equalsIgnoreCase("Recepcionista")) {
                persona = new Recepcionista();

                Recepcionista recep1 = new Recepcionista(1, "Lionel Andres", 23456789, "Recepcionista", "123", null);
                Recepcionista recep2 = new Recepcionista(2, "Angel Maria", 23456789, "Recepcionista", "456", null);
                Recepcionista recep3 = new Recepcionista(3, "Emilia Martinez", 23456789, "Recepcionista", "789", null);

                if (autenticar(persona, idIngresado, claveIngresada)) {
                    System.out.println("Bienvenido, " + persona.getNombre());
                    System.out.println("¿Qué haremos hoy?");
                    System.out.println(""); // switch acciones, o ir directo a Registro
                } else {
                    System.out.println("Contraseña incorrecta.");
                }
            } else if (rol.equalsIgnoreCase("Limpieza")) {
                persona = new Limpieza();
                if (autenticar(persona, idIngresado, claveIngresada)) {
                    System.out.println("Bienvenido, " + persona.getNombre());
                    System.out.println("¿Qué haremos hoy?");
                    System.out.println(""); // switch acciones, o ir directo a Registro
                } else {
                    System.out.println("Contraseña incorrecta.");
                }
            }
        } else if (tipoUsuario.equalsIgnoreCase("Pasajero")) {

            Pasajero pasajero = new Pasajero();
            System.out.println("Bienvenido, cómo te llamas?");
            pasajero.setNombre(leer.next());
            System.out.println("Mucho gusto, " + pasajero.getNombre() + ", soy tu recepcionista virtual");
            System.out.println("Qué deseas hacer?");
            System.out.println(""); // switch acciones de reserva, consultas, etc.

        }
    }
}
