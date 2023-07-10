package entidades;

public class Habitacion {
    private int id;
    private int numHabitacion;
    private boolean disponible;
    private boolean limpieza;
    private boolean desinfeccion;
    private Reserva reserva;

    public Habitacion() {

    }

    public Habitacion(int id, int numHabitacion, boolean disponible, boolean limpieza, boolean desinfeccion,
            Reserva reserva) {
        this.id = id;
        this.numHabitacion = numHabitacion;
        this.disponible = true;
        this.limpieza = limpieza;
        this.desinfeccion = desinfeccion;
        this.reserva = reserva;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNumHabitacion() {
        return numHabitacion;
    }

    public void setNumHabitacion(int numHabitacion) {
        this.numHabitacion = numHabitacion;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    public boolean isLimpieza() {
        return limpieza;
    }

    public void setLimpieza(boolean limpieza) {
        this.limpieza = limpieza;
    }

    public boolean isDesinfeccion() {
        return desinfeccion;
    }

    public void setDesinfeccion(boolean desinfeccion) {
        this.desinfeccion = desinfeccion;
    }

    public Reserva getReserva() {
        return reserva;
    }

    public void setReserva(Reserva reserva) {
        this.reserva = reserva;
    }

}
