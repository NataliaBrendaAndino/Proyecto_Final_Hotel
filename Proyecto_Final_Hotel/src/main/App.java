package main;

import entidades.Administrador;
import servicios.AutenticacionImplementa;

public class App {
    public static void main(String[] args) throws Exception {

        // empleado demo:
        Administrador admin1 = new Administrador(1, "Roberto", 12345, "Administrador", "contrasenia");

        AutenticacionImplementa autentic = new AutenticacionImplementa();
        autentic.ingresoUsuario();
    }
}
