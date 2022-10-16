public class ReverseLinkedList_206 {

    public static class ListNode {
        int val;
        ListNode next;

        public ListNode() {
        }

        public ListNode(int val) {
            this.val = val;
        }

        public ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public static ListNode reverseList(ListNode head) {
        ListNode currNode = head;
        while (currNode != null && currNode.next != null) {
            ListNode nextNode = currNode.next;
            currNode.next = nextNode.next;
            nextNode.next = head;
            head = nextNode;
        }
        return head;
    }

    private static void printLinkedList(ListNode head) {
        while (head != null) {
            System.out.printf("%d", head.val);
            head = head.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        ListNode a1 = new ListNode(1);
        ListNode a2 = new ListNode(2);
        ListNode a3 = new ListNode(3);
        ListNode a4 = new ListNode(4);
        a1.next = a2;
        a2.next = a3;
        a3.next = a4;
        printLinkedList(a1);
        ListNode newList = reverseList(a1);
        printLinkedList(newList);

    }
}
