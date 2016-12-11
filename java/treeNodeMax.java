import java.util.*;

class Node{
    int val;
    List<Node> successors;
    public Node(int val){
        this.val = val;
        this.successors = new ArrayList<Node>();
    }
}

public class treeNodeMax{
    public static void main(String[] args){
        Node n1 = new Node(10);
        Node n2 = new Node(5);
        Node n3 = new Node(2);
        Node n4 = new Node(2);
        Node n5 = new Node(1);
        Node n6 = new Node(1);
        List<Node> s1 = new ArrayList<Node>();
        s1.add(n2);
        s1.add(n3);
        s1.add(n4);

        List<Node> s2 = new ArrayList<Node>();
        s2.add(n5);
        s2.add(n6);

        n1.successors = s1;
        n2.successors = s2;

        treeNodeMax a = new treeNodeMax();
        System.out.println(a.treenodeMax(n1).val);
    }

    public Node treenodeMax(Node root){
        Map<Node, Integer> sumMap = new HashMap<Node,Integer>();
        Map<Node, Integer> countMap = new HashMap<Node,Integer>();
        if(root == null){
        }
        helperSum(root, sumMap);
        helperCount(root, countMap);

        int maxAvg = Integer.MIN_VALUE;
        Node maxAvgNode = root;

        for(Map.Entry<Node,Integer> e : sumMap.entrySet()){
            System.out.println(e.getKey().val + " " + e.getValue());
        }
        System.out.println("hello world");

        for(Map.Entry<Node,Integer> e : countMap.entrySet()){
            System.out.println(e.getKey().val + " " + e.getValue());
        }

        for(Map.Entry<Node,Integer> e : sumMap.entrySet()){
            Node n = e.getKey();
            int avg = e.getValue() / countMap.get(n) ;
            if(avg > maxAvg){
                maxAvg = avg;
                maxAvgNode = n;
            }
        }
        return maxAvgNode;
    }

    public int helperSum(Node root, Map<Node, Integer> map){
        if(root == null){
            return 0;
        }
        int total = 0;
        total += root.val;
        for(Node n : root.successors){
            total += helperSum(n, map);
        }
        map.put(root, total);
        return total;
    }

    public int helperCount(Node root, Map<Node, Integer> map){
        if(root == null){
            return 0;
        }
        int total = 0;
        total += 1;
        for(Node n : root.successors){
            total += helperCount(n, map);
        }
        map.put(root, total);
        return total;
    }
}

