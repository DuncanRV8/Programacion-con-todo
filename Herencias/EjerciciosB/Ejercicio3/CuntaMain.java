import java.util.ArrayList;
public class CuntaMain {
    public static void main(String[] args) {
        ArrayList<CuentaCorriente> cuentas = new ArrayList<>();

        CuentaCorriente c1 = new CuentaCorriente("Lio", 300);
        CuentaAhorro a1 = new CuentaAhorro("Nacho", 20.00);

        System.out.println(c1);

        try {

            System.out.println(" ");
            c1.ingresar(300.00);
            System.out.println(c1);

            System.out.println(" ");
            c1.retirar(200.00);
            System.out.println(c1);

            System.out.println(" ");
            c1.actualizarMensualidad();
            System.out.println(c1);

            System.out.println(" ");
            a1.ingresar(10);
            System.out.println(a1);
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        
    }
}
