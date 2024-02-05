package workingWithExeptions;

import java.util.Scanner;

public class workingWithExceptions {
    public static void main(String[] args) {
        // number 2
        Scanner myScanner = new Scanner( System.in);
        try {
            System.out.print("Enter an integer ");
            String intString = myScanner.next();
            int i = Integer.parseInt(intString);
            System.out.println(2 / i);
        }catch (Exception e) {
            System.err.println("An exception occurred: " + e.getMessage());
        }finally {
            System.out.println("the program completed");
        }
//        catch (ArithmeticException e) {
//            System.err.println("Error: Division by zero.");
//        } catch (NumberFormatException e) {
//            System.err.println("Error: Input is not a valid integer.");
//        }
    }

}

