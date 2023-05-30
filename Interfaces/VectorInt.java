import java.util.Arrays;

public class VectorInt implements IMinMax,IEstadisticas{

    //Atributos
    int[] vector;

    //constructores
    public VectorInt(int tamaño){
        vector = new int[tamaño];
    }

    //Setter y Getter
    public void setVector(int[] vector) {
        this.vector = vector;
    }
    public int[] getVector() {
        return vector;
    }

    //metodo random
    public void random(int min, int max){
        for (int i = 0; i < vector.length; i++) {
            vector[i] = (int) (Math.random() * (max - min +1 ) + min);
        }
    }


    //metodos IMinMax
    public int getMinimo(){
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < vector.length; i++) {
            if (vector[i] < min) {
                min = vector[i];
            }
        }
        return min;
    }

    public int getMaximo(){
        int max = Integer.MAX_VALUE;
        for (int i = 0; i < vector.length; i++) {
            if (vector[i] > max) {
                max = vector[i];
            }
        }
        return max;
    }

    //metodos Iestadisticas
    public double getMedia(){
        int media = 0;
        for (int i = 0; i < vector.length; i++) {
            media += vector[i]; 
        }
        media = media / vector.length;
        return media;
    }

    public double getMediana(){
        Arrays.sort(vector);
        if (vector.length %2 == 0) {
            int numIz, numDe, mediana;
            numDe = vector[vector.length / 2];
            numIz = vector[vector.length / 2 -1];
            mediana = (numDe + numIz) / 2;
            return mediana;
        }
        else{
            int mediana;
            mediana = vector[vector.length / 2];
            return mediana;
        }
    }

    public int getModa(){
        Arrays.sort(vector);
        int contador = 1;
        int contadorNumMax = 1;
        int numActual = vector[0];
        int moda = numActual;
        for (int i = 1; i < vector.length; i++) {
            if (numActual == vector[i]) {
                contador++;
                
            }
            else{
                if (contador > contadorNumMax) {
                    contadorNumMax = contador;
                    moda = vector[numActual];
                }
                contador = 1;
                numActual = vector[i];
            }
        }
        if (contador > contadorNumMax) {
            moda = numActual;
        }
        return moda;
    }

    @Override
    public String toString() {
        return "VectorInt [vector=" + Arrays.toString(vector) + "]";

    }
}
