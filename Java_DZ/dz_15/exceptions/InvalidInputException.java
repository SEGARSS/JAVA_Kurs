package Java_DZ.dz_15.exceptions;

/**
 * Исключение, которое выбрасывается при некорректном вводе.
 */
public class InvalidInputException extends Exception {

    /**
     * Конструктор с параметром, позволяющий задать сообщение об ошибке.
     *
     * @param message Сообщение об ошибке.
     */
    public InvalidInputException(String message) {
        super(message);
    }
}
