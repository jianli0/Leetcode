import java.util.*;
public class binaryTreeLevelOrderTraversal{
    public static void main(String[] args){
        TreeNode t1 = new TreeNode(3);
        TreeNode t2 = new TreeNode(9);
        TreeNode t3 = new TreeNode(20);
        TreeNode t4 = new TreeNode(16);
        TreeNode t5 = new TreeNode(8);
        TreeNode t6 = new TreeNode(15);
        TreeNode t7 = new TreeNode(7);

        t1.left = t2;
        t1.right = t3;
        t2.left = t4;
        t2.right = t5;
        t3.left = t6;
        t3.right = t7;

        List<List<Integer>> a = levelOrder(t1);
        for(int i = 0; i < a.size(); i++ ){
            System.out.println(a.get(i).toString());
        }

    }

    public static List<List<Integer>> levelOrder(TreeNode root){
        List<List<Integer>> res = new LinkedList<List<Integer>>();
        if (root == null){
            return res;
        }
        Queue<TreeNode> q = new LinkedList<TreeNode>();
        q.offer(root);

        while(!q.isEmpty()){
            int levelNum = q.size();
            List<Integer> subList = new LinkedList<Integer>();
            for(int i = 0; i < levelNum; i++){
                if(q.peek().left != null){
                    q.offer(q.peek().left);
                }
                if(q.peek().right!= null){
                    q.offer(q.peek().right);
                }
                subList.add(q.poll().val);
            }
            res.add(subList);
        }
        return res;
    }
}
