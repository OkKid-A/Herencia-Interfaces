package src.ListadoVehiculos;

import src.Vehiculo.Bus;
import src.Vehiculo.Camion;
import src.Vehiculo.F1;
import src.Vehiculo.Vehiculo;

import java.util.Random;

public class ListaVehiculos {

    private Vehiculo[] listado;

    public ListaVehiculos(){
        crearListado();
        mostrarListado();
    }

    public void crearListado(){
        listado = new Vehiculo[20];
        for (int k = 0; k < listado.length;k++){
            listado[k] = seleccionarVehiculo();
        }
    }
    public void mostrarListado(){
        for (int k = 0; k < listado.length;k++){
            mostrarTipo(listado[k]);
            listado[k].mostrarFuncionalidad();
        }
    }

    public void mostrarTipo(Vehiculo vehiculo){
        if (vehiculo instanceof F1){
            System.out.println("\nEl vehiculo es un Formula 1 listo para carreras");
        } else if (vehiculo instanceof Camion){
            System.out.println("\nEl vehiculo es  un Camion de carga listo para transportar");
        } else if (vehiculo instanceof Bus){
            System.out.println("\nEl vehiculo es un Bus Urbano");
        }
    }

    public Vehiculo seleccionarVehiculo(){
        Random random = new Random();
        int opcion = random.nextInt(3);
        switch (opcion){
            case 0:
                return new Bus(true,50,20,10,250);
            case 1:
                return new F1(true,50,4,10,250);
            case 2:
                return new Camion(true,50,4,10,250,"Xela","Capital");
            default:
                return null;
        }
    }
}
