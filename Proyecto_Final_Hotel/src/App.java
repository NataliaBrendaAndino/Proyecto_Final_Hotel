<<<<<<< HEAD:Proyecto_Final_Hotel/src/App.java
import entidades.*;
import servicios.*;
=======
package main;

import java.util.ArrayList;

import entidades.Administrador;
import entidades.Persona;
import servicios.AutenticacionImplementa;
>>>>>>> 4d1c24bf72d232332d499c7cfdb02d2680812c67:Proyecto_Final_Hotel/src/main/App.java

public class App {
    public static void main(String[] args) throws Exception {

        // primer arrayList de empleados, solo con el Admin cargado:
        Administrador admin1 = new Administrador(1, "Roberto", 12345, "Administrador", "contrasenia");
        ArrayList<Persona> empleados = new ArrayList<>();
        empleados.add(admin1);

        AutenticacionImplementa autentic = new AutenticacionImplementa();
        autentic.ingresoUsuario(empleados);

    }
}