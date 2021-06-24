package src.Vehiculo;

import src.Interfaces.Transportable;

public class Camion extends Vehiculo implements Transportable {

    private String origen;
    private String destino;

    public Camion(boolean diesel, int capacidadTanque, int pasajeros, double velocidadMaxima, double aceleracion, String origen, String destino) {
        super(diesel, capacidadTanque, pasajeros, velocidadMaxima, aceleracion);
        this.origen = origen;
        this.destino = destino;
    }

    @Override
    public void mostrarFuncionalidad() {
        giroDerecha();
        giroIzquierda();
        transportar(origen, destino);
    }

    @Override
    public void transportar(String origen, String destino) {
        System.out.println("Este camion cargara en " + origen + " y entregara en " + destino);
    }
}
