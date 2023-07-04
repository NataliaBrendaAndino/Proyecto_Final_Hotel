package entidades;

import java.sql.Date;

public class Historial {
    private int id;
    private Date fechaEstadia;
    private String habitacionOcupada; // que habitación ocupó en su estadía
    private String observaciones;

    public Historial() {

    }

    public Historial(int id, Date fechaEstadia, String habitacionOcupada, String observaciones) {
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

    public Date getFechaEstadia() {
        return fechaEstadia;
    }

    public void setFechaEstadia(Date fechaEstadia) {
        this.fechaEstadia = fechaEstadia;
    }

    public String getHabitacionOcupada() {
        return habitacionOcupada;
    }

    public void setHabitacionOcupada(String habitacionOcupada) {
        this.habitacionOcupada = habitacionOcupada;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

}
