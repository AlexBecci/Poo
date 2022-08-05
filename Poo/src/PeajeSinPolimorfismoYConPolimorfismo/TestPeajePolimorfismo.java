package PeajeSinPolimorfismoYConPolimorfismo;

public class TestPeajePolimorfismo {

    public static void main(String[] args) {
        //declaro objetos que heredan de Vehiculo
        Auto auto = new Auto();
        Moto moto = new Moto();
        Bus bus = new Bus();
        Camion camion =  new Camion();
        
        //Declaro el objeto peaje para identificar y cobrar el peaje dependiendo del tipo de Vehiculo
        PeajePolimorfismo peajePoli = new PeajePolimorfismo();
        //Cobrar peaje para cualquier vehiculo
        peajePoli.cobrarPeajeVehiculo(moto);
        System.out.println("");
        peajePoli.cobrarPeajeVehiculo(bus);
        System.out.println("");
        peajePoli.cobrarPeajeVehiculo(camion);
        System.out.println("");
        peajePoli.cobrarPeajeVehiculo(auto);
        
    }

}
