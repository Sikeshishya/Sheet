package LinkedList;

public class SinglyLL {
    public ListNode head;

    public void insertfirst(int val) {

        ListNode newNode = new ListNode(val);
        newNode.next = head;
        head = newNode;
    }

    public void insertlast(int val) {

        ListNode newnode = new ListNode(val);
        if (head == null) {
            head = newnode;
            return;
        }

        ListNode temp = head;

        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newnode;
    }

    public void printlist() {
        ListNode temp = head;

        while (temp != null) {
            System.out.print(temp.val + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public void deleteNode(ListNode node) {
        ListNode temp = head;
        if (head == null) {
            return;
        }

        if (head.val == node.val) {
            head = head.next;
            return;
        }

        ListNode deletenode = temp.next;

        while (deletenode!=null && deletenode.val != node.val) {
            temp = temp.next;
            deletenode = deletenode.next;
        }
        temp.next = deletenode.next;

    }


    public static void main(String[] args) {

        SinglyLL list = new SinglyLL();
        list.insertfirst(1);
        list.insertfirst(2);
        list.insertlast(3);
        list.insertlast(4);


        list.printlist();
    }

}






