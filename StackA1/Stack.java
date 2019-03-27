public class Stack{
    //Array to hold elements
    int stack[] = new int[5];
    int stackIndex = 0;

    //Push Method; pushes then increments by 1
    public void push(int data){

        // Checks if inbounds; Q: when use .length gets OutOfBoundsException instead, why?
        if(stackIndex == 5 /*stack.length + 1*/){
            System.out.println("Stack is full");
        } else {
            stack[stackIndex] = data;
            stackIndex++;
        }
    }

    //Pop Method; Removes and fetches the new recent value
    public int pop(){
        //Declare data
        int data;
        stackIndex--;
        data = stack[stackIndex];
        stack[stackIndex] = 0;
        return data;
    }

    //Peek Method; fetching last value
    public int peek(){
        //Declare data
        int data;
        data = stack[stackIndex-1];
        return data;
    }
    //Returns the size of the Stack
    public int size(){
        return stackIndex;
    }

    //IsEmpty
    public boolean isEmpty(){
        return stackIndex <=0;
    }

    //Show Method; returns current contents of the stack
    public void show(){
        for (int n : stack){
            System.out.println(n + " ");
        }
    }
}
