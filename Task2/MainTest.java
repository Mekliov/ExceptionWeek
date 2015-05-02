package Task2;

public class MainTest {

    public static void main(String[] args) {
        try{
            throw new ConnectiocsToServerException();
        }
        catch(ConnectiocsToServerException e)
        {
            e.printStackTrace();
        }

    }

}
