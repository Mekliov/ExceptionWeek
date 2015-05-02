package Task5;

import java.util.Arrays;
import java.util.List;

public class ArrayAsList implements asList {

    @Override
    public List asList(Object[] arr) {
        
        return Arrays.asList(arr);
    }
    
    

}
