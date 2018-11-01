package Exceptions;

public class cellFullException extends Exception
{
    public cellFullException(String message) { super(message); }
    public cellFullException(String message, Throwable throwable) { super(message, throwable); }
    public cellFullException(Throwable cause) { super(cause); }
}
