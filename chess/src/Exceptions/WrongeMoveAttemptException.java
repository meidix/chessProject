package Exceptions;


public class WrongeMoveAttemptException extends Exception
{
    public WrongeMoveAttemptException(String message) { super(message); }
    public WrongeMoveAttemptException(String message, Throwable throwable) { super(message, throwable); }
    public WrongeMoveAttemptException(Throwable cause) { super(cause); }
}
