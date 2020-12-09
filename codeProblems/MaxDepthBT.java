

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

 

 class MaxDepthBT {

    public int maxDepth(TreeNode root) 
    {

    	// if there is not root there is not tree
       if(root == null) 
       {
        return 0;
       }
        
        //create linked list queue of TreeNodes 
       // this is essential for a BFS
        Queue<TreeNode> queue = new LinkedList<>();
        
        //setting the first node in the queue
        queue.offer(root);
        
        //count for depth is set to zero intially
        int count = 0;
        
        //isEmpty method comes from the parent collections in java
        //do while the queue still has nodes
        while(!queue.isEmpty()) 
        {
            //size method comes from the parent collections in java
            //holding the current size of the queue 
            int size = queue.size();
            
            //while the size is greater than zero
            //also post decrement the size because
            //we will subsequently take out one node 
            while(size-- > 0) {
                
                //retrieve the head of the queue node
                TreeNode node = queue.poll();

                //If the current node has a left node
                if(node.left != null)
                {
                	//push the node to the queue
                    queue.offer(node.left);
                }
                //If the current node has a right node
                if(node.right != null)
                {
                	//push the node to the queue
                    queue.offer(node.right);
                }
            }
            //increase the count for the depth
            count++;
        }
        

        return count;
         
    }


}