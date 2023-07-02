package entidades;

import java.time.LocalDateTime;

public class Recepcionista extends Persona {
    private LocalDateTime ingreso;

    public Recepcionista() {

    }

    public Recepcionista(int id, String nombre, int dni, LocalDateTime ingreso) {
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
