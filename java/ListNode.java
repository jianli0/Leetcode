// *
// Definition for singly-linked list.
import java.util.ArrayList;

public class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }

    public static void print(ListNode node){
        ArrayList<Integer> elements = new ArrayList<Integer>();
        while (node != null){
            elements.add(node.val);
            node = node.next;
        }
        System.out.println(elements.toString());
    }

}

