package servicios;

import entidades.Persona;

public interface Autenticacion {

    public boolean autenticar(Persona persona, int id, String claveAcceso);
}
