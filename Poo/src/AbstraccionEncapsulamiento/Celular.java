package AbstraccionEncapsulamiento;

public class Celular {

    //atributos de la clase
    private String marca;
    private String modelo;
    private String color;

    //Contructor vacio
    public Celular() {

    }

    //Constructor con parametros
    public Celular(String marca, String modelo, String color) {
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
    }
    //Metodo LLamar
    public void llamar(String nombre)
    {
        System.out.println("Llamando a " + nombre);
    }
    //metodo finalizar llamada
    public void llamadaFinalizada()
    {
        System.out.println("Llamada finalizada...");
    }
    //Metodo de caracteristicas del celular
    public void infoCelular()
    {
        System.out.println(String.format("Celular Marca: %s", marca));
        System.out.println("Celular Modelo: "+ modelo);
        System.out.println(String.format("Celular Color: %s", color));       
    }
    //IMportante
    //getters y setters
    
    public String getMarca(){
        return marca;
    }
    public void setMarca(String marca)
    {
        this.marca = marca;
    }
    
    public String getModelo()
    {
        return modelo;
    }
    public void setModelo(String modelo)
    {
        this.modelo = modelo;
    }
    
    public String getColor()
    {
        return color;
    }
    public void setColor(String color)
    {
       this.color = color;
    }
}
