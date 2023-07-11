package servicios;

import java.util.ArrayList;
import java.util.Scanner;

import entidades.Limpieza;
import entidades.Persona;
import entidades.Recepcionista;

import excepciones.IndexOutOfBoundsException;
import repositorio.LimpiezaRepo;
import repositorio.RecepcionistaRepo;

public class AdminServicio {

    private ArrayList<Persona> empleados;

    Scanner leer = new Scanner(System.in);

    RecepcionistaRepo recepcionistaRepo = new RecepcionistaRepo();
    LimpiezaRepo limpiezaRepo = new LimpiezaRepo();

    public AdminServicio() {
        empleados = new ArrayList<>();
    }

    public ArrayList<Persona> getEmpleados() {
        return empleados;
    }

    public void setEmpleados(ArrayList<Persona> empleados) {
        this.empleados = empleados;
    }

    public void menuAdmin(Persona persona) {

        boolean volverAlMenu = true;
        System.out.println("");
        System.out.println("* * *");
        System.out.println("ADMINISTRACION");
        System.out.println("Bienvenido, " + persona.getNombre());
        System.out.println("¿Qué haremos hoy?");

        while (volverAlMenu) {

            System.out.println("");
            System.out.println("1 | Ingresar nuevo recepcionista");
            System.out.println("2 | Mostrar recepcionistas con JDBC");
            System.out.println("3 | Ingresar nuevo empleado de limpieza");
            System.out.println("4 | Mostrar empleados de limpieza");
            System.out.println("5 | Ver todos los empleados");
            System.out.println("0 | Salir");
            int opcion = leer.nextInt();

            try {
                leer.nextLine();
                System.out.println("");

                switch (opcion) {
                    case 1:
                        crearRecepcionistas();
                        break;

                    case 2:
                        mostrarRecepcionistasJDBC();
                        break;

                    case 3:
                        crearEmpleadosLimpieza();
                        break;

                    case 4:
                        mostrarLimpiezas();
                        break;

                    case 5:
                        verTodosEmpleados();
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

    public void crearRecepcionistas() {

        System.out.println("1 | RECEPCIONISTAS");
        System.out.print("Cantidad de recepcionistas a ingresar: ");
        int cantidadRecepcionistas = leer.nextInt();

        for (int i = 1; i <= cantidadRecepcionistas; i++) {

            Recepcionista recepcionista = new Recepcionista();
            System.out.println("");
            System.out.println("--> Datos del Recepcionista " + i + ":");
            recepcionista.setRol("Recepcionista");
            System.out.print("Id: ");
            recepcionista.setId(leer.nextInt());
            leer.nextLine();
            System.out.print("Nombre: ");
            recepcionista.setNombre(leer.nextLine());
            System.out.print("DNI: ");
            recepcionista.setDni(leer.nextInt());
            leer.nextLine();
            System.out.println("");
            System.out.println("|| Datos del Recepcionista cargados exitosamente.");
            System.out.println(
                    "  (La clave de acceso del Recepcionista será igual que el DNI la primera vez, y luego el empleado podrá cambiarla.) ||");
            System.out.println("");
            String dniAString = String.valueOf(recepcionista.getDni());
            recepcionista.setClaveAcceso(dniAString);
            recepcionistaRepo.persistirRecepcionista(recepcionista);

            empleados.add(recepcionista);
        }
    }

    public void crearEmpleadosLimpieza() {

        System.out.println("3 | EMPLEADOS DE LIMPIEZA");
        System.out.print("Cantidad de empleados de limpieza a ingresar: ");
        int cantidadEmpleadosLimpieza = leer.nextInt();
        leer.nextLine();

        for (int i = 1; i <= cantidadEmpleadosLimpieza; i++) {

            Limpieza limpieza = new Limpieza();
            System.out.println("");
            System.out.println("--> Datos del Empleado de limpieza " + i + ":");
            limpieza.setRol("Limpieza");
            System.out.print("Id: ");
            limpieza.setId(leer.nextInt());
            leer.nextLine();
            System.out.print("Nombre: ");
            limpieza.setNombre(leer.nextLine());
            System.out.print("DNI: ");
            limpieza.setDni(leer.nextInt());
            leer.nextLine();
            System.out.println("");
            System.out.println("|| Datos del Empleado de Limpieza cargados exitosamente.");
            System.out.println(
                    "   (La clave de acceso del Empleado de Limpieza será igual que el DNI la primera vez, y luego el empleado podrá cambiarla.) ||");
            System.out.println("");
            String dniAString = String.valueOf(limpieza.getDni());
            limpieza.setClaveAcceso(dniAString);
            limpiezaRepo.persistirLimpieza(limpieza);

            empleados.add(limpieza);
        }
    }

    public void mostrarRecepcionistas() {

        System.out.println("2 | RECEPCION ");
        for (Persona persona : empleados) {
            if (persona instanceof Recepcionista) {
                System.out.println(persona.toString());
            }
        }
    }

    public void mostrarRecepcionistasJDBC() {
        RecepcionistaRepo recepcionistaRepo = new RecepcionistaRepo();
        recepcionistaRepo.mostrarRecepcionistas();
    }

    public void mostrarLimpiezas() {

        System.out.println("4 | LIMPIEZA");
        for (Persona persona : empleados) {
            if (persona instanceof Limpieza) {
                System.out.println(persona.toString());
            }
        }
    }

    public void verTodosEmpleados() {

        ArrayList<Recepcionista> recepcionistas = new ArrayList<>();
        ArrayList<Limpieza> empleadosLimpieza = new ArrayList<>();

        for (Persona persona : empleados) {
            if (persona instanceof Recepcionista) {
                recepcionistas.add((Recepcionista) persona);
            } else if (persona instanceof Limpieza) {
                empleadosLimpieza.add((Limpieza) persona);
            }
        }

        System.out.println("5 | LISTA DE EMPLEADOS");
        System.out.println("Recepcionistas:");
        for (Recepcionista recepcionista : recepcionistas) {
            if (empleadosLimpieza == null) {
                System.out.println("No hay empleados de limpieza ingresados");
            } else {
                System.out.println(recepcionistas.toString());
            }
        }

        System.out.println("Empleados de Limpieza:");
        for (Limpieza empleadoLimpieza : empleadosLimpieza) {
            if (empleadosLimpieza == null) {
                System.out.println("No hay empleados de limpieza ingresados");
            } else {
                System.out.println(empleadoLimpieza.toString());
            }
        }
    }
}
