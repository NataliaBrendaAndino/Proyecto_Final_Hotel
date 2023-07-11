import entidades.Recepcionista;
import repositorio.ConectorRepo;
import servicios.AutenticacionImplementa;

public class App {
    public static void main(String[] args) throws Exception {

        // Loguearse como ADMINISTRADOR:
        // (administrador, id= 1, "contrasenia")

        // Loguearse como RECEPCIONISTA:
        // (recepcionista, id=1, "123")

        // loguearse como LIMPIEZA:
        // (limpieza, id=1, "arco")

        // pasajero
        // id= su dni, clave por defecto= "321"

        ConectorRepo repo = new ConectorRepo();
        // repo.crearBaseDatos();
        // repo.crearTablaPersona();
        // repo.crearTablaPasajero();
        // repo.crearTablaAdministrador();
        // repo.crearTablaLimpieza();
        // repo.crearTablaRecepcionista();
        // repo.crearTablaHistorial();
        // repo.crearTablaReserva();
        // repo.crearTablaHabitacion();

        AutenticacionImplementa autentic = new AutenticacionImplementa();
        autentic.ingresoUsuario();

    }
}