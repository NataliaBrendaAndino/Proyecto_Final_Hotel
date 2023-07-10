package excepciones;

public class OpcionIncorrectaException extends Exception {
    public OpcionIncorrectaException(String mensaje) {
        super(mensaje);
    }

    @Override
    public String getMessage() {
        return "** Ups, eso no esta entre las opciones! Volvé a intentarlo. **";
    }

}
