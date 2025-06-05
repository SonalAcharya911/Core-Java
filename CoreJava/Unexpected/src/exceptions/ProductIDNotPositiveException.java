package exceptions;

public class ProductIDNotPositiveException extends RuntimeException{
    public ProductIDNotPositiveException(String message){
        super(message);
    }
}
