import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class StackQueueInJava {
    public static void main(String[] args) {
//        Stack<Integer> myStack = new Stack<>();
//        myStack.push(1);
//        myStack.push(2);
//        myStack.push(3);
//        myStack.push(4);
//        myStack.push(5);
//        for (Integer item: myStack) {
//            System.out.println(item);
//        }
//        System.out.println("pop: " + myStack.pop());
//        for (Integer item: myStack) {
//            System.out.println(item);
//        }
        Queue<Integer> myQueue = new LinkedList<>();
        myQueue.add(1);
        myQueue.add(2);
        myQueue.add(3);
        myQueue.add(4);
        for (Integer integer : myQueue) {
            System.out.println(integer);
        }
        System.out.println("Is empty: " + myQueue.isEmpty());
        System.out.println("Remove_" + myQueue.remove());;
        for (Integer integer : myQueue) {
            System.out.println(integer);
        }
    }
}
