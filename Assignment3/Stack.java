// There still should be an exception when there is nothing on the stack when peek or pop is called.

public class Stack{
    //Array to hold elements
    int capacity = 2;
    int stack[] = new int[capacity];
    int stackIndex = 0;

    //Push Method; pushes then increments by 1
    public void push(int dataPushed){
        if( stackIndex == capacity ){
            expand();
            
        };
        stack[stackIndex] = dataPushed;
        stackIndex++;
        
    }
    
    //Makes a new stack 2x the size of previous Stack
    public void expand(){
        int length = stackIndex;
        int newStack[] = new int[capacity * 2];
        for( int i = 0; i < capacity; i++){
            newStack[i] = stack[i];
        }
        // Reassign
        stack = newStack;
        capacity *= 2;
        
    
    }
    
    //Shows whats in the stack
    public void show(){
        for (int n : stack){
            System.out.println(n + "");
        }
    }
    
    //Pop Method; Removes and fetches the new recent value
    public int pop(){
        if(stackIndex <= 0){
            throw new ArrayIndexOutOfBoundsException("Out of bounds!");
            
        } else {
            int data;
            stackIndex--;
            data = stack[stackIndex];
            stack[stackIndex] = 0;
            return data;
        }
    }
    
    //Peek Method; fetching last value
    public int peek(){
        if(stackIndex <= 0){
            throw new ArrayIndexOutOfBoundsException("Nothing on Stack");
        } else {
            //Declare data
            int data;
            data = stack[stackIndex-1];
            return data;
            
        }
       
    }
    
}



