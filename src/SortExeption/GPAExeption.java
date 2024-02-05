package SortExeption;

public class GPAExeption extends Exception{
    public GPAExeption() {
    }

    public GPAExeption(String message) {
        super(message);
    }

    public GPAExeption(String message, Throwable cause) {
        super(message, cause);
    }

    public GPAExeption(Throwable cause) {
        super(cause);
    }

    public GPAExeption(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
