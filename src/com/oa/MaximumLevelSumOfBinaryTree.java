package com.oa;

import javax.swing.tree.TreeNode;
import java.util.LinkedList;
import java.util.Queue;

public class MaximumLevelSumOfBinaryTree {
    //This code has been tested || Working
    //https://leetcode.com/problems/maximum-level-sum-of-a-binary-tree/


     public class TreeNode {
           int val;
           TreeNode left;
           TreeNode right;
           TreeNode(int x) { val = x; }
     }


        public int maxLevelSum(TreeNode root) {

            Queue<TreeNode> q= new LinkedList();

            q.offer(root);

            int maxSum=-99999;
            int index=1;
            int maxindex=index;
            while(!q.isEmpty()){
                int size= q.size();
                int sum=0;
                while(size-->0){
                    TreeNode node= q.poll();
                    sum+=node.val;
                    if(node.left!=null){
                        q.offer(node.left);
                    }
                    if(node.right!=null){
                        q.offer(node.right);
                    }
                }
                if(sum>maxSum){
                    maxSum=sum;
                    maxindex=index;

                }
                index++;
            }
            return maxindex;
        }

}
