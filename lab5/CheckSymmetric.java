class TreeNode {
   int value;
   TreeNode left;
   TreeNode right;

   TreeNode (int val){
    this.value = val;
    this.left=null;
    this.right = null;
   }
}

public class CheckSymmetric{
    boolean isSymmetric(TreeNode root){
    
        if(root==null){
            return true;
        }
        return isMirror(root.left, root.right);
    }

    boolean isMirror(TreeNode left, TreeNode right){
        if(left == null && right == null) return true;
        if(left == null || right == null ) return false;
    
        return (left.value == right.value && isMirror(left.left, right.right) && isMirror(left.right, right.left));
    }

    public static void main(String[] args) {
        
        TreeNode node = new TreeNode(1);
        node.left = new TreeNode(2);
        node.right = new TreeNode(2);
        node.left.left = new TreeNode(3);
        node.left.right = new TreeNode(4);
        node.right.left = new TreeNode(4);
        node.right.right = new TreeNode(3);

        CheckSymmetric cs = new CheckSymmetric();
        System.out.println(cs.isSymmetric(node));
    }
}
