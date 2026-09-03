

class Node {
    int key, val;
    Node next, prev;

    public Node(int key, int val) {
        this.key = key;
        this.val = val;
    }
}

class Dll {
    Node head, tail;

    public Dll() {
        head = new Node(-1, -1);
        tail = new Node(-1, -1);
        head.next = tail;
        tail.prev = head;
    }

    public void addFirst(Node node) {
        node.next = head.next;
        node.prev = head;
        head.next.prev = node;
        head.next = node;
    }

    public void remove(Node node) {
        node.prev.next = node.next;
        node.next.prev = node.prev;
    }

    public Node removeLast() {
        Node lastNode = tail.prev;
        remove(lastNode);
        return lastNode; 
}
}

class LRUCache {
    private int capacity;
    private HashMap<Integer, Node> map;
    private Dll dll;

    public LRUCache(int capacity) {
        this.capacity = capacity;
        this.map = new HashMap<>();
        this.dll = new Dll();
    }

    public int get(int key) {
        if (!map.containsKey(key)) {
            return -1;
        }
        Node node = map.get(key);
        
        dll.remove(node);
        dll.addFirst(node);
        return node.val;
    }

    public void put(int key, int value) {
        if (map.containsKey(key)) {
            Node existingNode = map.get(key);
            existingNode.val = value;
            dll.remove(existingNode);
            dll.addFirst(existingNode);
        } else {
            if (map.size() == capacity) {
                Node lruNode = dll.removeLast();
                map.remove(lruNode.key);
            }
            Node newNode = new Node(key, value);
            dll.addFirst(newNode);
            map.put(key, newNode);
        }
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */