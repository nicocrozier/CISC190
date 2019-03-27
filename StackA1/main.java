public class main {

    public static void main(String[] args){

        // Stack class, Object
        Stack nums = new Stack();
        nums.push(15);
        nums.push(8);
        nums.push(33);
        nums.push(88);
        nums.push(99);
        nums.push(100);


        //Pop
        nums.pop();

        //Size
        System.out.println("Size is " + nums.size());

        //Check if IsEmpty
        System.out.println("Empty=" + nums.isEmpty());

        nums.show();
    }

}
