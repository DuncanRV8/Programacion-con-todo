public abstract class Astro {
    
    //Atributos
    protected String nombre;
    protected double masa;
    protected double temperaturaMedia;

    //constructor
    public Astro(){
        
    }

    public Astro(String nombre, double masa, double temperaturaMedia){
        this.nombre = nombre;
        this.masa = masa;
        this.temperaturaMedia = temperaturaMedia;
    }

    public abstract String toString();
}
