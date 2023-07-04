package servicios;

import java.util.ArrayList;
import java.util.Scanner;

import entidades.Limpieza;
import entidades.Recepcionista;

public class AdminServicio {

    Scanner leer = new Scanner(System.in);

    public ArrayList<Recepcionista> crearRecepcionistas() {
        ArrayList<Recepcionista> recepcionistas = new ArrayList<>();

        System.out.print("Ingrese la cantidad de recepcionistas: ");
        int cantidadRecepcionistas = leer.nextInt();
        leer.nextLine();

        for (int i = 1; i <= cantidadRecepcionistas; i++) {
            Recepcionista recepcionista = new Recepcionista();

            System.out.println("Ingrese los datos del recepcionista " + i + ":");
            recepcionista.setRol("Recepcionista");
            System.out.print("Id: ");
            recepcionista.setId(leer.nextInt());
            System.out.print("Nombre: ");
            recepcionista.setNombre(leer.nextLine());
            System.out.println("DNI: ");
            recepcionista.setDni(leer.nextInt());
            System.out.println(
                    "Clave de acceso será igual que el DNI la primera vez, y luego el empleado podrá cambiarla.");
            String dniAString = String.valueOf(recepcionista.getDni());
            recepcionista.setClaveAcceso(dniAString);

            recepcionistas.add(recepcionista);
        }

        return recepcionistas;
    }

    public ArrayList<Limpieza> crearEmpleadosLimpieza() {
        ArrayList<Limpieza> empleadosLimpieza = new ArrayList<>();

        System.out.print("Ingrese la cantidad de empleados de limpieza: ");
        int cantidadEmpleadosLimpieza = leer.nextInt();
        leer.nextLine();

        for (int i = 1; i <= cantidadEmpleadosLimpieza; i++) {
            Limpieza limpieza = new Limpieza();

            System.out.println("Ingrese los datos del empleado de limpieza " + i + ":");
            limpieza.setRol("Recepcionista");
            System.out.print("Id: ");
            limpieza.setId(leer.nextInt());
            System.out.print("Nombre: ");
            limpieza.setNombre(leer.nextLine());
            System.out.println("DNI: ");
            limpieza.setDni(leer.nextInt());
            System.out.println(
                    "Clave de acceso será igual que el DNI la primera vez, y luego el empleado podrá cambiarla.");
            String dniAString = String.valueOf(limpieza.getDni());
            limpieza.setClaveAcceso(dniAString);

            empleadosLimpieza.add(limpieza);
        }

        return empleadosLimpieza;
    }
}
