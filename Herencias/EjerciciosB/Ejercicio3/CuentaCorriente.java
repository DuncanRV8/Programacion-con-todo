public class CuentaCorriente {

    //Atributos
    protected String titular;
    protected double saldo;
    protected double comisionOperacion = 1;
    protected double comisionMensual = 5;
    protected double ingresoMensual = 1.01;


    //Constructores
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
    public boolean ingresar(double ingresar) throws Exception{
        if (ingresar <= 0) {
            throw new Exception("No se ha podido hacer el ingreso");
        }
        this.saldo += ingresar - comisionOperacion;
        return true;
    }

    //retirar
    public boolean retirar(double retirar)throws Exception{
        if (retirar > this.saldo && retirar <= 0 ) {
            throw new Exception("No se ha podido retirar");
        }
        this.saldo = (this.saldo - retirar) - comisionOperacion; 
        return true;
    }

    //Actualizar mensualidad
    public boolean actualizarMensualidad(){
        this.saldo = this.saldo * ingresoMensual - comisionMensual;
        return true;
    } 

    //Imprimir
    public String toString(){
        return "Titular: " + titular + " Saldo: " + saldo;
    }
}