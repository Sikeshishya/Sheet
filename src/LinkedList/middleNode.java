package LinkedList;

public class middleNode {

    public ListNode middleNode(ListNode head) {

        if (head == null) {
            return null;
        }

        ListNode temp = head;
        int size = 0;
        int middle = 0;

        while (temp.next != null) {
            temp = temp.next;
            size++;
        }

        if (size % 2 == 0) {
            middle = size / 2;
        } else {
            middle = size / 2 + 1;
        }

        ListNode deletenode = head;
        int delete = 0;

        while (delete < middle) {
            deletenode = deletenode.next;
            delete++;
        }
        return deletenode;


    }
}
