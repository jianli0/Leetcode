public class mergeTwoSortedLists{
    public static void main(String[] args){
        ListNode n1 = new ListNode(1);
        ListNode n2 = new ListNode(3);
        ListNode n3 = new ListNode(5);
        ListNode n4 = new ListNode(7);
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;

        ListNode n5 = new ListNode(3);
        ListNode n6 = new ListNode(6);
        ListNode n7 = new ListNode(8);
        ListNode n8 = new ListNode(9);
        n5.next = n6;
        n6.next = n7;
        n7.next = n8;

        ListNode.print(mergeTwoLists(n1,n5));
    }

    public static ListNode mergeTwoLists(ListNode l1, ListNode l2){
        ListNode head = new ListNode(0);
        ListNode dummy = head;

        while(l1 != null && l2 != null){
            if (l1.val < l2.val){
                head.next = l1;
                head = head.next;
                l1 = l1.next;
            }else{
                head.next = l2;
                head = head.next;
                l2 = l2.next;
            }
        }

        if(l1 != null){
            head.next = l1;
        }

        if(l2 != null){
            head.next = l2;
        }
        return dummy.next;
    }
}
