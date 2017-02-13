package Java.LeetCode.WeeklyContest19;

/**
 * Created by anand on 12/02/17.
 */
/**
 * Definition for a binary tree node.
 */
class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }
class LeftMost{
    int leftMostValue;
    int leftMostDepth;
}

public class q2 {
    public static void main(String[] args) {
        TreeNode node=new TreeNode(1);
        q2 q=new q2();
        q.findLeftMostNode(node);
    }
    public int findLeftMostNode(TreeNode root) {
        LeftMost node=new LeftMost();
        node.leftMostDepth=0;
        node.leftMostValue=root.val;
        findLeftMostNodeRecursion(root,node,0);
        return node.leftMostValue;
    }

    private void findLeftMostNodeRecursion(TreeNode root, LeftMost node, int depth) {
        if (root==null){
            return;
        }

        if (depth>node.leftMostDepth){
            node.leftMostValue=root.val;
            node.leftMostDepth=depth;
        }

        findLeftMostNodeRecursion(root.left,node,depth+1);
        findLeftMostNodeRecursion(root.right,node,depth+1);
    }

}
