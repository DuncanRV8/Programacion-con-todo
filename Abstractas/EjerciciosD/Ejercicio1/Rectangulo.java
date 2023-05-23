public class Rectangulo extends Figura {
    
    //variables
    private int base, altura;

    //constructores
    public Rectangulo(int base, int altura){
        this.base = base;
        this.altura = altura;
    }

    //metodo
    public double area(){
        double area = base * altura;
        return area;
    }
    
}
