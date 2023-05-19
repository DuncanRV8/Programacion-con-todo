public class Cuadrado extends Figuras{
    

    //variables
    private double lado;

    //constructores
    public Cuadrado(double lado){
        this.lado = lado;
    }

    //imprimir
    public double area(){
        double area = lado * lado;
        return area;
    }
}
