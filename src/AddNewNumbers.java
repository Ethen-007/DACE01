class ListNode{
    int val;
    ListNode next;
    ListNode(int x){
        this.val = x;
    }
}

public class AddNewNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummyHead = new ListNode(0);
        ListNode p = l1,q = l2,current
                = dummyHead;
        int carry = 0;
        while(p!=null || q!=null){
            int x = (p!=null)?p.val:0;
            int y = (q!=null)?q.val:0;
            int sum = carry+x+y;
            carry = sum/10;
            current.next = new ListNode(sum%10);
            current = current.next;
            if(p!= null)p=p.next;
            if(q!= null)q=q.next;

        }
        if(carry>0){
            current.next = new ListNode(carry);
        }
        return dummyHead.next;
    }
    public static void main(String[] args) {
        AddNewNumbers addNewNumbers = new AddNewNumbers();
        ListNode l1 = new ListNode(1);
        l1.next = new ListNode(2);
        l1.next.next = new ListNode(3);
        ListNode l2 = new ListNode(5);
        l2.next = new ListNode(6);
        l2.next.next = new ListNode(7);

        ListNode result = addNewNumbers.addTwoNumbers(l1, l2);
        while(result!=null){
            System.out.print(result.val);
            if(result.next!=null){
                System.out.println("->");
            }
            result = result.next;
        }
    }
}
