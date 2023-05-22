public class CuentaPro extends CuentaCorriente {
    
    //constructor
    public CuentaPro(String titular, double saldo) {
        super(titular, saldo);
        this.comisionOperacion = 0;
        this.comisionMensual = 100;
        this.ingresoMensual = 0;
    }

    public boolean ingresar(double ingresar)throws Exception{
        super.ingresar(ingresar);
        return true;
    }

    public boolean retira(double retirar)throws Exception{
        super.retirar(retirar);
        return true;
    }

    public boolean actualizarMensualidad(){
        super.actualizarMensualidad();
        return true;
    }

    public String toString(){
        return super.toString();
    }
}
