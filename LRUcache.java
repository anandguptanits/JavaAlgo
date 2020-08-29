//We are given total possible page numbers 
//that can be referred. We are also given cache 
//(or memory) size (Number of page frames that cache can hold at a time).
// The LRU caching scheme is to remove the least recently used frame when the cache is
// full and a new page is referenced which is not there in cache.


import java.util.*;

public class LRUcache {

    int capacity;
    Map<Integer, Node> map;
    Node head, tail;

    public LRUcache(int capacity) {
        this.capacity = capacity;
        this.map = new HashMap<>();
        head = new Node(-1, -1);
        tail = new Node(-1, -1);
        this.head.next = this.tail;
        this.tail.prev = head;
    }

    public int get(int key) {
        if (!map.containsKey(key)) return -1;
        Node cur = map.get(key);
        remove(cur);
        addToHead(cur);
        return cur.value;
    }

    public void put(int key, int value) {
        if (map.containsKey(key)) {
            Node cur = map.get(key);
            cur.value = value;
            remove(cur);
            addToHead(cur);
        } else {
            Node cur = new Node(key, value);
            map.put(key, cur);
            addToHead(cur);
            if (map.size() > capacity) {
                Node todelete = tail.prev;
                remove(tail.prev);
                map.remove(todelete.key);
            }
        }
    }

    private void remove(Node cur) {
        Node prev = cur.prev, next = cur.next;
        prev.next = next;
        next.prev = prev;
        cur.prev = cur.next = null;
    }

    private void addToHead(Node cur) {
        cur.next = head.next;
        head.next.prev = cur;
        head.next = cur;
        cur.prev = head;
    }

    class Node {
        int key, value;
        Node next, prev;
        public Node(int key, int value) {
            this.key = key;
            this.value = value;
            this.next = this.prev = null;
        }
    }
}