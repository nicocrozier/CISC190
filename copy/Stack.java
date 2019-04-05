
public class Stack{

    int stack[]= new int[2];
    int stackIndex = 0;

    //Push
    public void push(int data){
        
        stack[stackIndex] = data;
        stackIndex++;


    }

    public int peek(){
        int data;
        data = stack[stackIndex-1];
        return data;
    }
}
