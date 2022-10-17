public class MyMain {
	public static void main(String[] args) {
		MyArrayStack myStack = new MyArrayStack(3);
		myStack.push(1);
		myStack.push(2);
		myStack.push(3);
		myStack.push(4);
//		myStack.show();
//		System.out.println(myStack.push(4));
//
//		myStack.pop();
//		myStack.show();
//		myStack.pop();
//		myStack.show();
//		myStack.pop();
//		myStack.show();
//		myStack.pop();
//		myStack.show();
		//

//		MyArrayQueue myQueue = new MyArrayQueue(3);
//		System.out.println(myQueue.push(1));
//		System.out.println(myQueue.count());
//		System.out.println(myQueue.push(2));
//		System.out.println(myQueue.count());
//		System.out.println(myQueue.push(3));
//		System.out.println(myQueue.count());
//		System.out.println(myQueue.push(4));
//		System.out.println(myQueue.count());
//		myQueue.show();
//		myQueue.pop();
//		System.out.println(myQueue.count());
//		myQueue.show();

		MyLinkedListStack stack = new MyLinkedListStack();
		System.out.println(stack.push(1));
		System.out.println(stack.push(2));
		System.out.println(stack.push(3));
		System.out.println(stack.push(4));
		System.out.println(stack.push(5));
		stack.show();

	}
}
