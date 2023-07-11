package servicios;

import entidades.Administrador;
import entidades.Limpieza;
import entidades.Pasajero;
import entidades.Persona;
import entidades.Recepcionista;
import excepciones.WrongPasswordException;
import excepciones.OpcionIncorrectaException;

import java.util.ArrayList;
import java.util.Scanner;

import API.ApiMonedas;

public class AutenticacionImplementa implements Autenticacion {

    Scanner leer = new Scanner(System.in);
    AdminServicio servi = new AdminServicio();
    RecepcionServicio recepServi = new RecepcionServicio();
    LimpiezaServicio limpiServi = new LimpiezaServicio();
    RegistroImplementa regiImple = new RegistroImplementa();

    @Override
    public boolean autenticar(Persona persona, int id, String claveAcceso) throws WrongPasswordException {
        if (persona.getId() == id && persona.getClaveAcceso().equals(claveAcceso)) {
            return true;
        } else {
            throw new WrongPasswordException("** Contrasenia incorrecta! Volvé a intentarlo **");
        }
    }

    public void ingresoUsuario() throws OpcionIncorrectaException {

        System.out.println("_____ Bienvenidos al Hotel _____ ");
        System.out.println("");

        boolean opcionValida = false;
        do {
            try {
                System.out.print("Ingresar como (Pasajero / Staff): ");
                String tipoUsuario = leer.next();
                if (!tipoUsuario.equalsIgnoreCase("Pasajero") && !tipoUsuario.equalsIgnoreCase("Staff")) {
                    throw new OpcionIncorrectaException("Ups, eso no está entre las opciones! Volvé a intentarlo.");
                }
                opcionValida = true;

                if (tipoUsuario.equalsIgnoreCase("Staff")) {
                    boolean autenticado = false;
                    while (!autenticado) {
                        System.out.println("");
                        System.out.println("STAFF");
                        System.out.print("Ingrese su puesto: ");
                        String rol = leer.next();
                        System.out.print("Ingrese su Id: ");
                        int idIngresado = leer.nextInt();
                        System.out.print("Ingrese su clave de acceso: ");
                        String claveIngresada = leer.next();
                        leer.nextLine();

                        Persona persona = null;

                        if (rol.equalsIgnoreCase("Administrador")) {

                            Administrador admin1 = new Administrador(1, "Lionel Scaloni", 12345, "Administrador",
                                    "contrasenia");
                            try {
                                autenticado = autenticar(admin1, idIngresado, claveIngresada);
                                if (autenticado) {
                                    servi.menuAdmin(admin1);
                                }
                            } catch (WrongPasswordException e) {
                                System.out.println("");
                                System.out.println(e.getMessage());
                            }

                        } else if (rol.equalsIgnoreCase("Recepcionista")) {
                            persona = new Recepcionista();
                            Recepcionista recep1 = new Recepcionista(1, "Lionel Andres", 23456789, "Recepcionista",
                                    "123");

                            try {
                                autenticado = autenticar(recep1, idIngresado, claveIngresada);
                                if (autenticado) {
                                    recepServi.menuRecepcion(recep1);

                                }
                            } catch (WrongPasswordException e) {
                                System.out.println(e.getMessage());
                            }

                        } else if (rol.equalsIgnoreCase("Limpieza")) {

                            // persona = new Limpieza();
                            Limpieza limpi1 = new Limpieza(1, "Emilia Martinez", 23456789, "Limpieza", "arco");
                            try {
                                autenticado = autenticar(limpi1, idIngresado, claveIngresada);
                                if (autenticado) {
                                    limpiServi.menuLimpieza(limpi1);
                                }
                            } catch (WrongPasswordException e) {
                                System.out.println(e.getMessage());
                            }
                        }
                    }

                } else if (tipoUsuario.equalsIgnoreCase("Pasajero")) {

                    System.out.println("");

                    Pasajero pasajero = new Pasajero();
                    System.out.println("* * *");
                    System.out.println("PASAJEROS");
                    System.out.println("Bienvenido, cómo te llamas?");
                    pasajero.setNombre(leer.next());
                    System.out
                            .println("Mucho gusto, " + pasajero.getNombre() + ", soy tu recepcionista virtual");
                    System.out.println("");
                    System.out.println("¿Qué deseas hacer?");
                    System.out.println("1. Tomar reserva");
                    System.out.println("2. Consultar dolar");
                    int menu = leer.nextInt();
                    switch (menu) {
                        case 1:
                            regiImple.tomarReserva();
                            break;
                        case 2:
                            ApiMonedas apiMonedas = new ApiMonedas();
                            apiMonedas.consumirApiMonedas();
                            break;
                        default:
                            throw new IndexOutOfBoundsException("Opción inválida.");
                    }

                }

            } catch (OpcionIncorrectaException e) {
                System.out.println("");
                System.out.println(e.getMessage());
                System.out.println("");
            }
        } while (!opcionValida);

    }

}
