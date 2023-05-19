public class Alumno  extends Persona{
    //Atributos
    protected String grupo;
    protected int nota;

    //Constructor
    public Alumno(String nombre, String apellidos, String fechaNacim, String g, int nota){
        super.nombre = nombre;
        super.apellidos = apellidos;
        super.fechaNacim = fechaNacim;
        this.nota = nota;
        this.grupo = g;
    }

    //Setter y getter
    public String getNombre() {
        return "Alumno: " + this.getNombre();
    }

    public void setGrupo(String grupo) {
        this.grupo = grupo;
    }
    public String getGrupo() {
        return grupo;
    }
    public void setNota(int nota) {
        this.nota = nota;
    }
    public int getNota() {
        return nota;
    }
    //Metodos
    //imprimir
    public String toString(){
        return "Alumno: " + nombre + " " + apellidos + " " + fechaNacim + " " + grupo + " " + nota;
    }
}
