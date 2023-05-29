public class ArchivoMain {
    public static void main(String[] args) {
        VectorInt vector = new VectorInt(5);
        vector.random(1, 2000000000);
        System.out.println(vector.toString());
    }
}
