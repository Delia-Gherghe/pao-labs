package ro.unibuc.lab7.excpetions.example2.customchecked;

public class AccessDeniedException extends Exception {

    private String mySecondMessage;

    public AccessDeniedException(String message, String mySecondMessage) {
        super(message);
        this.mySecondMessage = mySecondMessage;
    }
}
