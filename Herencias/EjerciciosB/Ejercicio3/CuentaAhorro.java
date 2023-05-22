public class CuentaAhorro extends CuentaCorriente {
    
    //Atributos
    private int contadorOperaciones = 0;
    final static int maxOperaciones = 3; 

    //Constructor
    public CuentaAhorro(String titular, double saldo) {
        super(titular, saldo);
        this.ingresoMensual = 1.10;
        this.comisionMensual = 0;
    }

    //Metodos
    public boolean ingresar(double ingresar)throws Exception{
        if (contadorOperaciones > maxOperaciones) {
            throw new Exception("ERROR: No puedes hacer mas de 3 ingresos al mes");
        }
        super.ingresar(ingresar);
        return true;
    }

    public String toString(){
        return super.toString();
    }
}
