class ResultType{
    boolean is_bst;
    int maxValue, minValue;

    ResultType(boolean is_bst, int maxValue, int minValue){
        this.is_bst = is_bst;
        this.maxValue = maxValue;
        this.minValue = minValue;
    }
}


public class validBST{
    public static void main(String[] args){
        TreeNode t1 = new TreeNode(5);
        TreeNode t2 = new TreeNode(2);
        TreeNode t3 = new TreeNode(7);
        t1.left = t2;
        t1.right = t3;

        TreeNode t4 = new TreeNode(2147483647);


        TreeNode t5 = new TreeNode(5);
        TreeNode t6 = new TreeNode(7);
        TreeNode t7 = new TreeNode(2);
        t5.left = t6;
        t5.right = t7;

        System.out.println();
        // System.out.println(isValidBST(t1));
        // System.out.println(isValidBST(t4));
        // System.out.println(isValidBST(t5));
    }
    public static boolean isValidBST(TreeNode root){
        return isValidHelper(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }

    public static boolean isValidHelper(TreeNode node, long minKey, long maxKey){
        if (node == null){
            return true;
        }
        if (node.val <= minKey || node.val >= maxKey){
            return false;
        }
        return isValidHelper(node.left, minKey ,node.val) && isValidHelper(node.right,node.val,maxKey);
    }


    // public static boolean isValid1(TreeNode root){
        // ResultType r = isValidBSTHelper(root);
        // return r.is_bst;

    // }
    // public static ResultType isValidBSTHelper1(TreeNode root) {
        // if (root == null){
            // return new ResultType(true,Integer.MIN_VALUE,Integer.MAX_VALUE);
        // }
        // ResultType left = isValidBSTHelper(root.left);
        // ResultType right = isValidBSTHelper(root.right);

        // if (!left.is_bst || ! right.is_bst){
            // return new ResultType(false , 0 , 0);
        // }
        // if (root.left != null && left.maxValue > root.val || root.right != null && right.minValue < root.val){
            // return new ResultType(false , 0 , 0);
        // }
        // return new ResultType(true, Math.max(root.val, right.maxValue), Math.min(root.val, left.minValue));
    // }
}
