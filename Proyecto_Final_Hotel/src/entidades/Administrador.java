package entidades;

public class Administrador extends Persona {

    private String claveAcceso;

    public Administrador() {

    }

    public Administrador(int id, String nombre, int dni, String claveAcceso) {
        super(id, nombre, dni);
        this.claveAcceso = claveAcceso;
    }

    public String getClaveAcceso() {
        return claveAcceso;
    }

    public void setClaveAcceso(String claveAcceso) {
        this.claveAcceso = claveAcceso;
    }

}
