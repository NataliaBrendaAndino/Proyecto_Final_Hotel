package servicios;

import java.util.ArrayList;
import java.util.Scanner;

import entidades.Limpieza;
import entidades.Recepcionista;

public class AdminServicio {

    Scanner leer = new Scanner(System.in);
    ArrayList<Recepcionista> recepcionistas = new ArrayList<>();
    ArrayList<Limpieza> empleadosLimpieza = new ArrayList<>();

    public ArrayList<Recepcionista> crearRecepcionistas(ArrayList<Recepcionista> recepcionistas) {

        System.out.print("Ingrese la cantidad de recepcionistas: ");
        int cantidadRecepcionistas = leer.nextInt();
        leer.nextLine();

        for (int i = 1; i <= cantidadRecepcionistas; i++) {
            Recepcionista recepcionista = new Recepcionista();

            System.out.println("Ingrese los datos del recepcionista " + i + ":");
            recepcionista.setRol("Recepcionista");
            System.out.print("Id: ");
            recepcionista.setId(leer.nextInt());
            leer.nextLine();
            System.out.print("Nombre: ");
            recepcionista.setNombre(leer.nextLine());
            System.out.print("DNI: ");
            recepcionista.setDni(leer.nextInt());
            leer.nextLine();
            System.out.println(
                    "Clave de acceso será igual que el DNI la primera vez, y luego el empleado podrá cambiarla.");
            String dniAString = String.valueOf(recepcionista.getDni());
            recepcionista.setClaveAcceso(dniAString);

            recepcionistas.add(recepcionista);
        }

        return recepcionistas;
    }

    public ArrayList<Limpieza> crearEmpleadosLimpieza(ArrayList<Limpieza> empleadosLimpieza) {

        System.out.print("Ingrese la cantidad de empleados de limpieza: ");
        int cantidadEmpleadosLimpieza = leer.nextInt();
        leer.nextLine();

        for (int i = 1; i <= cantidadEmpleadosLimpieza; i++) {
            Limpieza limpieza = new Limpieza();

            System.out.println("Ingrese los datos del empleado de limpieza " + i + ":");
            limpieza.setRol("Recepcionista");
            System.out.print("Id: ");
            limpieza.setId(leer.nextInt());
            leer.nextLine();
            System.out.print("Nombre: ");
            limpieza.setNombre(leer.nextLine());
            leer.nextLine();
            System.out.print("DNI: ");
            limpieza.setDni(leer.nextInt());
            leer.nextLine();
            System.out.println(
                    "Clave de acceso será igual que el DNI la primera vez, y luego el empleado podrá cambiarla.");
            String dniAString = String.valueOf(limpieza.getDni());
            limpieza.setClaveAcceso(dniAString);

            empleadosLimpieza.add(limpieza);
        }

        return empleadosLimpieza;
    }

    public void mostrarRecepcionistas(ArrayList<Recepcionista> recepcionistas) {

        for (Recepcionista recepcionista : recepcionistas) {

            System.out.println(recepcionista.toString());

        }
    }

    public void mostrarLimpiezas(ArrayList<Limpieza> empleadosLimpieza) {

        for (Limpieza limpieza : empleadosLimpieza) {
            System.out.println(limpieza.toString());
        }

    }
}
