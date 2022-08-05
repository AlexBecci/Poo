
package PeajeSinPolimorfismoYConPolimorfismo;

public class TestPeajeSinPolimorfismo {
    public static void main(String[] args) {
        //declaro objetos que heredan de Vehiculo
        Auto auto = new Auto();
        Moto moto = new Moto();
        Bus bus = new Bus();
        Camion camion = new Camion();
        
        
        //Declaro el objeto peaje para identificar y cobrar el peaje dependiendo del tipo de Vehiculo
        Peaje peaje = new Peaje();
        System.out.println("");
        //Cobrar peaje a un auto
        peaje.cobrarPeajeAuto(auto);
        System.out.println("");
        //Cobrar peaje a una moto
        peaje.cobrarPeajeMoto(moto);
        System.out.println("");
        //Cobrar peaje a un bus
        peaje.cobrarPeajeBus(bus);
        System.out.println("");
        //Cobrar peaje a un camion
        peaje.cobrarPeajeCamion(camion);
    }
}
