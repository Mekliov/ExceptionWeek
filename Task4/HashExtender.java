package Task4;

import java.util.HashMap;

public class HashExtender extends HashMap {
    boolean flag = true;
     HashMap map= new HashMap();
    public HashExtender(boolean flag) {
        this.flag = flag;

    }

    @Override
    public Object put(Object key, Object value) {
        if (key == null && flag == true) {
            throw new NullKeyException();
        }

        else {
            return super.put(key, value);
        }
    }

    @Override
    public Object get(Object key) {
        if (key == null && flag == true) {
            throw new NullKeyException();
        }

        else {
            return super.get(key);
        }

    }
}
