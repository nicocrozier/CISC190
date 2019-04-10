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
    
}



