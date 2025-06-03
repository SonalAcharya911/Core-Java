package exceptions;

public class UserNameLengthException extends RuntimeException{
    public UserNameLengthException(String message){
        super(message);
    }
}
