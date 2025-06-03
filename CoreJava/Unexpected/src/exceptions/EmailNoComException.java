package exceptions;

public class EmailNoComException extends RuntimeException{
    public EmailNoComException(String message){
        super(message);
    }
}
