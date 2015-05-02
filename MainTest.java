
public class MainTest {

    public static void main(String[] args) {
try{
    throw new DatabaseCorruptedException();
}
catch(DatabaseCorruptedException e)
{
   e.printStackTrace();
}
    }

}
