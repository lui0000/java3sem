package workingWithExceptions2;

import java.util.Scanner;

public class ThrowsDemo {
    public void getKey() {
        try {
            Scanner myScanner = new Scanner(System.in);
            String key = myScanner.next();
            printDetails(key);
        } catch (Exception e) {
            System.out.println("Exception caught: " + e.getMessage());
            System.out.println("Let's try again.");
            getKey();
        }
    }

    public void printDetails(String key) throws Exception {
        try {
            String message = getDetails(key);
            System.out.println(message);
        } catch (Exception e) {
            throw e;
        }
    }

    private String getDetails(String key) throws Exception {
        if (key.isEmpty()) {
            throw new Exception("Key set to empty string");
        }
        return "data for " + key;
    }

    public static void main(String[] args) {
        ThrowsDemo throwsDemo = new ThrowsDemo();
        throwsDemo.getKey();
    }
}
