class TreeNode{
    int value;
    TreeNode left;
    TreeNode right;

    TreeNode(int value){
        this.value = value;
        this.left=null;
        this.right=null;
    }
}

public class DepthOfTree {
    int depth(TreeNode root){
        if(root==null){
            return 0;
        }
        int depthLeft = depth(root.left) ;
        int depthRight=depth(root.right);
        return 1+Math.max(depthLeft,depthRight);
    }
    public static void main(String[] args) {
        TreeNode node = new TreeNode(3);
        node.left = new TreeNode(9);
        node.right = new TreeNode(20);
        node.right.left = new TreeNode(15);
        node.right.right = new TreeNode(7);

        DepthOfTree dpt = new DepthOfTree();
        System.out.println("Depth of the given graph is: "+ dpt.depth(node));
    }
}
