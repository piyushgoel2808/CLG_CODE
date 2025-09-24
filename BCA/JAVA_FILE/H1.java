//This program is Written by Piyush Goel
interface Stack {
    void push(int item);
    int pop();
  }
  
  class FixedStack implements Stack {
    private int[] stack;
    private int top;
  
    FixedStack(int size) {
      stack = new int[size];
      top = -1;
    }
  
    public void push(int item) {
      if (top == stack.length - 1) {
        System.out.println("Stack overflow");
      } else {
        stack[++top] = item;
      }
    }
  
    public int pop() {
      if (top < 0) {
        System.out.println("Stack underflow");
        return 0;
      } else {
        return stack[top--];
      }
    }
  }
  
  public class H1 {
    public static void main(String[] args) {
      FixedStack fs = new FixedStack(3);
      fs.push(1);
      fs.push(2);
      fs.push(3);
  
      System.out.println(fs.pop());
      System.out.println(fs.pop());
      System.out.println(fs.pop());
    }
  }