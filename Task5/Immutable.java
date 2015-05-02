package Task5;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Immutable<E> extends ArrayList<E> {
    public List list = new ArrayList<E>();

    public Immutable(Collection<? extends E> collection) {

        list.addAll(collection);
        list = Collections.unmodifiableList(list);
        System.out.println(list);

    }

    @Override
    public E get(int index) {
        Object obj = list.get(index);
        return (E) obj;
    }

    @SafeVarargs
    public static <T> List<T> asList(T... arguments) {
        Object[] arr = new Object[arguments.length];
        for (int i = 0; i < arguments.length; i++) {
            arr[i] = arguments[i];
        }
        List list= new  ArrayList();
        ArrayAsList as= new ArrayAsList();
        list=as.asList(arr);

        return list;

    }

}
