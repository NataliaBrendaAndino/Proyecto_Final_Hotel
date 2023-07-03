package entidades;

import java.time.LocalDateTime;

public class Limpieza extends Persona {
    private LocalDateTime ingreso;

    public Limpieza() {

    }

    public Limpieza(int id, String nombre, int dni, String rol, String claveAcceso) {
        super(id, nombre, dni, rol, claveAcceso);
        this.ingreso = null;
    }

    public LocalDateTime getIngreso() {
        return ingreso;
    }

    public void setIngreso(LocalDateTime ingreso) {
        this.ingreso = ingreso;
    }

}
