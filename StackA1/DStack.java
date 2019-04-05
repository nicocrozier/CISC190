
public class DStack {


    //Array to hold elements
    int capacity = 5;
    int stack[] = new int[capacity];
    int stackIndex = 0;



    //Push Method; pushes then increments by 1
    public void push(int data){

        if(size() == capacity)
            expand();

        stack[stackIndex] = data;
        stackIndex++;
    }

    //Makes a new stack 2x the size.
    private void expand(){
        int length = size();
        int newStack[] = new int[capacity * 2];
        System.arraycopy(stack, 0, newStack, length);
        stack = newStack;
        capacity *= 2;
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
