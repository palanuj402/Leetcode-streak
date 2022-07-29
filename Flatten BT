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
class Solution 
{
    public void flatten(TreeNode root) 
    {
        //Stack<TreeNode> st = new Stack <>();
        
        //st.push(root);
//         while(!st.empty())
//         {
//             TreeNode cur = st.peek();
//             st.pop();
            
//             if(cur.right!=null)
//                 st.push(cur.right);
//             if(cur.left!=null)
//                 st.push(cur.left);
//             if(!st.empty())
//                 cur.right = st.peek();
            
//             cur.left = null;
//         }

        if(root == null)
            return;
        TreeNode cur = root;
        while(cur!=null)
        {
            if(cur.left!=null)
            {
                if(cur.right!=null)
                {
                    TreeNode n = cur.left;
                    while(n.right!=null)
                        n = n.right;
                    
                    n.right = cur.right;
                }
                cur.right = cur.left;
                cur.left = null;
            }
            cur = cur.right;
        }
    }
}
