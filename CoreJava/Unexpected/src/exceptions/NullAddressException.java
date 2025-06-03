package exceptions;

public class NullAddressException extends RuntimeException{
    public NullAddressException(String message){
        super(message);
    }
}
