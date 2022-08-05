package PeajeSinPolimorfismoYConPolimorfismo;

public class Camion extends Vehiculo {

    @Override
    public void mostrarTipoVehiculo() {
        System.out.println("Soy un camion");
        System.out.println("Cobrar peaje camion");
    }
}
