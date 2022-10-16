
public class LinkedList {

	/*
	 *
	 */
	public static class Node {
		int value;
		Node next;

		Node(int value) {
			this.value = value;
		}
	}

	public static void printLinkedList(Node head) {
		if (head == null) {
			System.out.println("List is emty!");
		} else {
			Node temp = head;
			while (temp != null) {
				System.out.print(temp.value);
				temp = temp.next;
				if (temp != null) {
					System.out.print("->");
				} else {
					System.out.println();
				}
			}
		}
	}

	private static Node addToHead(Node headNode, int value) {
		Node newNode = new Node(value);
		if (headNode != null) {
			newNode.next = headNode;
		}
		return newNode;
	}

	private static Node addToTail(Node headNode, int value) {
		Node newNode = new Node(value);
		if (headNode == null) {
			return newNode;
		} else {
			// B1. Xac dinh Last Node(lastNode.next == null)
			Node lastNode = headNode;
			while (lastNode.next != null) {
				lastNode = lastNode.next;
			}
			// B2. gan next cho lastNode = new Node
			lastNode.next = newNode;
		}
		return headNode;
	}

	private static Node addToIndex(Node headNode, int value, int index) {
		if (index == 0) {
			return addToHead(headNode, value);
		} else {
			// B1. Tim vi tri can them
            Node newNode = new Node(value);
			Node currentNode = headNode;
			int count = 0;
			while (currentNode != null) {
				count++;
				if (count == index) {
					// Thuc hien add
                    newNode.next = currentNode.next;
                    currentNode.next = newNode;
					break;
				}
				currentNode = currentNode.next;
			}
		}
		return headNode;
	}

    private static Node removeAtHead(Node headNode) {
        if (headNode != null) {
            return headNode.next;
        }
        return headNode;
    }

    private static Node removeAtTail(Node headNode) {
        if (headNode == null) {
            return null;
        }
        //B1.Xac dinh last vaf previous
        Node lastNode = headNode;
        Node prevNode = null;
        while (lastNode.next != null) {
            prevNode = lastNode;
            lastNode = lastNode.next;
        }
        if (prevNode == null) {
            return null;
        } else {
            prevNode.next = null;
        }

        return headNode;
    }

    private static Node removeAtIndex(Node headNode, int index) {
        if (headNode == null || index < 0) {
            return null;
        }
        if (index == 0) {
            return removeAtHead(headNode);
        }

        Node currentNode = headNode;
        Node prevNode = null;
        int count = 0;
        boolean bIsFound = false;
        while (currentNode != null) {
            if (count == index) {
                // remove currentNode
                bIsFound = true;
                break;
            }
            prevNode = currentNode;
            currentNode = currentNode.next;
            count++;
        }

        // remove currentNode
        if (bIsFound) {
            prevNode.next = currentNode.next;
        }

        return headNode;
    }

	public static void main(String[] args) {
		Node n1 = new Node(1);
		Node n2 = new Node(2);
		Node n3 = new Node(3);
		n1.next = n2;
		n2.next = n3;
		printLinkedList(n1);
		Node newList = addToHead(n1, 0);
		printLinkedList(newList);
		n1 = addToTail(n1, 0);
		printLinkedList(n1);

        n1 = addToIndex(n1, 0, 0);
        printLinkedList(n1);
        n1 = addToIndex(n1, 4, 4);
        printLinkedList(n1);

        n1 = removeAtHead(n1);
        printLinkedList(n1);
        n1 = removeAtTail(n1);
        printLinkedList(n1);
        n1 = removeAtTail(n1);
        printLinkedList(n1);
        //

        n1 = removeAtIndex(n1, 0);
        printLinkedList(n1);

        n1 = removeAtIndex(n1, 1);
        printLinkedList(n1);
	}
}
