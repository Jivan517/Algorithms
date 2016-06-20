package practice.leetcode.easy;

/*nvert a binary tree.

4
/   \
2     7
/ \   / \
1   3 6   9
to
4
/   \
7     2
/ \   / \
9   6 3   1
Trivia:
This problem was inspired by this original tweet by Max Howell:
Google: 90% of our engineers use the software you wrote (Homebrew), but you can’t invert a binary tree on a whiteboard so fuck off.
*/
public class InvertBinaryTree {

	// Definition for a binary tree node.
	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode(int x) {
			val = x;
		}
	}

	public TreeNode invertTree(TreeNode root) {

		if (root == null)
			return null;
		TreeNode tmp = root.left;
		root.left = root.right;
		root.right = tmp;

		if (root.left != null)
			invertTree(root.left);
		if (root.right != null)
			invertTree(root.right);

		return root;
	}

	public void test() {
		TreeNode root = new TreeNode(40);
		TreeNode left = new TreeNode(20);
		TreeNode right = new TreeNode(45);
		root.left = left;
		root.right = right;

		TreeNode inverted = invertTree(root);
		System.out.println("Inverion: " + inverted.left.val);
	}

	public static void main(String[] args) {
		InvertBinaryTree bt = new InvertBinaryTree();
		bt.test();
	}

}
