import java.util.Scanner;
import java.util.ArrayList;

public class MainContacto {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        ArrayList<Contacto> contactos = new ArrayList<>();

        Contacto contacto1 = new Contacto();
        contacto1.Contacto("Duncan", "722683623", "duncanruval@gmail.com");
        contactos.add(contacto1);

        Contacto contacto2 = new Contacto();
        contacto2.Contacto("Lucia", "644324022", "lucia.mm@gmail.com");
        contactos.add(contacto2);
        
        Contacto contacto3 = new Contacto();
        contacto3.Contacto("Julia", "658361961", "juliamarquez@gmail.com");
        contactos.add(contacto3);

        //Para ver si esta el nombre de julia
        boolean comprobar = true;
        System.out.println("Dime el nombre que quieres buscar");
        String nombre = lector.next();
        for (int i = 0; i < contactos.size(); i++) {
            if (contactos.get(i).getNombre().toLowerCase().contains(nombre.toLowerCase())) {
                System.out.println("Estas son las que se llaman Julia: " );
                contactos.get(i).imprimir();
                comprobar = true;
            }
            else{
              comprobar = false;
            }
        }
        if (comprobar == false) {
            System.out.println("No hay ninguna Julia");
        }
    }   
}
