package ro.unibuc.lab7.excpetions.example2.customunchecked;

public class NotFoundException extends RuntimeException{

    private static final int CODE = 10;

    public NotFoundException(String message) {
        super(message);
    }
}
