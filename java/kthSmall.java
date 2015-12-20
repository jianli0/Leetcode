import java.util.*;
ublic class kthSmall{
    public static void main(String[] args){
    }
    public static int kthSmallest(TreeNode root, int k){
        ArrayList<Integer> buffer = new ArrayList<Integer>();
        if (root == null)
            return 0;
        inOrder(root, buffer,k);
        return buffer.get(k-1);
    }
    public static void inOrder(TreeNode r, ArrayList a, int k){
        if (a.size() > k){
            return;
        }
        if(r.left != null){
            inOrder(r.left, a , k);
        }
        a.add(r.val);
        if(r.left != null){
            inOrder(r.right, a, k);
        }
    }
}
