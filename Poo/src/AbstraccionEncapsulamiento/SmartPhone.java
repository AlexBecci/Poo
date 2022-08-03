package AbstraccionEncapsulamiento;

public class SmartPhone extends Celular {

    //Atributos de la clase
    private float pixelesCamara;
    private float tamanioMemoriaInterna;//tamanioMemoriaRam
    private float tamanioMemoriaExterna; //tamanioMemoriaDisco

    //Constructor vacio
    public SmartPhone() {

    }

    //Constructor con los argumentos de la clase y los heredados de la clase "Celular"
    public SmartPhone(String marca, String modelo, String color, float pixelesCamara, float tamanioMemoriaRam, float tamanioMemoriaDisco) {
        super(marca, modelo, color);
        this.pixelesCamara = pixelesCamara;
        this.tamanioMemoriaInterna = tamanioMemoriaRam;
        this.tamanioMemoriaExterna = tamanioMemoriaDisco;
    }

    //Metodo sobreescrito, utilizo los que tiene por defecto de la clase celular y le agrego los que yo vea correcto para esta clase
    public void infoCelular() 
    {
        super.infoCelular();//Toma el metodo de infoCelular sin tener que volver a escribirlo
        System.out.println(String.format("SmartPhone calidad cámara: %s pixeles", pixelesCamara));
        System.out.println("SmartPhone memoria interna(Ram): " + tamanioMemoriaInterna + " GB");
        System.out.println(String.format("SmartPhone tamaño memoria externa: %s GB", tamanioMemoriaExterna));
    }

    //getters y setters
    
    //PixelesCamara
    public float getPixelesCamara() 
    {
        return pixelesCamara;
    }

    public void setPixelesCamara(float pixelesCamara) 
    {
        this.pixelesCamara = pixelesCamara;
    }

    //Tamaño memoria interna
    public float getTamanioMemoriaInterna() 
    {
        return tamanioMemoriaInterna;
    }

    public void setTamanioMemoriaInterna(float tamanioMemoriaInterna) 
    {
        this.tamanioMemoriaInterna = tamanioMemoriaInterna;
    }

    //Tamaño memoria externa
    public float getTamanioMemoriaExterna() 
    {
        return tamanioMemoriaExterna;
    }

    public void setTamanioMemoriaExterna(float tamanioMemoriaExterna) 
    {
        this.tamanioMemoriaExterna = tamanioMemoriaExterna;
    }

}
