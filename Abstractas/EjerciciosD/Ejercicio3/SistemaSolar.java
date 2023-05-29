import java.util.ArrayList;

public class SistemaSolar {
    
    //atributos
    private String nombre = "pepe";
    private ArrayList<Planeta> planetas = new ArrayList<>();

    Planeta p1 = new Planeta("Duncan", 23, 40, 1000);
    Planeta p2 = new Planeta("Nacho", 20, 100, 2);
    
    //metodos
    public boolean agregar(){
        planetas.add(p1);
        planetas.add(p2);
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
