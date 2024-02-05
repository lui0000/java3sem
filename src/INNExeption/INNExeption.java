
package INNExeption;

import java.util.Iterator;
import java.util.LinkedList;

//ИНН для физических лиц состоит из 12 цифр. Для юридических
// лиц ИНН присваивается при постановке на учет в налоговом
// органе при их создании и состоит из 10 цифр
public class INNExeption extends Exception {
    public INNExeption() {
    }

    public INNExeption(String message) {
        super(message);
    }

    public INNExeption(String message, Throwable cause) {
        super(message, cause);
    }

    public INNExeption(Throwable cause) {
        super(cause);
    }

    public INNExeption(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
