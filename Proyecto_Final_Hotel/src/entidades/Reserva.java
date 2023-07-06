package entidades;

import java.util.Date;

public class Reserva {
    private int id;
    private boolean reserva;
    private Integer saldo; // lo que debe
    private Date fechaReservaIngreso;
    private Date fechaReservaSalida;

    public Reserva() {

    }

    public Reserva(int id, boolean reserva, Integer saldo, Date fechaReservaIngreso, Date fechaReservaSalida) {
        this.id = id;
        this.reserva = reserva;
        this.saldo = saldo;
        this.fechaReservaIngreso = fechaReservaIngreso;
        this.fechaReservaSalida = fechaReservaSalida;
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

    public Date getFechaReservaIngreso() {
        return fechaReservaIngreso;
    }

    public void setFechaReservaIngreso(Date fechaReservaIngreso) {
        this.fechaReservaIngreso = fechaReservaIngreso;
    }

    public Date getFechaReservaSalida() {
        return fechaReservaSalida;
    }

    public void setFechaReservaSalida(Date fechaReservaSalida) {
        this.fechaReservaSalida = fechaReservaSalida;
    }

}
