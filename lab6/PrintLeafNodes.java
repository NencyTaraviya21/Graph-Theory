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
public class PrintLeafNodes {

    void findLeafNode(TreeNode root){
        if(root==null){
            return;
        }
        if(root.left == null && root.right==null){
            System.out.println(root.value);
            return;
        }
        findLeafNode(root.left);
        findLeafNode(root.right);
    }
    public static void main(String[] args) {
        TreeNode node = new TreeNode(3);
        node.left = new TreeNode(9);
        node.right = new TreeNode(20);
        node.right.left = new TreeNode(15);
        node.right.right = new TreeNode(7);

        PrintLeafNodes leafNodes = new PrintLeafNodes();
       leafNodes.findLeafNode(node);
    }
}
