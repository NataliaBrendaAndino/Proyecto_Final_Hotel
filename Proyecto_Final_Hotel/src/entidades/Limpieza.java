package entidades;

import java.time.LocalDateTime;

public class Limpieza extends Persona {
    private LocalDateTime ingreso;

    public Limpieza() {

    }

    public Limpieza(int id, String nombre, int dni) {
        super(id, nombre, dni);
        this.ingreso = null;
    }

    public LocalDateTime getIngreso() {
        return ingreso;
    }

    public void setIngreso(LocalDateTime ingreso) {
        this.ingreso = ingreso;
    }

}
