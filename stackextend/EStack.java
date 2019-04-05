
import java.util.ArrayList;

public class EStack<T> extends ArrayList<T>{

    void push(T value){
        add(value);
    }

    T pop(){
        return remove(size() - 1);
    }
}
