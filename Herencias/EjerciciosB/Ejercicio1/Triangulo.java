public class Triangulo extends Figuras {
    
    //variables
    private double base;
    private double altura;


    //constructores
    public Triangulo(double base, double altura){
        this.base = base;
        this.altura = altura;
    }

    //imprimir
    public double area(){
        double area = (base * altura) / 2;
        return area;
    }
}
