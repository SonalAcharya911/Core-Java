package exceptions;

public class UserNameStartsWithNumberexception extends RuntimeException{
    public UserNameStartsWithNumberexception(String message){
        super(message);
    }
}
