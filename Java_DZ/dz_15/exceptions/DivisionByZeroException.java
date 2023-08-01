package Java_DZ.dz_15.exceptions;

/**
 * Исключение, которое выбрасывается при делении на ноль.
 */
public class DivisionByZeroException extends Exception {

     /**
     * Конструктор с параметром, позволяющий задать сообщение об ошибке.
     *
     * @param message Сообщение об ошибке.
     */
    public DivisionByZeroException(String message) {
        super(message);
    }
}
