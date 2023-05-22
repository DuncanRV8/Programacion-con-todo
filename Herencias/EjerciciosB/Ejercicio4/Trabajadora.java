public class Trabajadora {
    //atributos
    protected String nombre;
    protected int contadorHoras = 0;
    final int sueldoBase = 10;
    protected double sueldo;
    //constructor
    public Trabajadora(){
        
    }

    public Trabajadora(String nombre, int contadorHoras){
        this.nombre = nombre;
        try {
            setContadorHoras(contadorHoras);
        } catch (Exception e) {
            System.err.println("No puedes poner numeros negativos");
        }
    }
    //setter y getter
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setContadorHoras(int contadorHoras)throws Exception{
        if (contadorHoras >= 0) {
            this.contadorHoras = contadorHoras;
        }
        else{
            throw new Exception("No puedes poner horas negativas");
        }
    }

    //metodos
    public boolean trabajar(int horas)throws Exception{
        if (horas < 0 ) {
            throw new Exception("No puedes poner horas negativas");
        }
        contadorHoras += horas;
        return true;
    }

    public boolean cobrarNomina(){
        this.sueldo = this.contadorHoras * this.sueldoBase;
        return true;
    }

    public String toString(){
        return "Nombre: " + nombre + "Sueldo: " + sueldo;
    }

}
