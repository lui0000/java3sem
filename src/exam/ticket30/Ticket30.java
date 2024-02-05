package exam.ticket30;

public class Ticket30 {
    public static void powersOfTwoCheck(int n) {
//        if (n <= 0) {
//            System.out.println("NO");
//        } else if ((n & (n - 1)) == 0) {
//            System.out.println("YES");
//        } else {
//            System.out.println("NO");
//        }
        if (n <= 0) {
            System.out.println("NO");
        } else if (n == 1) {
            System.out.println("YES");
        } else if (n % 2 == 0) {
            powersOfTwoCheck(n / 2);
        } else {
            System.out.println("NO");
        }
    }

    public static void main(String[] args) {
        powersOfTwoCheck(12);
    }
}
