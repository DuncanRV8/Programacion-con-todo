public class Profesor extends Persona{
    //Atributos
    protected double salario;
    protected String especialidad;

    //Constructores
    public Profesor() {

    }

    public Profesor(String nombre, String apellidos, String fechaNacim, double s, String e){
        super.nombre = nombre;
        super.apellidos = apellidos;
        super.fechaNacim = fechaNacim;
        this.salario = s;
        this.especialidad = e;
    }

    //Setter y Getter
    public String getNombre() {
        return "Profesor: " + this.getNombre();
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }
    public double getSalario() {
        return salario;
    }
    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }
    public String getEspecialidad() {
        return especialidad;
    }

    //Metodos
    public static void añadirProfesor(String nombre, String apellido, String fecha, double salario, String especialidad){
        Profesor pro = new Profesor();
        pro.setNombre(nombre);
        pro.setApellidos(apellido);
        pro.setFechaNacim(fecha);
        pro.setSalario(salario);
        pro.setEspecialidad(especialidad);
    }

    //Imprimir
    public String toString(){
        return "Profesor: " + nombre + " " + apellidos + " " +  " " + fechaNacim + " " + salario + " " + especialidad;
    }
}
