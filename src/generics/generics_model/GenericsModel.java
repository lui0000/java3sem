package generics.generics_model;

public class GenericsModel<T, V, K>{
    private T t;
    private V v;
    private K k;

    public GenericsModel(T t, V v, K k) {
        this.t = t;
        this.v = v;
        this.k = k;
    }

    public T getT() {
        return t;
    }

    public V getV() {
        return v;
    }

    public K getK() {
        return k;
    }

    public void setT(T t) {
        this.t = t;
    }

    public void setV(V v) {
        this.v = v;
    }

    public void setK(K k) {
        this.k = k;
    }



    public void printValues() {
        //getClass a Class object representing the class of the object,
        // or returns information about the type of an object
        System.out.println("Class name for T: " + t.getClass().getName());
        System.out.println("Class name for V: " + v.getClass().getName());
        System.out.println("Class name for K: " + k.getClass().getName());

    }

    public static void main(String[] args) {
        GenericsModel<Integer, String, Double> genericsModel = new GenericsModel<>(21, "Hi", 4.5);
        genericsModel.printValues();
    }

}
