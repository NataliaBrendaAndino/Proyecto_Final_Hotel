import entidades.Recepcionista;
import servicios.AutenticacionImplementa;

public class App {
    public static void main(String[] args) throws Exception {

        // Loguearse como ADMINISTRADOR:
        // (administrador, id= 1, "contrasenia")

        // Loguearse como RECEPCIONISTA:
        // (recepcionista, id=1, "123")

        // loguearse como LIMPIEZA:
        // (limpieza, id=1, "arco")

        AutenticacionImplementa autentic = new AutenticacionImplementa();
        autentic.ingresoUsuario();

    }
}