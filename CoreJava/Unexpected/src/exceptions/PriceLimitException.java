package exceptions;

public class PriceLimitException extends RuntimeException{
    public PriceLimitException(String message){
        super(message);
    }
}
