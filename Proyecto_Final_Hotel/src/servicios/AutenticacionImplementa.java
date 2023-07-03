package servicios;

import entidades.Administrador;
import entidades.Limpieza;
import entidades.Pasajero;
import entidades.Persona;
import entidades.Recepcionista;

import java.util.Scanner;

public class AutenticacionImplementa implements Autenticacion {

    Scanner leer = new Scanner(System.in);

    @Override
    public boolean autenticar(Persona persona, int id, String claveAcceso) {

        return persona.getId() == id && persona.getClaveAcceso().equals(claveAcceso);
    }

    public void ingresoUsuario() {

        System.out.println("Benvenidos al Hotel! ");
        System.out.println(""); // switch con opciones (Pasajero / Empleados)
        // ya en opcion Empleados, obtenemos quién es:
        System.out.print("Usted es (Pasajero / Empleado): ");
        String tipoUsuario = leer.next();
        if (tipoUsuario.equalsIgnoreCase("Empleado")) {

            System.out.println("Ingrese su puesto: ");
            String rol = leer.next();
            System.out.print("Ingrese su Id: ");
            int idIngresado = leer.nextInt();
            System.out.print("Ingrese su clave de acceso: ");
            String claveIngresada = leer.next();
            leer.nextLine();

            Persona persona = null;

            if (rol.equalsIgnoreCase("Administrador")) {
                persona = new Administrador();
                if (autenticar(persona, idIngresado, claveIngresada)) {
                    System.out.println("Bienvenido, " + persona.getNombre());
                    System.out.println("¿Qué haremos hoy?");
                    System.out.println(""); // switch acciones, o ir directo a Registro
                } else {
                    System.out.println("Contraseña incorrecta.");
                }
            } else if (rol.equalsIgnoreCase("Recepcionista")) {
                persona = new Recepcionista();
                if (autenticar(persona, idIngresado, claveIngresada)) {
                    System.out.println("Bienvenido, " + persona.getNombre());
                    System.out.println("¿Qué haremos hoy?");
                    System.out.println(""); // switch acciones, o ir directo a Registro
                } else {
                    System.out.println("Contraseña incorrecta.");
                }
            } else if (rol.equalsIgnoreCase("EmpleadoLimpieza")) {
                persona = new Limpieza();
                if (autenticar(persona, idIngresado, claveIngresada)) {
                    System.out.println("Bienvenido, " + persona.getNombre());
                    System.out.println("¿Qué haremos hoy?");
                    System.out.println(""); // switch acciones, o ir directo a Registro
                } else {
                    System.out.println("Contraseña incorrecta.");
                }
            } else {
                System.out.println("Ups! Puesto incorrecto.");
            }
        } else if (tipoUsuario.equalsIgnoreCase("Pasajero")) {

            Pasajero persona = new Pasajero();
            System.out.println("Bienvenido!");

        }
    }

}
