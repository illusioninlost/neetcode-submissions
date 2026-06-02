class ListNode {
    public int val;
    public ListNode next;
    public ListNode prev;

    public ListNode(int val, ListNode next, ListNode prev) {
        this.val = val;
        this.next = next;
        this.prev = prev;
    }
}
class MyLinkedList {

    private ListNode head;
    private ListNode tail;
    private int size;
    public MyLinkedList() {
        head = new ListNode(0,null, null);
        tail= new ListNode(0,null, head);
        head.next =tail;
        size = 0;
    }
    private ListNode getPrev(int index){
        if(index <= size/2){
            ListNode cur = head;
            for(int i =0;i<index; i++){
                cur = cur.next;
            }
            return cur;
        }else{
            ListNode cur = tail;
            for(int i=0; i<size-index +1;i++){
                cur = cur.prev;
            }
            return cur;
        }
    }

    public int get(int index) {
        if(index>=size) return -1;
        return getPrev(index).next.val;
    }

    public void addAtHead(int val) {
        addAtIndex(0,val);
    }

    public void addAtTail(int val) {
        addAtIndex(size,val);
    }

    public void addAtIndex(int index, int val) {
        if(index > size) return;
        ListNode prev = getPrev(index);
        ListNode next = prev.next;
        ListNode newNode = new ListNode(val, next, prev);
        prev.next = newNode;
        next.prev = newNode;
        size++;
    }

    public void deleteAtIndex(int index) {
          if(index >= size) return;
        ListNode prev = getPrev(index);
        ListNode nextNode = prev.next.next;
        prev.next = nextNode;
        nextNode.prev= prev;
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