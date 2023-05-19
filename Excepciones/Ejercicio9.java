import java.util.Scanner;
import java.util.InputMismatchException;

public class Ejercicio9 {
  public static void main(String[] args) {
    Scanner lector = new Scanner(System.in);
    int num1;
    int num2;

    
  
    try{
      System.out.println("Dime un número");
      num1 = lector.nextInt();

      System.out.println("Dime otro número");
      num2 = lector.nextInt();

    
      System.out.println(num1/ num2);
    }
    catch(InputMismatchException e){
      System.err.println("ERROR: Solo puedes poner un int");
    }
    catch(ArithmeticException e){
      System.err.println("ERROR: No puedes poner un 0");
    }
  }  
}
