package src.Vehiculo;

import src.Interfaces.Turbo;

public class F1 extends Vehiculo implements Turbo {

    public F1(boolean diesel, int capacidadTanque, int pasajeros, double velocidadMaxima, double aceleracion) {
        super(diesel, capacidadTanque, pasajeros, velocidadMaxima, aceleracion);
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
    public void mostrarFuncionalidad() {
        giroDerecha();
        giroIzquierda();
        triplicar(super.getAceleracion());
    }

    @Override
    public void triplicar(double aceleracion) {
        System.out.println("Se ha activado el turbo y la aceleracion a aumentado a " + aceleracion);
    }
}
