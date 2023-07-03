package entidades;

public class Administrador extends Persona {

    public Administrador() {

    }

    public Administrador(int id, String nombre, int dni, String rol, String claveAcceso) {
        super(id, nombre, dni, rol, claveAcceso);

    }

    public String getClaveAcceso() {
        return claveAcceso;
    }

    public void setClaveAcceso(String claveAcceso) {
        this.claveAcceso = claveAcceso;
    }

}
