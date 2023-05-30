public class ArchivoMain {
    public static void main(String[] args) {
        VectorInt vector = new VectorInt(5);
        vector.random(1, 2000000000);
        System.out.println(vector.toString());
        VectorInt vect = new VectorInt(6);
        vect.random(2, 10);
        vector.esIgual(vect.vector);
    }
}
