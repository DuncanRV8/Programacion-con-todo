import java.util.Scanner;
import java.util.InputMismatchException;
public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);

        System.out.println("Dime un número");
        
        try{
            int num = lector.nextInt();
            System.out.println("El número que has introducido es: " + num);
        }
        catch(InputMismatchException e){
            System.err.println("ERROR: Tienes que introducir un int");
        }
    }
}