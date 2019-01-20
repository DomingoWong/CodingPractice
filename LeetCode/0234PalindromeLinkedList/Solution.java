class Solution {
    public boolean isPalindromeStack(ListNode head) {
        if(head==null) return true;
        Stack<Integer> stk=new Stack<Integer>();
        ListNode slow=head;
        ListNode fast=head;
        
        while(fast!=null&&fast.next!=null){
            stk.push(slow.val);
            slow=slow.next;
            fast=fast.next.next;
        }
        // if the length is odd;
        if(fast!=null){
            slow=slow.next;
        }
        
        while(slow!=null){
            if(stk.isEmpty()||slow.val!=stk.pop()) return false;
            slow=slow.next;
        }
        return true;
    }

    public boolean isPalindromeMyOwn(ListNode head) {
        if (head == null) {
            return true;
        }
        //The "Runner" Technique
        ListNode p1 = head;
        int pcount = 0;
        ListNode p2 = head;
        while (p1 != null) {
            p1 = p1.next;
            pcount++;
            if (pcount == 2) {
                p2 = p2.next;
                pcount = 0;
            }
        }
        //p1 is fast, and at the end
        //p2 is slow, and at the mid
        //reverse p2, 
        ListNode current = null;
        ListNode nextNode = p2;
        while (p2.next != null) {
            nextNode = p2.next;
            p2.next = current;
            current = p2;
            p2 = nextNode;
        }
        p2.next = current;
        //compare p1 p2
        p1 = head;
        while (p1.next!=null) {
            if (p1.val != p2.val) {
                return false;
            }
            p1 = p1.next;
            p2 = p2.next;
        }
        return true;
    }
}