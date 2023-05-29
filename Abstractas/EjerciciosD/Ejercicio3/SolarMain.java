public class SolarMain {
    public static void main(String[] args) {
        SistemaSolar sistema = new SistemaSolar();

        sistema.agregar();
        sistema.verPlanetas();
        sistema.eliminar();
        sistema.verPlanetas();

    }
}
