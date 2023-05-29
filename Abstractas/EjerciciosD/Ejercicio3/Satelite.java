public class Satelite extends Astro {
    //atributos
    private double distanciaPLaneta;

    //constructor
    public Satelite(){

    }

    public Satelite(String nombre, double masa, double temperaturaMedia, double distanciaPLaneta){
        super(nombre,masa,temperaturaMedia);
        this.distanciaPLaneta = distanciaPLaneta;
    }

    public String toString(){
        return "Nombre: " + nombre + " Masa: " + masa + " Temperatura Media: " + temperaturaMedia + " Distancia del Planeta: " + distanciaPLaneta;
    }
}
