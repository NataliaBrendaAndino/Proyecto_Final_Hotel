package entidades;

public class Historial {
    private int id;
    private String fechaEstadia;
    private int habitacionOcupada; // que habitación ocupó en su estadía
    private String observaciones;

    public Historial() {

    }

    public Historial(int id, String fechaEstadia, int habitacionOcupada, String observaciones) {
        this.id = id;
        this.fechaEstadia = fechaEstadia;
        this.habitacionOcupada = habitacionOcupada;
        this.observaciones = observaciones;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFechaEstadia() {
        return fechaEstadia;
    }

    public void setFechaEstadia(String fechaEstadia) {
        this.fechaEstadia = fechaEstadia;
    }

    public int getHabitacionOcupada() {
        return habitacionOcupada;
    }

    public void setHabitacionOcupada(int habitacionOcupada) {
        this.habitacionOcupada = habitacionOcupada;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

}
