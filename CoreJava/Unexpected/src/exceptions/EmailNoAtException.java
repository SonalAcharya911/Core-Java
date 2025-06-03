package exceptions;

public class EmailNoAtException extends RuntimeException{
    public EmailNoAtException(String message){
        super(message);
    }
}
