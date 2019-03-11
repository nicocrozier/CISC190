
public class stack{
    
    String[] stack = new String[10];
    int stackIndex = 0;
    
        
    public void push(String param) {
        if (stackIndex >= 0 && stackIndex < stack.length){
            stack[stackIndex] = param;
            stackIndex += 1;
        } else {
            System.out.println("Out of bounds");
        }
    }
    
    public String pop() {
        if (stackIndex >= 0 && stackIndex < stack.length){
            stackIndex -= 1;
        } else {
            System.out.println("Out of Bounds");
        }
        return stack[stackIndex];
    }
    
    public String peek() {
        return stack[stackIndex];
    }
}



