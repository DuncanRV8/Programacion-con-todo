public class Contacto {
    
    //Atributos
    private String nombre;
    private String telefono;
    private String correo;

    //Constructor
    public  void Contacto(String nombre, String telefono, String correo){
        this.nombre = nombre;
        this.telefono = telefono;
        this.correo = correo;
    }
    //Setter y Getter
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getNombre() {
        return nombre;
    }
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    public String getTelefono() {
        return telefono;
    }
    public void setCorreo(String correo) {
        this.correo = correo;
    }
    public String getCorreo() {
        return correo;
    }
    //Metodos
    public void imprimir(){
        System.out.println(nombre + " " + telefono + " " + correo);
    }
}
