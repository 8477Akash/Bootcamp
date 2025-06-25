package Collections.Q3;

import java.util.ArrayList;
import java.util.List;

class SpecialStack {
    int size;
    List<Integer> stack = new ArrayList<>();
    int min;

    public SpecialStack(int size) {
        this.size = size;
    }
    public void push(int x) {
        if (size == stack.size()) {
            System.err.println("Stack overflow");
            return;
        } else if(stack.isEmpty()) {
            stack.add(x);
            min = x;
        }  else if(x <= min) {
            stack.add(2*x - min);
            min = x;
        } else {
            stack.add(x);
        }

        System.out.println("Added : " + x);


    }
    public void pop() {
        if (size == 0) {
            System.err.println("Stack underflow");
            return ;
        }
        int res = stack.get(stack.size()-1);
        stack.remove(stack.size()-1);
        if (res<=min) {
            int x = 0;
            x = min;
            min = 2*min - res;
            res = x;
        }
        System.out.println("Popped  : " + res);
        System.out.println("\n\n");
    }

    public void peek() {
        System.out.println("Using Peek we get : "+stack.get(stack.size()-1));

        System.out.println("\n\n");
    }
    public void isEmpty() {
        if(stack.isEmpty()){
            System.out.println("Stack is empty");
        }else  {
            System.out.println("Stack is not empty");
        }
        System.out.println("\n\n");
    }
    public void isFull() {
       if(stack.size()==size){
           System.out.println("Stack is full");
       } else  {
           System.out.println("Stack is not full");
       }
        System.out.println("\n\n");
    }

    public void getMin() {
        System.out.println("Using GetMin we get : "+min);
        System.out.println("\n\n");
    }
}

public class Q3 {
    public static void stackMethod() {
        SpecialStack stack = new SpecialStack(10);
        stack.push(3);
        stack.push(2);
        stack.push(5);
        stack.push(1);
        System.out.println("\n\n");

        stack.peek();
        stack.isEmpty();
        stack.isFull();
        stack.getMin();
        stack.pop();
        stack.getMin();

    }
}
