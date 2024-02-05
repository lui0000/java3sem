package generics.generics;

public class Animal <V>{
    V dogV;

    Animal(V dogV) {

        this.dogV = dogV;
    }

    public V getDogV() {
        return dogV;
    }



    public void setDogV(V dogV) {
        this.dogV = dogV;
    }
    @Override
    public String toString() {
        return "Animal{ " + "dogV = " + dogV +
                '}';
    }

}
