package Java.LeetCode.WeeklyContest19;

/**
 * Created by anand on 12/02/17.
 */

import java.util.ArrayList;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

public class q3 {
    public int[] findValueMostElement(TreeNode root) {

        ArrayList<Integer> maxRowElement=new ArrayList<Integer>();
        findValueMostElementRecursion(root,maxRowElement,0);
        int[] result=new int[maxRowElement.size()];

        for (int i = 0; i < maxRowElement.size(); i++) {
            result[i]=maxRowElement.get(i);
        }
        return result;
    }

    private void findValueMostElementRecursion(TreeNode root,ArrayList<Integer> max,int depth) {
        if (root==null){
            return;
        }

        if (max.isEmpty() || max.size()<depth){
            max.add(root.val);
        }

        else {
            if (root.val>max.get(depth)) {
                max.set(depth,root.val);
            }
        }

        findValueMostElementRecursion(root.left,max,depth+1);
        findValueMostElementRecursion(root.right,max,depth+1);
    }
}
