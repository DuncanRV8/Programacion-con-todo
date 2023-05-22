import java.util.ArrayList;;
public class Cooperativa {

    //Atributos 
    private static ArrayList<Trabajadora> trabajadoras = new ArrayList<>();
    private static Trabajadora tr = new Trabajadora();
    public static void main(String[] args) {
        añadirTrabajadora();
        mostrar();
    }
    public static boolean añadirTrabajadora(){
        Trabajadora t = new Trabajadora("Maria", 30);
        trabajadoras.add(t);
        return true;
    }
    public static void mostrar(){
        for (int i = 0; i < trabajadoras.size(); i++) {
            System.out.println(i+1);
            
            
        }
    }
    
}


