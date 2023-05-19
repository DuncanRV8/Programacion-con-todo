package U6;

public class MainArticulo {
    public static void main(String[] args) {

        Articulo a1 = new Articulo("Duncan", 23, 21, 10);
        Articulo a2 = new Articulo("Nacho", 23, 21, 2);
        Articulo a3 = new Articulo("Sergi", 23, 21, 2);
        
        System.out.println(a1);
        System.out.println(a2);
        System.out.println(a3);
        
        a1.vender(5);
        System.out.println(a1);

        a1.vender(3);
        System.out.println(a1);
    }

    
}
