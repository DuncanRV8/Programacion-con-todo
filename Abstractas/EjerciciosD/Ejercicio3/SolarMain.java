public class SolarMain {
    public static void main(String[] args) {
        SistemaSolar sistema = new SistemaSolar();
        Planeta planetas = new Planeta();
        Planeta p1 = new Planeta("Duncan", 23, 40, 1000);

        Satelite s1 = new Satelite("Pipo", 10, 10, 400000);

        sistema.agregar(p1);
        sistema.verPlanetas();

        planetas.agregarSatelite(s1);
        planetas.verSatelites();
    

    }
}
