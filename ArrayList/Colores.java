import java.util.ArrayList;
public class Colores {
    public static void main(String[] args) {
        ArrayList<String> colores = new ArrayList();

        colores.add("Rojo");
        colores.add("Azul");
        colores.add("Verde");
        colores.add("Naranja");
        colores.add("Blanco");
        imprimirAll(colores);

        colores.add("Negro");
        colores.add("Cyan");
        imprimirAll(colores);

        colores.add(1,"Amarillo");
        colores.add(2,"Magenta");
        imprimirAll(colores);

        colores.remove(3);
        colores.remove(4);
        imprimirAll(colores);
    }

    //Imprimir la lista de Arrays
    public static void imprimirAll( ArrayList<String>  listar){
        System.out.println("LISTA");
        for (int i = 0; i < listar.size(); i++) {
            System.out.println("Posición " + i + " " + "Item: " + listar.get(i));
        }
        System.out.println("");
    }
}
