import java.util.Scanner;

public class EjercicioAMain {

    //variables
    final private static Scanner lector = new Scanner(System.in);

    //añadir personas
    public static void añadirPersona(){
       
        System.out.print("Dime el nombre de la persona: ");
        String nombre = lector.next();
        System.out.print("Dime el apellido que tiene: ");
        String apellido = lector.next();
        System.out.print("Dime la fecha en la que naciste: ");
        String fecha = lector.next();

        Persona.añadirPersona(nombre, apellido, fecha);
    }

    public static void añadirProfesor(){
        System.out.print("Dime el nombre de la persona: ");
        String nombre = lector.next();
        System.out.print("Dime el apellido que tiene: ");
        String apellido = lector.next();
        System.out.print("Dime la fecha en la que naciste: ");
        String fecha = lector.next();
        System.out.print("Dime el salario: ");
        double salario = lector.nextDouble();
        System.out.print("Dime la profesion: ");
        String profesion = lector.next();
        Profesor.añadirProfesor(nombre, apellido, fecha, salario, profesion);
    }

    public static void menu(){
        System.out.println("1. Ver listado");
        System.out.println("2. Añadir personas");
        System.out.println("3. Añadir Profesor");
    }

    public static void eleccion(int eleecion){
        switch (eleecion) {
            case 1:
                Persona.verLista();
            break;
            
            case 2:
                añadirPersona();
            break;

            case 3:
                añadirProfesor();
            break;
        
            default:
                break;
        }
    }

    public static void main(String[] args) {
        while (true) {
            menu();
            eleccion(lector.nextInt());
        }

    }
    
}
