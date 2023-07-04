package entidades;

import java.util.Date;

public class Reserva {
    private int id;
    private boolean reserva;
    private Integer saldo; // lo que debe
    private Date fechaReserva;

    public Reserva() {

    }

    public Reserva(int id, boolean reserva, Integer saldo, Date fechaReserva) {
        this.id = id;
        this.reserva = reserva;
        this.saldo = saldo;
        this.fechaReserva = fechaReserva;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isReserva() {
        return reserva;
    }

    public void setReserva(boolean reserva) {
        this.reserva = reserva;
    }

    public Integer getSaldo() {
        return saldo;
    }

    public void setSaldo(Integer saldo) {
        this.saldo = saldo;
    }

    public Date getFechaReserva() {
        return fechaReserva;
    }

    public void setFechaReserva(Date fechaReserva) {
        this.fechaReserva = fechaReserva;
    }

}
