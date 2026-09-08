class Node{
    Node next,prev;
    int freq ,key,val;
    public Node(int key,int val){
        this.val=val;
        this.key=key;
        freq=1;
    };
}
class Dll{
    Node head,tail;
    int size;
    public Dll(){
        head=new Node(-1,-1);
        tail=new Node(-1,-1);
        head.next=tail;
        tail.prev=head;
    }
    public void addfirst(Node node){
        node.prev=head;
        node.next=head.next;
        head.next.prev=node;
        head.next=node;
        size++;
    }
    public void remove(Node node){
        node.next.prev=node.prev;
        node.prev.next=node.next;
        size--;
    }
    public Node removelast(){
        if(size>0){
            Node last=tail.prev;
            remove(last);
            return last;
        }
        return null;
    }
}
class LFUCache {
    HashMap<Integer,Node> hash;
    HashMap<Integer,Dll> hash1;
    int minfreq;
    int capacity;

    public LFUCache(int capacity) {
        this.capacity=capacity;
        minfreq=0;
        hash=new HashMap<>();
        hash1=new HashMap();
    }

    public int get(int key) {
    if(!hash.containsKey(key)){
        return -1;
    }
    Node node=hash.get(key);
    promote(node);
    return node.val;
    }

    public void put(int key, int value) {
    if(capacity==0){
        return;
    }
    if(hash.containsKey(key)){
        hash.get(key).val=value;
        promote(hash.get(key));
    }
    else{
        if(hash.size()==capacity){
            hash.remove(hash1.get(minfreq).removelast().key);

        }
        Node node=new Node(key,value);
        hash.put(key,node);
        
        minfreq=1;
        hash1.putIfAbsent(1,new Dll());
        hash1.get(1).addfirst(node);
    }
    }
    public void promote(Node node){
    int oldfreq=node.freq;
    node.freq++;
    Dll dll=hash1.get(oldfreq);
    dll.remove(node);
    
        if(minfreq==oldfreq && dll.size==0){
            minfreq++;
        }
        hash1.putIfAbsent(oldfreq+1,new Dll());
        hash1.get(oldfreq+1).addfirst(node);
    
    }
    }

/**
 * Your LFUCache object will be instantiated and called as such:
 * LFUCache obj = new LFUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */