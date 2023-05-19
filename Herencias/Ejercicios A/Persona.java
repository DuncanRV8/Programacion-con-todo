import java.util.ArrayList;
public class Persona {
    
    
    //Atributos
    protected static ArrayList<Persona> personas = new ArrayList<>();
    protected String nombre;
    protected String apellidos;
    protected String fechaNacim;

    //Constructores
    public Persona(){
        
    }

    public Persona(String n, String a, String f){
        this.nombre = n;
        this.apellidos = a;
        this.fechaNacim = f;
    }

    //Setter y Getter
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getNombre() {
        return "Persona" + nombre;
    }
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }
    public String getApellidos() {
        return apellidos;
    }
    public void setFechaNacim(String fechaNacim) {
        this.fechaNacim = fechaNacim;
    }
    public String getFechaNacim() {
        return fechaNacim;
    }


    //Ver personas añadidas
    public static void verLista(){
        for (int i = 0; i < personas.size(); i++) {
            System.out.println(personas.get(i));
        }
    }

    //añadir persona
    public static boolean añadirPersona(String nombre, String apellido, String fecha){
        Persona per = new Persona();
        per.setNombre(nombre);
        per.setApellidos(apellido);
        per.setFechaNacim(fecha);
        personas.add(per);

        return true;
    }

    //Imprimir la informacion
    public String toString(){
        return "Persona: " + nombre + " " + apellidos + " " + fechaNacim;
    }
}
