    package edu.sdccd.mesa.cisc190.util; 
    
    public class IntegerStack
    {
        
        // member variables go here
        private int[] stack;
        private int index;
    
        public IntegerStack() // Construtor, same name as the class. Where you declare varibles.
        {
            stack = new int[10];
            //this(10);
            index = 0;
        }
    
        public IntegerStack(int initialCapacity) // Args constructor 
        {
            stack = new int[initialCapacity];
            index = 0;
        }
    
        /**
         * Look at the top value in the stack, without removing it.
         * @return the value at the top 
         */
        public int peek()
        {
            return intArray[arrayPosition-1];
        }
        
        /**
         * Pop a value into the stack
         * @return the value removed 
         */
        public int pop()
        {
            if (arrayPosition <= 0) {
            arrayPosition -= 1;
            return intArray[arrayPosition];
        }
        else
        {
            return 0;
        }
    }
    
    /**
     * Push a value into the stack
     * @param value the value to push 
     */
    public void push(int value)
    {
       if ( arrayPosition < intArray.length )
       {
           intArray[arrayPosition] = value;
           arrayPosition += 1;
       }
       else
       {
           // Nothing happens
       }
       
       public String.toString()
       {
           return "{arrayPosition : " + arrayPosition + ", intArray : " + intArray.toString() + "}";
       }
    }











