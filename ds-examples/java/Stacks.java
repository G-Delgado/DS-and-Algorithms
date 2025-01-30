import java.util.ArrayList;

public class Stacks {
    public static void main(String[] args) {
        StackManual stack = new StackManual();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.push(6);
        stack.push(7);
        stack.push(8);
        System.out.println(stack.printStack());

        // Delete two elements at the top
        stack.pop();
        stack.pop();
        System.out.println(stack.printStack());

        // See the top element;
        System.out.println(stack.peek());
        // See if it didn't remove it
        System.out.println(stack.printStack());
    }
}

class StackManual {
    private ArrayList<Integer> stack;
    public StackManual() {
        stack = new ArrayList<>();
    }

    // Puts a new element at the top of the stack
    public void push(int element) {
        stack.add(element);
    }

    // Returns the top element of the stack and removes it from the stack
    public int pop() {
        if (isEmpty()) {
            System.out.println("The stack is empty!");
            return -1;
        } else {
            return stack.remove(stack.size() - 1);
        }

    }

    // Returns the top element without removing it from the stack
    public int peek() {
        if (isEmpty()) {
            System.out.println("The stack is empty!");
            return -1;
        } else {
            return stack.get(stack.size() - 1);
        }
    }
    
    // Check if the stack is empty
    public boolean isEmpty() {
        return stack.isEmpty();
    }

    // Returns the size of the stack    
    public int size() {
        return stack.size();
    }

    public String printStack() {
        String printString = "";
        if (isEmpty()) {
            System.out.println("The stack is empty");
        } else {
            int initIndex = stack.size() - 1;
            int currentElement = stack.get(stack.size() - 1);
            printString = currentElement + "\n";
            while (initIndex > 0) {
                initIndex -= 1;
                printString += stack.get(initIndex) + "\n";
            }
        }


        return printString;
    }
}
