import java.util.*;

class RandomListNode{
    int label;
    RandomListNode next, random;
    RandomListNode(int x){
        this.label = x;
    }
}

public class copyRandomList{
    public static void main(String[] args){
        System.out.println();
    }

    public static RandomListNode copyRandomList(RandomListNode head){
        Map<RandomListNode, RandomListNode> map = new HashMap<RandomListNode, RandomListNode>();

        RandomListNode node = head;
        while(node != null){
            map.put(node, new RandomListNode(node.label));
            node = node.next;
        }

        node = head;
        while(node != null){
            map.get(node).next = node.next;
            map.get(node).random = node.random;
            node = node.next;
        }
        return map.get(head);
    }
}

