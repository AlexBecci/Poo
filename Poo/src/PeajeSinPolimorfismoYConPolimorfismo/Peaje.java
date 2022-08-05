
package PeajeSinPolimorfismoYConPolimorfismo;

public class Peaje {
    //Metodo para crear peaje para la moto
    public void cobrarPeajeMoto(Moto moto)
    {
        moto.mostrarTipoVehiculo();
    }
    //Metodo para crear peaje para el bus
    public void cobrarPeajeBus(Bus bus)
    {
        bus.mostrarTipoVehiculo();
    }
    //Metodo para crear peaje para el camion
    public void cobrarPeajeCamion(Camion camion)
    {
        camion.mostrarTipoVehiculo();
    }
    //Metodo para crear peaje para el auto
    public void cobrarPeajeAuto(Auto auto)
    {
        auto.mostrarTipoVehiculo();
    }
}
