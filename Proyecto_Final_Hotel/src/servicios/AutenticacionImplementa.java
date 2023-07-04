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

    @Override
    public boolean autenticar(Persona persona, int id, String claveAcceso) {

        return persona.getId() == id && persona.getClaveAcceso().equals(claveAcceso);
    }

    public void ingresoUsuario(ArrayList<Persona> empleados) {

        System.out.println("Benvenidos al Hotel! ");
        System.out.println(""); // switch con opciones (Pasajero / Empleados)
        // ya en opcion Empleados, obtenemos quién es:
        System.out.print("Usted es (Pasajero / Staff): ");
        String tipoUsuario = leer.next();
        if (tipoUsuario.equalsIgnoreCase("Staff")) {

            System.out.print("Ingrese su puesto: ");
            String rol = leer.next();
            System.out.print("Ingrese su Id: ");
            int idIngresado = leer.nextInt();
            System.out.print("Ingrese su clave de acceso: ");
            String claveIngresada = leer.next();
            leer.nextLine();

            Persona persona = null;

            if (rol.equalsIgnoreCase("Administrador")) {
                persona = empleados.get(0);
                if (autenticar(persona, idIngresado, claveIngresada)) {

                    boolean volverAlMenu = true;
                    while (volverAlMenu) {

                        System.out.println("");
                        System.out.println("Bienvenido, " + persona.getNombre());
                        System.out.println("¿Qué haremos hoy?");
                        System.out.println("1. Ingresar nuevo recepcionista");
                        System.out.println("2. Mostrar recepcionistas");
                        System.out.println("3. Ingresar nuevo empleado de limpieza");
                        System.out.println("4. Mostrar empleados de limpieza");
                        System.out.println("5. Salir");
                        int opcion = leer.nextInt();

                        AdminServicio administradorServicio = new AdminServicio();
                        ArrayList<Recepcionista> recepcionistas = new ArrayList<>();
                        ArrayList<Limpieza> empleadosLimpieza = new ArrayList<>();

                        switch (opcion) {
                            case 1:
                                System.out.println("1.Ingresar nuevo recepcionista: ");
                                administradorServicio.crearRecepcionistas(recepcionistas);
                                break;

                            case 2:
                                System.out.println("2. Mostrando recepcionistas: \n");
                                administradorServicio.mostrarRecepcionistas(recepcionistas);
                                break;

                            case 3:
                                System.out.println("3. Ingresar nuevo empleado de limpieza: ");
                                administradorServicio.crearEmpleadosLimpieza(empleadosLimpieza);
                                break;

                            case 4:
                                System.out.println("4. Mostrando los empleados de limpieza: ");
                                administradorServicio.mostrarLimpiezas(empleadosLimpieza);
                                break;

                            case 5:
                                System.out.println("5. Saliendo...");
                                System.out.println("Adiós!");
                                volverAlMenu = false;
                                break;
                        }
                    }
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
