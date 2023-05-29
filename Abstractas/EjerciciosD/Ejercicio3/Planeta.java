import java.util.ArrayList;

public class Planeta extends Astro {

    //variables
    private double distanciaSol;
    private ArrayList<Satelite> satelites = new ArrayList<>();

    Satelite s1 = new Satelite("Pipo", 10, 10, 400000);
    
    //constructor
    public Planeta(){

    }

    public Planeta(String nombre, double masa, double temperaturaMedia, double distanciaSol){
        super(nombre,masa,temperaturaMedia);
        this.distanciaSol = distanciaSol;
    }

    //agregar satelites
    public boolean agregarSatelite(){
        satelites.add(s1);
        return true;
    }

    //eliminar satelites
    public boolean eliminarSatelites(){
        satelites.remove(1);
        return true;
    }

    public boolean verSatelites(){
        for (Satelite s: satelites)
        System.out.println(s.toString());
        return true;
    }

    public String toString(){
        return "Nombre: " + nombre + " Masa: " + masa + " Temperatura Media: " + temperaturaMedia + " Distancia del Sol: " + distanciaSol ;
    }
}