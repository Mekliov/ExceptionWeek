package Task2;

public class ConnectiocsToServerException extends Exception {
    String message1= "Connection to server go down";
    String message2="Please chek your network connection";
    public ConnectiocsToServerException()
          {
            getMessage();
          }
          @Override
        public String getMessage() {
        // TODO Auto-generated method stub
        return message1+"\n" +message2;
        }
}
