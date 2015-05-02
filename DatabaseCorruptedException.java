public class DatabaseCorruptedException extends RuntimeException {
  String user="User";
  String message="DatabaseIsNotAviable";
    public DatabaseCorruptedException() {
       
        getMessage();
        
    }
    @Override
        public String getMessage() {
            
            return user+"  "+ message;
        }
    }
