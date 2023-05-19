public class Circulo extends Figuras {
    


    //variables
    private double radio;

    //constructores
    public Circulo(double radio){
        this.radio = radio;
    }

    //imprimir
    public double area(){
        double area = Math.PI * (radio * radio);
        return area;
    }
}
