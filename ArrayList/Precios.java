import java.util.ArrayList;
import java.util.Scanner;

public class Precios {
    public static void main(String[] args) {
        ArrayList<Integer> precios = new ArrayList<>();
        Scanner lector = new Scanner(System.in);

        //Sacar los precios
        boolean continuar = true;
        do {
            System.out.println("Dime el precio");
            int precio = lector.nextInt();

            if (precio > 0) {
                
                precios.add(precio);
            }
            else{
                continuar = false;
            }
        } while (continuar != false);

        System.out.println("Estos son los precios que tenemos: " + precios);

        //Arrays para precios mas de 100 y menos de 100
        ArrayList<Integer>preciosMenosCien = new ArrayList<>();
        ArrayList<Integer>preciosMasCien = new ArrayList<>();

        for (int i = 0; i < precios.size(); i++) {
            if (precios.get(i) < 100) {
                int tmp = precios.get(i);
                preciosMenosCien.add(tmp);
                precios.remove(i);
                i--;
            }
            else if(precios.get(i) >= 100){
                int tmp2 = precios.get(i);
                preciosMasCien.add(tmp2);
                precios.remove(i);
                i--;
            }
        }
        System.out.println("Precios mas de 100€: " + preciosMasCien);
        System.out.println("Precios menos de 100€: " + preciosMenosCien);
        System.out.println("Precios: " + precios);
        
    }
}
