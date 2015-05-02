package Task4;

public class NullKeyException extends RuntimeException {
    String message="Your key can not be a null";
    public  NullKeyException()
    {
        getMessage();
    }
    @Override
    public String getMessage() {
        // TODO Auto-generated method stub
        return this.message;
    }

}
