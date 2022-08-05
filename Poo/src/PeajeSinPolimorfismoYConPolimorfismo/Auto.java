package PeajeSinPolimorfismoYConPolimorfismo;

public class Auto extends Vehiculo  {
    
    @Override
    public void mostrarTipoVehiculo()
    {
        System.out.println("Soy un auto");
        System.out.println("Cobrar peaje auto");
    }
}
