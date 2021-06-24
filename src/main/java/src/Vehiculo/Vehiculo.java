package src.Vehiculo;

import src.Interfaces.Giro;

public abstract class Vehiculo implements Giro {

    private boolean diesel;
    private int capacidadTanque;
    private int pasajeros;
    private double velocidadMaxima;
    private double aceleracion;

    public Vehiculo(boolean diesel, int capacidadTanque, int pasajeros, double velocidadMaxima, double aceleracion) {
        this.diesel = diesel;
        this.capacidadTanque = capacidadTanque;
        this.pasajeros = pasajeros;
        this.velocidadMaxima = velocidadMaxima;
        this.aceleracion = aceleracion;
    }

    public abstract void mostrarFuncionalidad();

    @Override
    public void giroDerecha() {
        System.out.println("Giro a la derecha");
    }

    @Override
    public void giroIzquierda() {
        System.out.println("Giro a la izquierda");
    }

    public int getPasajeros() {
        return pasajeros;
    }

    public double getAceleracion() {
        return aceleracion;
    }
}