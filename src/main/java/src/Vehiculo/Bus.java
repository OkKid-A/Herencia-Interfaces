package src.Vehiculo;

import src.Interfaces.Transportable;
import src.Interfaces.TransporteUrbano;

public class Bus extends Vehiculo implements TransporteUrbano {

    public Bus(boolean diesel, int capacidadTanque, int pasajeros, double velocidadMaxima, double aceleracion) {
        super(diesel, capacidadTanque, pasajeros, velocidadMaxima, aceleracion);
    }

    @Override
    public void mostrarFuncionalidad() {
        giroDerecha();
        giroIzquierda();
        transportarGente(super.getPasajeros());
    }

    @Override
    public void giroDerecha() {
        System.out.println("Giro a la derecha");
    }

    @Override
    public void giroIzquierda() {
        System.out.println("Giro a la izquierda");

    }

    @Override
    public void transportarGente(int capacidad) {
        System.out.println("El bus ha transportado a " + capacidad + " pasajeros");
    }
}
