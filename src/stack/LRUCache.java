package stack;

import javax.swing.plaf.nimbus.NimbusStyle;
import java.util.HashMap;
import java.util.LinkedList;

public class LRUCache {

    Node head = new Node(0, 0);
    Node tail = new Node(0, 0);
    HashMap<Integer, Node> map = new HashMap<>();
    int capacity_;

    public LRUCache(int capacity) {
        capacity_ = capacity;
        head.next = tail;
        tail.prev = head;
    }

    public int get(int key) {

        if (!map.containsKey(key)) {
            return -1;
        }

        Node node = map.get(key);
        deletenode(node);
        insertfirst(node);

        return node.value;

    }

    public void put(int key, int value) {
        if (map.containsKey(key)) {
            deletenode(map.get(key));
        }

        if (map.size() == capacity_) {
            deletenode(tail.prev);

        }
        insertfirst(new Node(key, value));

    }

    public void deletenode(Node node) {

        map.remove(node.key);
        Node prevnode = node.prev;
        Node afternode = node.next;
        prevnode.next = afternode;
        afternode.prev = prevnode;

    }

    public void insertfirst(Node node) {

        Node curr_after_head = head.next;
        head.next = node;
        node.prev = head;
        node.next = curr_after_head;
        curr_after_head.prev = node;
        map.put(node.key, node);

    }


}

class Node {

    int key;
    int value;
    Node next;
    Node prev;

    Node(int key, int value) {
        this.key = key;
        this.value = value;
    }
}
