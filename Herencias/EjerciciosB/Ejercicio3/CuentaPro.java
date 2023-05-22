public class CuentaPro extends CuentaCorriente {
    
    //constructor
    public CuentaPro(String titular, double saldo) {
        super(titular, saldo);
        this.comisionOperacion = 0;
        this.comisionMensual = 100;
        this.ingresoMensual = 0;
    }
}
