import java.util.Stack;

public class StackQueueInJava {
    public static void main(String[] args) {
        Stack<Integer> myStack = new Stack<>();
        myStack.push(1);
        myStack.push(2);
        myStack.push(3);
        myStack.push(4);
        myStack.push(5);
        for (Integer item: myStack) {
            System.out.println(item);
        }
        System.out.println("pop: " + myStack.pop());
        for (Integer item: myStack) {
            System.out.println(item);
        }
    }
}
