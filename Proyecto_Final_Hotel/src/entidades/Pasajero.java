package entidades;

import java.util.ArrayList;

public class Pasajero extends Persona {
    private String nacionalidad;
    private String domicilioOrigen;
    private ArrayList<Historial> historial;

    public Pasajero() {

    }

    public Pasajero(int id, String nombre, int dni, String rol, String claveAcceso, String nacionalidad,
            String domicilioOrigen,
            ArrayList<Historial> historial) {
        super(id, nombre, dni, rol, claveAcceso);
        this.nacionalidad = nacionalidad;
        this.domicilioOrigen = domicilioOrigen;
        this.historial = new ArrayList<Historial>();
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public String getDomicilioOrigen() {
        return domicilioOrigen;
    }

    public void setDomicilioOrigen(String domicilioOrigen) {
        this.domicilioOrigen = domicilioOrigen;
    }

    public ArrayList<Historial> getHistorial() {
        return historial;
    }

    public void setHistorial(ArrayList<Historial> historial) {
        this.historial = historial;
    }

}
