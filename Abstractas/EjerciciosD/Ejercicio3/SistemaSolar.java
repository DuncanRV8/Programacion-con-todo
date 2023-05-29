import java.util.ArrayList;

public class SistemaSolar {
    
    //atributos
    private String nombre = "pepe";
    private ArrayList<Planeta> planetas = new ArrayList<>();

    //metodos
    public boolean agregar(Planeta p){
        planetas.add(p);
        return true;
    }

    //eliminar
    public boolean eliminar(){
        planetas.remove(1);
        return true;
    }

    //ver planetas
    public boolean verPlanetas(){
        System.out.println("El sistema Solar " + nombre + " tiene estos planetas: ");
        System.out.println(" ");
        for (Planeta p: planetas)
        System.out.println(p.toString());
        return true;
    }
}
