package servicios;

import entidades.Persona;
import excepciones.WrongPasswordException;

public interface Autenticacion {

    public boolean autenticar(Persona persona, int id, String claveAcceso) throws WrongPasswordException;
}
