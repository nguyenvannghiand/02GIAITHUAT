public class LinkedList {

    /*
    *
    */
    public static class Node {
        int value;
        Node next;
        Node(int value){
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
            // B1. Xac dinh Last Node
            Node lastNode = headNode;
            while (lastNode.next != null) {
                lastNode = lastNode.next;
            }
            // B2. gan next cho lastNode = new Node
            lastNode.next = newNode;
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

    }
}
