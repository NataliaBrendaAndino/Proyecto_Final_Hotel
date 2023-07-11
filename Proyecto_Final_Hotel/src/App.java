import API.ApiMonedas;
import entidades.Recepcionista;
import repositorio.ConectorRepo;
import repositorio.HabitacionRepo;
import repositorio.RecepcionistaRepo;
import servicios.AutenticacionImplementa;
import servicios.HabitacionServicio;

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

        AutenticacionImplementa autentic = new AutenticacionImplementa();
        // autentic.ingresoUsuario();
        ApiMonedas apiMonedas = new ApiMonedas();
        apiMonedas.consumirApiMonedas();

    }
}