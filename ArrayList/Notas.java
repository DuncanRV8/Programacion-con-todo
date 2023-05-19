import java.util.ArrayList;
import java.util.Scanner;
public class Notas {
    public static void main(String[] args) {

        Scanner lector = new Scanner(System.in);
        ArrayList<Integer> notas = new ArrayList<>();

        // PEDIMOS NOTAS

        boolean continuar = true;
        do {
            System.out.println("Dime una cantidad");
            int cantidad = lector.nextInt();
            if (cantidad >= 0 && cantidad <= 10) {
                notas.add(cantidad);
            }
            else if(cantidad == -1) {
                continuar = false;
            }
           
        } while (continuar != false );


        // CALCULAMOS DATOS

        int contarCeros = 0;
        int contarDiez = 0;
        double suma = 0;

        for (int i = 0; i < notas.size(); i++) {
            if (notas.get(i) == 0 ) {
                contarCeros ++;
            }
            else if (notas.get(i) == 10 ){
                contarDiez++;
            }
            suma += notas.get(i);
        }
      
        double media = suma / notas.size();

        // MOSTRAMOS DATOS
        System.out.println("NOTAS: " + notas);
        System.out.println("Hay: " + contarCeros + " ceros");
        System.out.println("Hay: " + contarDiez + " dieces");
        System.out.println("La media es " + media);

    }
}
