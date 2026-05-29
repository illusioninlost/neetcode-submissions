class ListNode {
    public String val;
    public ListNode prev;
    public ListNode next;

    public ListNode(String val, ListNode prev, ListNode next) {
        this.val = val;
        this.prev = prev;
        this.next = next;
    }

    public ListNode(String val) {
        this(val, null, null);
    }
}

class BrowserHistory {
    private ListNode cur;
    public BrowserHistory(String homepage) {
        cur = new ListNode(homepage);
    }

    public void visit(String url) {
        cur.next = new ListNode(url,cur, null);
        cur = cur.next;
    }

    public String back(int steps) {
        while(cur.prev != null && steps > 0){
            cur = cur.prev;
            steps--;
        }
        return cur.val;
    }

    public String forward(int steps) {
        while(cur.next != null && steps > 0){
            cur = cur.next;
            steps--;
        }
        return cur.val;
    }
}

/**
 * Your BrowserHistory object will be instantiated and called as such:
 * BrowserHistory obj = new BrowserHistory(homepage);
 * obj.visit(url);
 * String param_2 = obj.back(steps);
 * String param_3 = obj.forward(steps);
 */