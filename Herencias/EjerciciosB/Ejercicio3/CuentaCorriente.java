public class CuentaCorriente {

    //Atributos
    protected String titular;
    protected double saldo;
    private double comisionOperacion = 1.01;


    //Constructores
    public CuentaCorriente(){
        
    }

    public CuentaCorriente(String titular, double saldo){
        setTitular(titular);
        try {
            setSaldo(saldo);
        } catch (Exception e) {
            System.out.println("No puedes poner un número negativo");
        }
    }

    //Setters y Getters
    public void setTitular(String titular) {
        this.titular = titular;
    }

    public String getTitular() {
        return titular;
    }

    public void setSaldo(double saldo) throws Exception{
        if (saldo >= 0) {
            this.saldo = saldo;
        }
        else{
            throw new Exception("ERROR: El saldo no puede ser negativo");
        }
    }

    public double getSaldo() {
        return saldo;
    }

    //Metodos
    //Metodo de ingresar
    public boolean ingresar(double ingresar){
        if (ingresar <= 0) {
            System.out.println("ERROR: No se ha podido hacer el ingreso");
            return false;
        }
        else{
            this.saldo += ingresar - 1.00;
            System.out.println("Se ha hecho correctamente el ingreso");
            return true;
        }
    }

    //retirar
    public boolean retirar(double retirar){
        if (retirar > this.saldo && retirar <= 0 ) {
            System.out.println("ERROR: No se ha podido retirar el dinero");
            return false;
        }
        else{
            this.saldo = (this.saldo - retirar) - 1.00; 
            System.out.println("Se ha podido retirar");
            return true;
        }
    }

    //Actualizar mensualidad
    public boolean actualizarMensualidad(){
        this.saldo = (this.saldo * comisionOperacion) - 5;
        return true;
    } 

    //Imprimir
    public String toString(){
        return "Titular: " + titular + " Saldo: " + saldo;
    }
}