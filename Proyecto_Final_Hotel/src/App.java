import servicios.AutenticacionImplementa;

public class App {
    public static void main(String[] args) throws Exception {

        // Loguearse con los datos del Administrador:
        // (administrador, id= 1, "contrasenia")
        AutenticacionImplementa autentic = new AutenticacionImplementa();
        autentic.ingresoUsuario();

    }
}