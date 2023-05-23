public class Triangulo extends Figura {
    
    //variables
    private int base, altura;


    //constructores
    public Triangulo(int base, int altura){
        this.base = base;
        this.altura = altura;
    }

    public double area(){
        double area = base * altura;
        return area;
    }
}
