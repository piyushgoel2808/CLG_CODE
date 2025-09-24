// Define a custom exception class for stack overflow
public class StackOverflowException extends Exception {
    // Constructor that takes a message as an argument
    public StackOverflowException(String message) {
        // Call the super class constructor with the message
        super(message);
    }
}

// Define a custom exception class for stack underflow
public class StackUnderflowException extends Exception {
    // Constructor that takes a message as an argument
    public StackUnderflowException(String message) {
        // Call the super class constructor with the message
        super(message);
    }
}

// Define a class for stack operations
public class Stack {
    // Define an array to store the elements of the stack
    private int[] arr;
    // Define a variable to keep track of the top of the stack
    private int top;
    // Define a variable to store the capacity of the stack
    private int capacity;

    // Constructor that takes the capacity as an argument
    public Stack(int capacity) {
        // Initialize the array with the given capacity
        this.arr = new int[capacity];
        // Initialize the top as -1
        this.top = -1;
        // Initialize the capacity as the given value
        this.capacity = capacity;
    }

    // Method to push an element into the stack
    public void push(int element) throws StackOverflowException {
        // Check if the stack is full and throw an exception if it is
        if (top == capacity - 1) {
            throw new StackOverflowException("Stack is full");
        } else {
            // Increment the top and store the element at that position
            top++;
            arr[top] = element;
            System.out.println("Pushed " + element + " into the stack");
        }
    }

    // Method to pop an element from the stack
    public int pop() throws StackUnderflowException {
        // Check if the stack is empty and throw an exception if it is
        if (top == -1) {
            throw new StackUnderflowException("Stack is empty");
        } else {
            // Store the element at the top and decrement the top
            int element = arr[top];
            top--;
            System.out.println("Popped " + element + " from the stack");
            return element;
        }
    }

    // Method to peek at the top element of the stack without removing it
    public int peek() throws StackUnderflowException {
        // Check if the stack is empty and throw an exception if it is
        if (top == -1) {
            throw new StackUnderflowException("Stack is empty");
        } else {
            // Return the element at the top
            return arr[top];
        }
    }

    // Method to check if the stack is empty
    public boolean isEmpty() {
        // Return true if the top is -1, false otherwise
        return top == -1;
    }

    // Method to check if the stack is full
    public boolean isFull() {
        // Return true if the top is equal to capacity - 1, false otherwise
        return top == capacity - 1;
    }
}

public class jav37 {
    public static void main(String[] args) {
        try {
            // Create a stack object with capacity 5
            Stack s = new Stack(5);
            // Push some elements into the stack
            s.push(10);
            s.push(20);
            s.push(30);
            s.push(40);
            s.push(50);
            // Try to push another element and catch the exception
            s.push(60);
        } catch (StackOverflowException e) {
            // Handle the exception
            System.out.println(e.getMessage());
        }

        try {
            // Create another stack object with capacity 3
            Stack s = new Stack(3);
            // Pop some elements from the stack and catch the exception
            s.pop();
        } catch (StackUnderflowException e) {
            // Handle the exception
            System.out.println(e.getMessage());
        }
    }
}

//                                                                                                                                                                                             .  