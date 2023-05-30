public class ArchivoMain {
    public static void main(String[] args) {
        VectorInt vector = new VectorInt(1);
        vector.random(0, 1);
        System.out.println(vector.toString());
        VectorInt vect = new VectorInt(1);
        vect.random(1, 1);
        System.out.println(vect.toString());
        vector.esIgual(vect.vector);
    }
}
