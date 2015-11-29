import java.util.*;

public class mergeKSortedLists{
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

        ListNode n9 = new ListNode(0);

        ListNode.print(mergeKLists(new ListNode[]{n1,n5,n9}));

    }

    private static Comparator<ListNode> ListNodeComparator = new Comparator<ListNode>(){
        public int compare(ListNode left, ListNode right){
            if (left == null){
            return -1;
            }else if (right == null){
                return 1;
            }else{
            return left.val - right.val;
            }
        }
    };

    public static ListNode mergeKLists(ListNode[] lists){
        if(lists == null || lists.length == 0){
            return null;
        }
        Queue<ListNode> heap = new PriorityQueue<ListNode>(lists.length, ListNodeComparator);
        for(ListNode node: lists){
            if (node != null){
                heap.add(node);
            }
        }
        ListNode dummy = new ListNode(0);
        ListNode tail = dummy;

        while (!heap.isEmpty()){
            ListNode head = heap.poll();
            tail.next = head;
            tail = tail.next;
            if(head.next != null){
                heap.add(head.next);
            }
        }
        return dummy.next;
    }
}
