public class Circulo extends Figura{
    
    //Atributos
    private int radio;

    //constructores
    public Circulo(int radio){
        this.radio = radio;
    }

    //metodos
    public double area(){
        double area = Math.PI * (this.radio * this.radio);
        return area;
    }
}
