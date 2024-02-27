/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {


    public int diameterOfBinaryTree(TreeNode root) {
       int [] max=new int[1];
       diameterOfBinaryTree( root,max) ;
       return max[0];


    }  
    
     public int diameterOfBinaryTree(TreeNode root,int[] max) {

      if(root==null)
         return 0;

      int lh=diameterOfBinaryTree(root.left,max);
      int rh=diameterOfBinaryTree(root.right,max);
       max[0]=Math.max(max[0],lh+rh);

      return 1+Math.max(lh,rh);

    }
}