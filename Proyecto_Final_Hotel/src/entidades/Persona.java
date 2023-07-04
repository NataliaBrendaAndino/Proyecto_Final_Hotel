package entidades;

public abstract class Persona {
    protected int id;
    protected String nombre;
    protected int dni;
    protected String rol;
    protected String claveAcceso;

    public Persona() {
    }

    public Persona(int id, String nombre, int dni, String rol, String claveAcceso) {
        this.id = id;
        this.nombre = nombre;
        this.dni = dni;
        this.rol = rol;
        this.claveAcceso = claveAcceso;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public String getClaveAcceso() {
        return claveAcceso;
    }

    public void setClaveAcceso(String claveAcceso) {
        this.claveAcceso = claveAcceso;
    }

    @Override
    public String toString() {
        return "Persona [id= " + id + ", nombre= " + nombre + ", dni= " + dni + ", rol= " + rol + "clave de acceso: "
                + claveAcceso + " ]";
    }

}
