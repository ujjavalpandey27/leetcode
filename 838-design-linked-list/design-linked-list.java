class Node{
    int val;
    Node next;
    Node prev;
    public Node(){
        val=0;
        next=null;
        prev=null;
    }
    public Node(int val,Node next, Node prev){
        this.val=val;
        this.next=next;
        this.prev=prev;
    }
   public Node(int val){
        this.val=val;
        next=null;
        prev=null;
    }
   

}
class MyLinkedList {
    Node head;
    Node tail;
    int size;

    public MyLinkedList() {
        head=new Node();
        tail=new Node();
        head.next=tail;
        tail.prev=head;
        
        size=0;
    }
    
    public int get(int index) {
        if(index>=size){
            return -1;
        }
        Node temp=head;
        for(int i=0;i<=index;i++){
           
            temp=temp.next;
          
        }
        return temp.val;
    }
    
    public void addAtHead(int val) {
        Node temp=new Node(val);
        temp.next=head.next;
        if(head.next!=null){
        head.next.prev=temp;}
        head.next=temp;
        temp.prev=head;
        size++;
        

    }
    
    public void addAtTail(int val) {
        Node temp=new Node(val);
        temp.prev=tail.prev;
        temp.next=tail;
        tail.prev.next=temp;
        tail.prev=temp;
        size++;
    }
    
    public void addAtIndex(int index, int val) {
        if(index>size)
        return;
        if(size==index){
            addAtTail(val);
            return;
        }
        Node temp=head;

        for(int i=0;i<index;i++){
            
                temp=temp.next;
            
        }
        Node temp1=temp.next;
        temp.next=new Node(val);
        temp.next.next=temp1;
        temp.next.prev=temp;
        temp1.prev=temp.next;
        size++;
    }
    
    public void deleteAtIndex(int index) {
       if(index>=size || size<=0)
        return;
        Node temp=head;
        for(int i=0;i<index;i++){
            
                temp=temp.next;
            
        }
        Node temp1=temp.next;
        temp.next=temp1.next;
        if(temp1.next!=null)
        temp1.next.prev=temp1.prev;
        size--;
    }
}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */