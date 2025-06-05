package exceptions;

public class WrongCategoryException extends RuntimeException{
    public WrongCategoryException(String message){
        super(message);
    }
}
