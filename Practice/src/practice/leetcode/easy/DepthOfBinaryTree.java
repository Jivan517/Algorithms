package practice.leetcode.easy;

/*Given a binary tree, find its maximum depth.

The maximum depth is the number of nodes along the longest path from the root node down to the farthest leaf node.
*/
public class DepthOfBinaryTree {

	// Definition for a binary tree node.
	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode(int x) {
			val = x;
		}
	}

	public int maxDepth(TreeNode root) {
		if (root == null)
			return 0;

		int lt = maxDepth(root.left);
		int rt = maxDepth(root.right);

		if (lt > rt)
			return lt + 1;
		else
			return rt + 1;
	}

	public void test() {
		TreeNode root = new TreeNode(40);
		TreeNode left = new TreeNode(20);
		TreeNode right = new TreeNode(45);
		root.left = left;
		root.right = right;

		System.out.println("Max Depth: " + maxDepth(root));
	}

	public static void main(String[] args) {

		DepthOfBinaryTree bt = new DepthOfBinaryTree();
		bt.test();
	}

}
