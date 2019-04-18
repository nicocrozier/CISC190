public class main {

    public static void main(String[] args){

        // Stack class, Object
        Stack nums = new Stack();
        nums.push(15);
        nums.push(8);
        nums.push(55);
        
        
        nums.show();
        
        nums.pop();
        nums.pop();
        nums.pop();
        nums.pop(); 
        
        nums.peek();
    }
}