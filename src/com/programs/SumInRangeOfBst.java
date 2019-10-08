package com.programs;


 class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }
 
public class SumInRangeOfBst {
	
	public static void main(String args[])
	{
		int sum = 0;
		TreeNode root = null;
		root = insert(root, 10);
		insert(root, 5);
		insert(root, 15);
		insert(root, 3);
		insert(root, 7);
		insert(root, 18);
		System.out.println(dfs(root, 7, 15, sum));
	}
    public int rangeSumBST(TreeNode root, int L, int R) {
        int ans = 0;
        int sum = dfs(root, L, R, ans);
        return sum;
        
    }
    
    public static int dfs(TreeNode node, int L, int R, int ans) {
        if (node != null) {
            if (L <= node.val && node.val <= R)
                ans += node.val;
            if (L < node.val)
                dfs(node.left, L, R, ans);
            if (node.val < R)
                dfs(node.right, L, R, ans);
        }
        return ans;
    }
    
    static TreeNode insert(TreeNode root, int key)  
    {  
        TreeNode newnode = new TreeNode(key);  
        TreeNode x = root;  
        TreeNode y = null;  
        while (x != null) {  
            y = x;  
            if (key < x.val)  
                x = x.left;  
            else
                x = x.right;  
        }  
        
        if (y == null)  
            y = newnode;  
        else if (key < y.val)  
            y.left = newnode;  
        else
            y.right = newnode;  
        return y;  
    }  
}