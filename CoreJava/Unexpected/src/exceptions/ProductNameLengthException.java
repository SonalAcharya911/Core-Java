package exceptions;

public class ProductNameLengthException extends RuntimeException{
    public ProductNameLengthException(String message){
        super(message);
    }
}
