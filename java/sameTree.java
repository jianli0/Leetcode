import java.util.Stack;

public class sameTree{
    public static void main(String[] args){
        TreeNode p1 = new TreeNode(12);
        TreeNode q1 = new TreeNode(12);
        TreeNode p2 = new TreeNode(-60);
        TreeNode q2 = new TreeNode(72);
        p1.left = null;
        p1.right = p2;
        q1.left = null;
        q1.right = q2;


        System.out.println(isSameTree(p1,q1));
    }
    // recursion
    public static boolean isSameTree1(TreeNode p, TreeNode q){
        if (p == null && q == null){
            return true;
        }
        if ((p == null && q !=null) || (p != null && q == null)){
            return false;
        }

        if(p.val == q.val){
            return isSameTree(p.left,q.left) && isSameTree(p.right,q.right);
        }

        return false;
    }

    // iteration
    public static boolean isSameTree(TreeNode p, TreeNode q){
        if (p == null && q == null){
            return true;
        }
        if ((p == null && q !=null) || (p != null && q == null)){
            return false;
        }

        Stack<TreeNode> stackP = new Stack<TreeNode>();
        Stack<TreeNode> stackQ = new Stack<TreeNode>();

        stackP.push(p);
        stackQ.push(q);

        while(!stackP.isEmpty() && !stackQ.isEmpty()){
            TreeNode popP = stackP.pop();
            TreeNode popQ = stackQ.pop();
            if (popP.val != popQ.val){
                System.out.println("return here 1");
                return false;
            }else{
                if((popP.left != null) && (popQ.left != null)){
                    stackP.push(popP.left);
                    stackQ.push(popQ.left);
                }else if(popP.left == null && popQ.left == null){
                }else{
                    return false;
                }

                if((popP.right!= null) && (popQ.right!= null)){
                    stackP.push(popP.right);
                    stackQ.push(popQ.right);
                }else if(popP.right == null && popQ.right == null){
                }else{
                    return false;
                }
            }
        }

        // System.out.println("return here 2");
        // System.out.println(stackP.isEmpty());
        // System.out.println(stackQ.isEmpty());
        return stackP.isEmpty() && stackQ.isEmpty();
    }
}
