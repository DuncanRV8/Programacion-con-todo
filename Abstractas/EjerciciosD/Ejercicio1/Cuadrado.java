public class Cuadrado extends Figura{

    //variables
    private int lado;
    
    //constructores
    public Cuadrado(int lado){
        this.lado = lado;
    }

    //metodos
    public double area(){
        double area = lado * lado;
        return area;
    }
}
