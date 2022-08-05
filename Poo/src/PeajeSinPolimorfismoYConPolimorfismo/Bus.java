package PeajeSinPolimorfismoYConPolimorfismo;

public class Bus extends Vehiculo{
    @Override
    public void mostrarTipoVehiculo(){      
        System.out.println("Soy un bus");
        System.out.println("Cobrar peaje bus");
    }
}
