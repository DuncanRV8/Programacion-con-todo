import java.util.Arrays;

public class VectorInt implements IMinMax{

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

    @Override
    public String toString() {
        return "VectorInt [vector=" + Arrays.toString(vector) + "]";

    }

    
}
