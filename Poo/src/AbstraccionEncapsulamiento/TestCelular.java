package AbstraccionEncapsulamiento;

public class TestCelular {
    public static void main(String[] args) {
        //Creo un objeto de tipo Celular con el contructor vacio
        Celular celu = new Celular();
        //Le asigno los parametros
        celu.setMarca("Motorola");
        celu.setModelo("G6 Plus");
        celu.setColor("RojoFerrari");
     
        celu.infoCelular();
        System.out.println("");
        celu.llamar("Lionel Messi");
        celu.llamadaFinalizada();
        System.out.println("\n ");
        //Creo un objeto de tipo SmartPhone con el constructor vacio
        SmartPhone smartPhone = new SmartPhone();
        //Le asigno todos los parametros correspondientes
        smartPhone.setMarca("Samsung");
        smartPhone.setModelo("A 22");
        smartPhone.setColor("Blanco");
        smartPhone.setPixelesCamara(48+8+2+2);
        smartPhone.setTamanioMemoriaInterna(4);
        smartPhone.setTamanioMemoriaExterna(128);
        //implemento el metodo infoCelular el cual fue sobreescrito en la clase SmartPhone
        smartPhone.infoCelular();
        System.out.println("");
        //Utilizo el metodo llamar y llamadaFinalizada que la clase smartPhone hereda de la clase Celular
        smartPhone.llamar("Vegetta777");
        smartPhone.llamadaFinalizada();
    
    }
    
}
