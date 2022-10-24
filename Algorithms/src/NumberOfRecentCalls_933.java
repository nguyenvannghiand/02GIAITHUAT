import java.util.LinkedList;
import java.util.Queue;

public class NumberOfRecentCalls_933 {
	public NumberOfRecentCalls_933() {

	}

	private final Queue<Integer> myQueue = new LinkedList<>();

	public int ping(int t) {
		myQueue.add(t);
		while (!myQueue.isEmpty() && myQueue.peek() < t - 3000) {
			myQueue.remove();
		}
		return myQueue.size();
	}
}
