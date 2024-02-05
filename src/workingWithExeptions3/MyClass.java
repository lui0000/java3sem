package workingWithExeptions3;
// 5
public class MyClass {
    public void getDetails(String key) {
        try{
            if (key == null) {
                throw new NullPointerException("null key in getDetails");
            }
        }catch (NullPointerException e) {
            System.err.println("Caught a NullPointerException inside getDetails: " + e.getMessage());
        }


    }

    public static void main(String[] args) {
        MyClass myObject = new MyClass();

        try {
            myObject.getDetails(null); // Вызываем метод с параметром, равным null
        } catch (NullPointerException e) {
            System.err.println("Caught a NullPointerException: " + e.getMessage());
        }
    }
}
