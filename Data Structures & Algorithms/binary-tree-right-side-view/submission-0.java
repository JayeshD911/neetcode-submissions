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
    public void dfs(TreeNode root, int depth , List<Integer> ans){
        if(root == null ) return;

        //if depth == ans size, it means that it is the first entry for that depth.
        //if depth < ans size, it means that the value for that depth is already added in the ans array.
        if (depth == ans.size()) ans.add(root.val);

        //traverse right node first 
        dfs( root.right , depth + 1 , ans);
        dfs( root.left , depth + 1 , ans);
    }
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> ans = new ArrayList<Integer>();
        dfs(root, 0 , ans);
        return ans;   
    }
}

// class Solution {
//     public List<Integer> rightSideView(TreeNode root) {
//         List<Integer> ans = new ArrayList<>();

//         if( root == null) return ans;

//         Queue<TreeNode> q = new LinkedList<>();
//         q.offer(root);

//         while(!q.isEmpty()){
//             int size = q.size();
//             for (int i = 0 ; i< size ; i++){
//                 TreeNode node = q.poll();

//                 if (i == size -1) ans.add(node.val);  //last element  in the queue will be the rightmost node
                
//                 if (node.left != null) q.offer(node.left);
//                 if (node.right != null) q.offer(node.right);
//             }
//         }
//         return ans;
//     }
// }