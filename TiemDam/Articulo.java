public class Articulo {


    //enum
    public enum IVA{
        Normal,Reducido,SuperReducido;
    }

    //atributos
    private String nombre;
    private double precio;
    private IVA iva; 
    private int cantidad;

    //constructor
    public Articulo() {
        
    }
    public Articulo(String nombre,  double precio, int cantidad, IVA iva){
        setNombre(nombre);
        setIva(iva);
        try {
            setPrecio(precio);
        } catch (Exception e) {
            System.out.println("No se puede crear");
        }
        
        setCantidad(cantidad);
    }

    //Setter/Getter
    public void setPrecio(double precio) throws Exception{
        if (precio > 0) {
            this.precio = precio;
        }
        else{
            throw new Exception("No puedes introducir numeros negativos o 0");
        }
    }
    public double getPrecio() {
        return precio;
    }

    public void setCantidad(int cantidad) {
        if (cantidad > 0) {
            this.cantidad = cantidad;
        }
        else{
            System.out.println("No puedes introducir numeros negativos o 0");
        }
    }
    public int getCantidad() {
        return cantidad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getNombre() {
        return nombre;
    }
    public void setIva(IVA iva) {
        this.iva = iva;
    }
    public IVA getIva() {
        return iva;
    }
    
    //Metodos
    public void aumentar(int cant){
        System.out.println("Se ha sumado la cantidad");
        this.cantidad =+ cant;
    }

    public boolean disminuir(int cant){
        if (cant > cantidad) {
            System.out.println("Error no se puede quitar tanta cantidad");
            return false;
        }
        else{
            System.out.println("Se ha restado la cantidad");
            cantidad =- cant;
            return true;
        }
    }

    public void imprimir(){
        System.out.println("Nombre: "  + nombre + " Precio: " + precio + " Cantidad: " + cantidad + " Iva: " + iva );
        System.out.println(" ");
    }
}
