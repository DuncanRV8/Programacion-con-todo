import java.util.ArrayList;
public class CuntaMain {
    public static void main(String[] args) {
        ArrayList<CuentaCorriente> cuentas = new ArrayList<>();

        CuentaCorriente c1 = new CuentaCorriente("Lio", 300);

        System.out.println(c1);

        try {
            c1.setSaldo(200);

            System.out.println(" ");
            c1.ingresar(300.00);
            System.out.println(c1);

            System.out.println(" ");
            c1.retirar(200.00);
            System.out.println(c1);

            System.out.println(" ");
            c1.actualizarMensualidad();
            System.out.println(c1);
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        
    }
}
