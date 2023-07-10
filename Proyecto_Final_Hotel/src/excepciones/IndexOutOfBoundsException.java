package excepciones;

public class IndexOutOfBoundsException extends Exception {

    public IndexOutOfBoundsException(String mensaje) {
        super(mensaje);
    }

    @Override
    public String getMessage() {
        return "El número ingresado no es parte de las opciones! Volvé a intentarlo.";
    }

}
